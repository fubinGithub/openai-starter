package com.openaistarter.controller;


import com.openaistarter.service.OpenAiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 30778
 */
@RestController
@RequestMapping
public class OpenAiController {

    @Autowired
    private OpenAiService openAiService;

    @GetMapping
    public String getTest(){

        return openAiService.sendMassTest("你好");
    }

}
