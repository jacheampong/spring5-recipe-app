package com.spring.japroject.recipe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jacheampong
 */
@Controller
public class IndexController {

    @RequestMapping({"", "/", "/index"})
    public String showIndex() {

        return "index";
    }
}
