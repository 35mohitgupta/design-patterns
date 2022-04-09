# Duck Game

Has a variety of ducks which different capabilities-
1. quack
2. swim
3. display

Later on we got the new requirements that SOME NOT ALL ducks can fly.
We will see how different approaches can handle.

## Design Principles

###1. Encapsulate what varies
    Identiy the aspects of the application that vary and separate them from what statys the same.
    Why???
    So that if later we alter or extend the part that vary without affecting those that don't vary.
    This reduces introducing new bugs and regression testing.

###2. 