package com.ssm.strategy.strategy.fly;

public class FlyNoWay implements FlyingBehaviour{
    @Override
    public void performFly() {
        System.out.println("Can't fly...");
    }
}
