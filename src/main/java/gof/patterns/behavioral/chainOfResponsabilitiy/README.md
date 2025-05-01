# Chain of Responsibility
The chain of responsibility pattern is a design pattern that receives a request and pass it to a chain of objects. It follows the same strucutre of a Linked List where one node of the list holds a reference to the next one. Each handler can handle it, pass it to the next handler or throw an exception.

This pattern is very used for, example, in APIs WEB.

## Current Implementation
The current implementation in this repository does not uses the example from [Refactoring Guru](http://refactoring.guru/design-patterns/factory-method).