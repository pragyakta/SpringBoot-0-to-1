package com.example.CakeBaker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CakeBaker {
    private final Frosting frosting;
    private final Syrup syrup;

    // Constructor-based Dependency Injection
    @Autowired
    public CakeBaker(@Qualifier("chocolateFrosting") Frosting frosting, @Qualifier("strawberrySyrup") Syrup syrup) {
        this.frosting = frosting;
        this.syrup = syrup;
    }

    public void bakeCake() {
        System.out.println("Baking a cake with " + frosting.getFrostingType() + " and " + syrup.getSyrupType());
    }
}
