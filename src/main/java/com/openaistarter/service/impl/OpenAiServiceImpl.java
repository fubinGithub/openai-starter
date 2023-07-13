package com.openaistarter.service.impl;

import com.openaistarter.constant.OpenAiConstants;
import com.openaistarter.service.OpenAiService;
import okhttp3.OkHttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author 30778
 */
@Service
public class OpenAiServiceImpl implements OpenAiService {

    @Autowired
    private OkHttpClient okHttpClient;
    @Autowired
    private RestTemplate restTemplate;

    /**
     * 发送信息测试
     *
     * @return
     */
    @Override
    public String sendMassTest(String data) {

        // 设置请求头
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Content-Type", "application/json");
        httpHeaders.add("Authorization", OpenAiConstants.OPEN_AI_KEY);

        // 设置请求体
        String requestJson = String.format(
                "{\n" +
                        "    \"model\": \"text-davinci-003\",\n" +
                        "     \"prompt\": \"%s\",\n" +
                        "      \"temperature\": 0, \n" +
                        "      \"max_tokens\": 2048\n" +
                        "}",data
        );

        HttpEntity<String> httpEntity = new HttpEntity<>(requestJson,httpHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(OpenAiConstants.OPEN_AI_URL, HttpMethod.POST, httpEntity, String.class);

        System.out.println(responseEntity.getStatusCode());
        System.out.println(responseEntity.getBody());

        return "success";
    }

}
