package com.ssm.strategy.v2;


public class RubberDuck extends Duck implements Quackable{

    @Override
    public void quack() {
        System.out.println("Squeak...");
    }

    @Override
    protected void display() {
        System.out.println("Displaying RubberDuck");
    }

}
