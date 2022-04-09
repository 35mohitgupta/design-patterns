# Duck Game

Has a variety of ducks which different capabilities-
1. quack
2. swim
3. display

Later on we got the new requirements that SOME NOT ALL ducks can fly.
We will see how different approaches can handle.

## Strategy Design Pattern

    It  defines a family of algorithms (like FlyingBehaviour, QuackBehaviour), encapsulates each one, and make them interchangable. 
    Strategy lets the algorithm vary independently from the clients that use it.
    Example, FlyingWithWings behaviour can vary independent of the classes like MallardDuck, RedheadDuck, etc.


## Design Principles

###1. Encapsulate what varies
    Identiy the aspects of the application that vary and separate them from what statys the same.
    Why???
    So that if later we alter or extend the part that vary without affecting those that don't vary.
    This reduces introducing new bugs and regression testing.

###2. Favour Composition over Inheritance
    Composition provides us more flexibility. It lets us change the behaviour at runtime.

###3. Program to interface, not an implementation
    Provides more flexibility. Opens the class for polymorphism.