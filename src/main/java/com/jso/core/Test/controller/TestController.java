package com.jso.core.Test.controller;

import org.springframework.stereotype.Component;

@Component
public class TestController {
	public String sayHello(final String name) {
		return "Hello " + name + " !";
	}
}
