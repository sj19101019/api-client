package com.soonj.apiclient.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MessageService {
	private final RestTemplate restTemplate;
	
	public String hiService(String name) {
        return restTemplate.getForObject("http://api-client/message/message?name=" + name, String.class);
    }
}
