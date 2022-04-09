package com.ssm.strategy.strategy;


import com.ssm.strategy.strategy.fly.FlyWithWings;
import com.ssm.strategy.strategy.fly.FlyingBehaviour;
import com.ssm.strategy.strategy.quack.Quack;
import com.ssm.strategy.strategy.quack.QuackBehaviour;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        super(new FlyWithWings(), new Quack());
    }

    @Override
    protected void display() {
        System.out.println("Displaying...  RedheadDuck");
    }
}
