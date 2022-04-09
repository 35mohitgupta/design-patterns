package com.ssm.strategy.strategy;


import com.ssm.strategy.strategy.fly.FlyNoWay;
import com.ssm.strategy.strategy.fly.FlyWithWings;
import com.ssm.strategy.strategy.fly.FlyingBehaviour;
import com.ssm.strategy.strategy.quack.Quack;
import com.ssm.strategy.strategy.quack.QuackBehaviour;
import com.ssm.strategy.strategy.quack.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        super(new FlyNoWay(), new Squeak());
    }

    @Override
    protected void display() {
        System.out.println("Displaying RubberDuck");
    }

}
