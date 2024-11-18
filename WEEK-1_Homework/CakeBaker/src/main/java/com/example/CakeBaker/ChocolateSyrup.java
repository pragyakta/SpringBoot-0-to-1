package com.example.CakeBaker;

import org.springframework.stereotype.Component;

@Component("chocolateSyrup")
public class ChocolateSyrup implements Syrup {
	@Override
	public String getSyrupType() {
		return "Chocolate Syrup";
	}
}
