### Singelton

Singleton is a creational design pattern that lets you ensure that a class has only one instance, while providing a global access point to this instance.

# Real World Analogy

- A country has a king
- The king remains king until he dies
- The king keeps his name, title, etc.

When a kingdom is established, a king is appointed.
As the kingdom grows, the king retains his title.
The king rules over all his territories.

# Problem

- Ensure that a class has a single instance.
- Provide a global access point to that instance.

# Why Singleton?

Singleton is useful when exactly one object is needed to coordinate actions across the system. It simplifies object management and ensures that all components of a system can access a single, shared instance. However, it should be used sparingly as it can introduce global state, which might make code harder to maintain and test.


