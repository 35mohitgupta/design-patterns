package com.ssm.strategy.strategy;

import com.ssm.strategy.strategy.fly.FlyingBehaviour;
import com.ssm.strategy.strategy.quack.QuackBehaviour;
import com.ssm.strategy.v2.Quackable;

public abstract class Duck {

    private FlyingBehaviour flyingBehaviour;
    private QuackBehaviour quackBehaviour;

    public Duck(FlyingBehaviour flyingBehaviour, QuackBehaviour quackBehaviour){
        this.flyingBehaviour = flyingBehaviour;
        this.quackBehaviour = quackBehaviour;
    }

    public void quack(){
        quackBehaviour.performQuack();
    }

    public void fly(){
        flyingBehaviour.performFly();
    }

    public void swim(){
        System.out.println("Swimming...");;
    }

    protected  abstract void display();


    public void setFlyingBehaviour(FlyingBehaviour flyingBehaviour) {
        this.flyingBehaviour = flyingBehaviour;
    }


    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
