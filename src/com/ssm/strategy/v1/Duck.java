package com.ssm.strategy.v1;

public abstract class Duck {

    protected void quack(){
        System.out.println("quack...");
    }

    protected void swim(){
        System.out.println("swimming...");
    }

    protected abstract void display();

    //This is a new requirement after we released our Duck Game
    protected void fly(){
        System.out.println("flying...");
    }
}
