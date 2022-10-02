package com.kienlt.qsv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/books")
public class GetProductController {

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public String getContent(){
        return "Hello toi da goi vao day";
    }
}
