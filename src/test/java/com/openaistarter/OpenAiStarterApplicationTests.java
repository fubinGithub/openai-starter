package com.openaistarter;

import com.openaistarter.service.OpenAiService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OpenAiStarterApplicationTests {

    @Autowired
    private OpenAiService openAiService;

    @Test
    void contextLoads() {

        String massTest = openAiService.sendMassTest("你好");



    }

}
