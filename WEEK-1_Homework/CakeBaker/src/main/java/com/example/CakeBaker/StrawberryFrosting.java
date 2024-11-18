package com.example.CakeBaker;

import org.springframework.stereotype.Component;

// Strawberry Frosting Implementation
@Component("strawberryFrosting")
public class StrawberryFrosting implements Frosting {
	@Override
	public String getFrostingType() {

		return "Strawberry Frosting";
	}
}
