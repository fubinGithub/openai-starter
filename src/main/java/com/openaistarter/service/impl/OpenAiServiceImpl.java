package com.openaistarter.service.impl;

import com.openaistarter.service.OpenAiService;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * @author 30778
 */
@Service
public class OpenAiServiceImpl implements OpenAiService {

    @Autowired
    private OkHttpClient okHttpClient;
    /**
     * 发送信息测试
     *
     * @return
     */
    @Override
    public String sendMassTest() {

        HashMap<String, String> requestBody = new HashMap<>();
        requestBody.put("Authorization","Bearer");
        return "massTest ";
    }

}
