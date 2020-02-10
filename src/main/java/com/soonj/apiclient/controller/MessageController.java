package com.soonj.apiclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("message")
public class MessageController {
	@Value("${message}")
	private String message;

	@RequestMapping("/message")
	public String message() {
		return this.message;
	}
}
