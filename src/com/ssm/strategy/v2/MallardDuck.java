package com.ssm.strategy.v2;


public class MallardDuck extends Duck implements Flyable, Quackable {

    @Override
    protected void display() {
        System.out.println("Displaying... MallardDuck");
    }

    @Override
    public void fly() {
        System.out.println("Flying");
    }

    @Override
    public void quack() {
        System.out.println("Quack...");
    }
}
