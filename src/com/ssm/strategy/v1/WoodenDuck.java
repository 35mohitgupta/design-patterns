package com.ssm.strategy.v1;

public class WoodenDuck extends Duck{

    //can't quack
    protected void quack(){
    }

    @Override
    protected void display() {
        System.out.println("Wooden RubberDuck");
    }

    //can't fly
    protected void fly(){
    }
}
