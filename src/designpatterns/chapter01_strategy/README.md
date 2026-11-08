# Duck sim app

## Problem with inheritance

- Problem started when we created a class `class Duck` that and subclasses `class MallardDuck` and `class RedHeadDuck` 
and were going to introduce new type of duck called `class DecoyDuck`.
- Since `DecoyDuck` can't fly(), we will need to override fly() method inside subclass `DecoyDuck`; also decoy ducks 
can't quak so will need to override that as well. 
- Since requirement will keep changing over the year, this isn't right approach.
- So we need a way to **make only some (but not all)** of the types of duck to fly or quak.

### Solution 1:
- Create quakable() and flyable() interfaces - this way only ducks that do fly will be flyable(), etc.
- But java interfaces have no implementations so **no reuse of code**, we will need to override the fly()
method again and again in each subclass.

### Solution 2:
- **Separate what changes from what stays the same**
- We know fly and quak are parts of Ducks class that vary across ducks.To separate these behaviors from the Duck class,
we’ll pull both methods out of the Duck class and create a new set of classes to represent each behavior.
- These new classes whose entire reason for living is to represent behaviour e.g: squeaking, flyingwithwings, etc. i.e.
it is behaviour class.
- **Favor composition over inheritance**
- Instead of having RedheadDuck implement Flyable directly and write fly code inside every duck class, we will 
  1. Create a FlyBehavior interface
  2. Create concrete flying behaviors (like FlyWithWings or FlyNoWay).
  3. Give Duck an instance variable of type FlyBehavior.
  4. Initialize that behavior inside RedheadDuck's constructor
- Program to an interface, not an implementation: Declare variable types as interface/abstract types 
(e.g., FlyBehavior flyBehavior), not concrete implementations (e.g., FlyWithWings flyBehavior). 
  - This decouples your client code from specific implementations.
- Favor composition over inheritance: Has-a is better than Is-a. Building classes by composing them with behavior 
objects makes systems far more flexible, maintainable, and dynamic than rigid class hierarchies.

# Defination of strategy pattern:

The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable.
Strategy lets the algorithm vary independently from clients that use it.

# Key architecture and structure:

```declarative
+-------------------+            +-------------------+
|      Context      |  has-a     |     Strategy      | (Interface)
|      (Duck)       |----------->|   (FlyBehavior)   |
+-------------------+            +-------------------+
| + performFly()    |                      ^
+-------------------+                      |
                                  +-----------------+-----------------+
                                  |                                   |
                       +-------------------+               +-------------------+
                       | ConcreteStrategyA |               | ConcreteStrategyB |
                       |  (FlyWithWings)   |               |    (FlyNoWay)     |
                       +-------------------+               +-------------------+
```