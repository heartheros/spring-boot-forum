package com.qingwenwei.web.controller;

import com.qingwenwei.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

public class IndexController {

    @Autowired
    private PostService postService;

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String getHomePostsByPage(Model model,
                                     @RequestParam(value = "p", required = false, defaultValue="1") Integer pageNum,
                                     @RequestParam(value = "size", required = false, defaultValue="10") Integer pageSize) {
        Map<String, Object> attributes = this.postService.findPostsByPage(pageNum, pageSize);
        if (null == attributes) {
            return "error/404";
        }
        model.addAllAttributes(attributes);
        return "job/index";
    }

    @RequestMapping(value = "/403", method = RequestMethod.GET)
    public String forbidden() {
        return "error/403";
    }

}
