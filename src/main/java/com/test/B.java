package com.test;

import org.springframework.stereotype.Component;

@Component
public class B {
	public B() {
		System.out.println("creating bean B: " + this);
	}
}
