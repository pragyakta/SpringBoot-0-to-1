package com.example.CakeBaker;

import org.springframework.stereotype.Component;

// Chocolate Frosting Implementation
@Component("chocolateFrosting")
public class ChocolateFrosting implements Frosting {
	@Override
	public String getFrostingType() {
		return "Chocolate Frosting";
	}
}
