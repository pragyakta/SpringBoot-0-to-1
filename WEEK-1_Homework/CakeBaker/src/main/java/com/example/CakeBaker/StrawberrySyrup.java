package com.example.CakeBaker;

import org.springframework.stereotype.Component;

// Strawberry Syrup Implementation
@Component("strawberrySyrup")
public class StrawberrySyrup implements Syrup {
	@Override
	public String getSyrupType() {
		return "Strawberry Syrup";
	}
}
