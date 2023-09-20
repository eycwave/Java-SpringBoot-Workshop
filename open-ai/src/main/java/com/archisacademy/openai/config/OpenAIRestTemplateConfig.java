package com.archisacademy.openai.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@Configuration
public class OpenAIRestTemplateConfig {

    @Value("${openai.api.key}")
    private String OPEN_AI_API_KEY;
    // !!! You need to fill in the API Key in the application.properties file.
    // !!! You can get this API Key from the OpenAI website.

    @Bean
    @Qualifier("openAiRestTemplate")
    public RestTemplate openAiRestTemplate(){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getInterceptors()
                .add((request, body, execution) -> {
                    request.getHeaders()
                            .add("Authorization", "Bearer "+OPEN_AI_API_KEY);
                    return execution.execute(request,body);
                });
        return restTemplate;
    }
}
