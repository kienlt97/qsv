package com.kienlt.qsv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("books")
public class GetProductController {

    @GetMapping("/all")
    public String getContent(){
        return "Hello toi da goi vao day";
    }
}
