# Proxy
The proxy pattern is a design pattern that improve access control and management of other objects. The proxy object must follow the same interface of the target object.  Then, when a client requests an object of that interface, we'd give them the proxy. In the end, we'll end up delegating the real job to the target object, but we can perform some actions after or before it.

## Current Implementation
The current implementation in this repository does not follow the example provided by Refactoring Guru.