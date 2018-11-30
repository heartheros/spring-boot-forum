DROP TABLE IF EXISTS `T_VERIFICATION_TOKEN`;
DROP TABLE IF EXISTS `T_COMMENT`;
DROP TABLE IF EXISTS `T_POST`;
DROP TABLE IF EXISTS `T_USER`;
DROP TABLE IF EXISTS `T_CATEGORY`;

CREATE TABLE `T_USER` (
  `id`                     BIGINT       NOT NULL AUTO_INCREMENT,
  `username`               VARCHAR(255) NOT NULL,
  `password`               VARCHAR(255) NOT NULL,
  `email`                  VARCHAR(255) NOT NULL,
  `activated`              TINYINT(1)   NOT NULL DEFAULT 1,
  `date_created`           DATETIME     NOT NULL,
  `avatar_location`        VARCHAR(255) DEFAULT 'avatar/default_avatar.png',
  `bio`                    VARCHAR(255),
  `roles`                  VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `T_CATEGORY` (
  `id`                 BIGINT       NOT NULL AUTO_INCREMENT,
  `weight`             INT          NOT NULL,
  `name`               VARCHAR(255) NOT NULL,
  `display_name`       VARCHAR(255) NOT NULL,
  `username`           VARCHAR(255),
  `date_created`       DATETIME     NOT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `T_POST` (
  `id`                 BIGINT       NOT NULL AUTO_INCREMENT,
  `title`              VARCHAR(255) NOT NULL,
  `body`               TEXT,
  `date_created`       DATETIME     NOT NULL,
  `user_id`            BIGINT,
  `category_id`        BIGINT,
  `comment_count`      INT DEFAULT 0,
  `hit_count`          BIGINT,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`category_id`)  REFERENCES T_CATEGORY(`id`),
  FOREIGN KEY (`user_id`)      REFERENCES T_USER(`id`)
);

CREATE TABLE `T_COMMENT` (
  `id`                  BIGINT       NOT NULL AUTO_INCREMENT,
  `body`                TEXT         NOT NULL,
  `post_id`             BIGINT       NOT NULL,
  `user_id`             BIGINT       NOT NULL,
  `date_created`        DATETIME     NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`user_id`)      REFERENCES T_USER(`id`),
  FOREIGN KEY (`post_id`)      REFERENCES T_POST(`id`)
);

CREATE TABLE `T_VERIFICATION_TOKEN` (
  `id`                  BIGINT       NOT NULL AUTO_INCREMENT,
  `token`               TEXT         NOT NULL,
  `user_id`             BIGINT       NOT NULL,
  `expiry_date`         DATETIME     NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`user_id`)      REFERENCES T_USER(`id`)
);

#add for recuritment test project
use db_springboot_forum;

drop table IF EXISTS r_user;
create table r_user(
id 	                int not null auto_increment comment '用户id',
nickname	           varchar(30) not null comment '用户昵称',
name	               varchar(30) comment '用户姓名',
crdt_type	           char(2) comment '证件类型',
crdt_num	           varchar(40) comment '证件号码',
phone_num	           varchar(50) comment '电话',
address	             varchar(255) comment '住址',
email	               varchar(80) comment '邮箱地址',
busi_type_user	     char(2)  not null default '00' comment '网站归类 ',
rmt_amt              decimal(19,2) comment '个人余额',
remark1	             varchar(80) comment '个人标签1',
remark2	             varchar(80) comment '个人标签2',
remark3	             varchar(80) comment '个人标签3',
 primary key(id)
);
alter table r_user add unique(nickname);

drop table if exists r_company ;

create table r_company(
id 	                 int not null auto_increment comment '公司id',
nickname	           varchar(30) not null comment '公司昵称',
name	               varchar(80) comment '公司名',
crdt_code	           varchar(30)  comment '单位信用代码',
legal_name	           varchar(30)  comment '法人',
mobile	           varchar(50)  comment '电话',
phone_num	           varchar(50)  comment '电话',
address	             varchar(255) comment '住址',
email	               varchar(80) comment '邮箱地址',
field               char(2) comment '公司行业性质',
size                char(2) comment '公司规模人数',
regicapital        int comment '注册资金万元',
rmt_amt              decimal(19,2) comment '公司余额',
type                 char(4) not null default '0006' comment '单位类型',
busi_type_comp	     char(2)  not null default '00' comment '网站归类 ',
primary key(id)
);
alter table r_company add unique(nickname);

