package com.ssm.strategy.v1;

public class RubberDuck extends Duck{

    protected void quack(){
        System.out.println("Squeak...");
    }

    @Override
    protected void display() {
        System.out.println("Displaying RubberDuck");
    }
}
