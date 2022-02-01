# DesignPatterns
###### Techniques &amp; Mechanisms for Software Development - Design Patterns course
&nbsp;

## Implemented patterns:

- ### Behavioral:
    - #### Iterator:
        The iterator pattern provides a way to access the elements of an aggregate object without exposing its underlying representation.
    - #### Observer:
        Observer pattern is used when there is one-to-many relationship between objects such as if one object is modified, its depenedent objects are to be notified automatically. Observer pattern falls under behavioral pattern category.
    - #### Template: 
        Template method design pattern is to define an algorithm as a skeleton of operations and leave the details to be implemented by the child classes. The overall structure and sequence of the algorithm are preserved by the parent class. 

- ### Creational:
    - #### Builder:
        Builder is a creational design pattern that lets you construct complex objects step by step. The pattern allows you to produce different types and representations of an object using the same construction code.
    - #### Factory:
        A Factory Pattern or Factory Method Pattern says that just define an interface or abstract class for creating an object but let the subclasses decide which class to instantiate. In other words, subclasses are responsible to create the instance of the class.
    - #### Prototype: 
        Prototype design pattern is used when the Object creation is a costly affair and requires a lot of time and resources and you have a similar object already existing. Prototype pattern provides a mechanism to copy the original object to a new object and then modify it according to our needs.

- ### Structural:
    - #### Bridge:
        Bridge is used when we need to decouple an abstraction from its implementation so that the two can vary independently. This type of design pattern comes under structural pattern as this pattern decouples implementation class and abstract class by providing a bridge structure between them.
    - #### Decorator:
        Decorator is a structural design pattern that lets you attach new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors.
    - #### Facade: 
        Facade is a structural design pattern that provides a simplified interface to a library, a framework, or any other complex set of classes.