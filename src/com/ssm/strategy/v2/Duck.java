package com.ssm.strategy.v2;

public abstract class Duck {

    protected void quack(){
        System.out.println("quack...");
    }

    protected void swim(){
        System.out.println("swimming...");
    }

    protected abstract void display();

}
