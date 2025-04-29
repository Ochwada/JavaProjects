# 🚚 SmartSupplyChain: Your Next Java Milestone!

#### Mastering Generics, OOP, Collections & Exception Handling
A real-world systems engineering challenge
***

Get ready to build a real-world logistics backend in **SmartSupplyChain**, where you'll master *Generics*, *OOP*, 
*Collections*, and *Exception Handling*. From designing product and personnel hierarchies to implementing 
generic storage and custom error handling, this project challenges you to think critically and code smart 
with type-safe precision and clean architecture.

## Project Overview
Building the core of SmartSupplyChain, a Java-powered logistics system that handles the flow of products — 
from suppliers, through warehouses, to customers — safely, scalably, and fault-tolerantly.

Each module should reflect best practices in:

- OOP (encapsulation, abstraction, inheritance)
- Generics (type safety, bounded types, wildcards)
- Exception handling (custom exceptions, input validation)
- Collections (List, Map)
- System simulation (via com.smartSupplyChain.main())

### SmartSupplyChain – Full Project Structure
```Yaml

SmartSupplyChain/
├── README.md                       # Project overview and setup instructions
├── src/
│   ├── main/
│   │   └── SmartSupplyChainApp.java        # Entry point: simulation, flow orchestration
│
│   ├── items/                              # Product domain layer
│   │   ├── Product.java                    # Abstract base for all products
│   │   ├── Perishable.java                 # Extends Product, includes expiration logic
│   │   ├── Document.java                   # Concrete non-perishable product
│   │   ├── Electronic.java                 # Concrete electronic product
│
│   ├── inventory/                          # Inventory and packaging logic
│   │   ├── StorageUnit.java                # Generic container for items
│   │   ├── MultiStorageUnit.java           # Generic container that stores a list
│   │   ├── Package.java                    # Wraps a group of items
│   │   ├── Inventory.java                  # Maps package IDs to packages
│
│   ├── people/                             # Actors interacting with inventory
│   │   ├── Person.java                     # Abstract person class
│   │   ├── Supplier.java                   # Supplies packages
│   │   ├── Customer.java                   # Receives packages
│
│   ├── system/                             # Utility functions for logic & validation
│   │   ├── SupplyChainUtils.java          # Generic methods, validation, expiration checks
│
│   ├── exception/                          # Custom exception handling
│   │   ├── ExpiredProductException.java    # Thrown when expired items are used
│   │   ├── EmptyStorageException.java      # Thrown when accessing empty storage
│   │   ├── InvalidInputException.java      # Thrown when user/product input is invalid

```

### What's in each folder?
#### items/
All product-related classes, forming the inheritance hierarchy. This includes perishable items that may throw exceptions if expired.

#### inventory/
Logic related to how products are stored, grouped, and managed. It also handles generic containers and inventory mapping.

#### people/
Classes for users of the system: suppliers (who provide packages) and customers (who receive them). These classes interact with inventory safely.

#### system/
Contains reusable tools like item printers, expiration checkers, and input validators.

#### exception/
Custom exceptions that enforce safe and robust code:
- ExpiredProductException: for expired item handling. 
- EmptyStorageException: for attempting to retrieve from empty storage. 
- InvalidInputException: for catching invalid user or object input early.

#### main/
The heart of the simulation — here, you'll glue everything together, simulate operations, and catch exceptions gracefully.