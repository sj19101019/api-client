package com.soonj.apiclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.soonj.apiclient.service.MessageService;

import lombok.RequiredArgsConstructor;

@RefreshScope
@RestController
@RequestMapping("message")
@RequiredArgsConstructor
public class MessageController {
	@Value("${message}")
	private String message;
	@Value("${server.port}")
	private String port;
	
	private final MessageService messageService;

	@RequestMapping("/message")
	public String message(@RequestParam String name) {
		return String.join(" ", this.message, name, port);
	}
	
	@GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return messageService.hiService( name );
    }
}