drop table if exists r_job ;

create table r_job(
id            int not null auto_increment comment '职位id',
comp	           int not null comment '发布公司id',
post_date	               date comment '发布日期',
expiry_date	           date  comment '到期日期',
title	           varchar(60)  comment '职位名称',
location        varchar(100) comment '职位所属地点',
jobtype          char(2) comment '职位类型大类',
abstract	           varchar(200)  comment '职位摘要',
content	             varchar(4096) comment '职位描述',
phone_num	               varchar(50) comment '电话',
email                 varchar(80) not null default '0006' comment '邮箱地址',
busi_type_job	     char(2)  not null default '00' comment '网站归类 ',
primary key(id)
);
alter table r_job add index COMPANY_INDEX(comp);

drop table if exists r_apply ;

create table r_apply(
userid int not null comment '用户id',
jobid  int not null comment '职位id',
apply_date date not null comment '申请日期',
apply_status char(1) not null default '0' comment '申请状态',
compId  int not null comment '公司id'
);
alter table r_apply add primary key(userid,jobid,apply_date);
alter table r_apply add index COMPANY_INDEX(compId);

drop table if exists r_post ;
create table r_post(
id int not null auto_increment comment '文章id',
category      char(2) not null default '00' comment '文章类别',
title	      varchar(90) not null comment '标题',
subtitle	  varchar(90) not null comment '副标题',
content      blob not null comment 'html内容',
postdate	    date not null comment '发布日期',
posttime	   	timestamp(3) default current_timestamp(3) comment '发布时间',
editdate	    date not null comment   '编辑日期',
edittime	    timestamp(3)  default current_timestamp(3) on update current_timestamp(3) comment '编辑时间',
author	      varchar(30) not null comment  '作者昵称',
reviewer	    varchar(30) not null comment '审核者昵称',
postsource	      varchar(80) not null comment  '来源',
clickcount	  int comment  '点击次数',
collectcount int comment '收藏次数',
comments	    char(1) not null comment '用可评论标识',
primary key(id)
);
alter table r_post add index CATEGORY_INDEX(category);
alter table r_post add index DATE_INDEX(postdate);

drop table if exists r_comment ;
create table r_comment(
id int not null auto_increment comment '评论ID',
content		varchar(4096) comment 'html内容',
postid		int not null comment '文章id',
userid		int not null comment '用户id',
commentsn	int comment '评论序号',
createdate date comment '创建日期',
createtime timestamp(3) default current_timestamp(3) comment '发布时间',
PRIMARY KEY (`id`)
);
alter table r_comment add index userid_INDEX(userid);
alter table r_comment add index postid_INDEX(postid);

drop table if exists r_token ;
create table r_token(
id int not null auto_increment comment '令牌序号',
token varchar(512) comment '令牌',
userid int not null comment '用户id',
expirydate date default '2099-12-30' comment '令牌到期日',
PRIMARY KEY (`id`)
);

drop table if exists r_param ;
create table r_param(
id int not null auto_increment comment '参数id',
param_name varchar(30) comment '参数名称',
param_value varchar(80) comment '参数值',
PRIMARY KEY (`id`)
);
alter table r_param add unique(param_name);

drop table if exists r_usercharge;
create table r_usercharge(
id int not null auto_increment comment '充值id',
chargedate date not null comment '充值日期',
chargeid int not null comment '用户id',
chargetime timestamp(3) default current_timestamp(3) comment '充值时间',
chargeamt  decimal(19,2) comment '充值金额',
PRIMARY KEY (`id`)
);
alter table r_usercharge add index charge_userIndex(chargeid,chargedate);

drop table if exists r_companycharge;
create table r_companycharge(
id int not null auto_increment comment '充值id',
chargedate date not null comment '充值日期',
chargeid int not null comment '公司id',
chargetime timestamp(3) default current_timestamp(3) comment '充值时间',
chargeamt  decimal(19,2) comment '充值金额',
PRIMARY KEY (`id`)
);
alter table r_companycharge add index charge_companyIndex(chargeid,chargedate);
commit;
