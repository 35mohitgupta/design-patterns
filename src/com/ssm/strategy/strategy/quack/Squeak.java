package com.ssm.strategy.strategy.quack;


public class Squeak implements QuackBehaviour {
    @Override
    public void performQuack() {
        System.out.println("Squeak...");
    }
}
