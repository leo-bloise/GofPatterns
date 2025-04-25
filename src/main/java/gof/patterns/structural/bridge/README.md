# Bridge
The bridge design pattern helps us to handle exponential growing of our classes and subclasses. It separates the abstraction layer from the implementation layer. In this case, when we talk about abstraction and implementation, we're not talking about interfaces or abstract classes, but a high-level layer that controls a lower level layer. 

The best example is Desktop Programs. Usually, they have a Graphical User Interface and we use it to execute one or more operations. These operations are carried out by the operational system. The GUI is an abstraction while the API's provided by the O.S are the real implementation.

## Current Implementation
The current implementation in this repository does not use the example from [Refactoring Guru](http://refactoring.guru/design-patterns/factory-method).