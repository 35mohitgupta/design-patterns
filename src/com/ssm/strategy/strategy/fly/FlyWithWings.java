package com.ssm.strategy.strategy.fly;

public class FlyWithWings implements FlyingBehaviour{

    @Override
    public void performFly() {
        System.out.println("Flying...");
    }
}
