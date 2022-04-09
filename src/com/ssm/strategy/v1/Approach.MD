# Initial Approach

### We inherit the default implementation and if needed we override.

## Advantages

1. We are re-using the parent class implementation.

## Disadvantages

1. Adding behavior like fly() here, causing all the ducks,
even those who can't fly, to have fly behaviour.
2. Maintenance issues may arise