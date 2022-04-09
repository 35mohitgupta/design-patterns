package com.ssm.strategy.strategy;


import com.ssm.strategy.strategy.fly.FlyNoWay;
import com.ssm.strategy.strategy.quack.MuteQuack;
import com.ssm.strategy.strategy.quack.Squeak;

public class WoodenDuck extends Duck {

    public WoodenDuck() {
        super(new FlyNoWay(), new MuteQuack());
    }

    @Override
    protected void display() {
        System.out.println("Wooden RubberDuck");
    }

}
