# Task Breakdown

## Task 1️⃣: Model the Core Product Hierarchy
- [x] Task completed  ✅
- [ ] Task pending
### Background

You're modeling diverse types of products. Some can expire (e.g., milk), others are non-perishable 
(e.g., documents). All products share common identity fields but differ in behavior.

### Steps
1. Define a base abstract class Product with common fields like id, name, and an abstract method 
`getType()`. 
2. Create 3 subclasses:
   - `Document`: represents paperwork or forms. 
   - `Electronic`: devices like phones, routers.
   - `Perishable`: anything that expires. Add an integer field (e.g., expirationDay) and a method isExpired(int today).
3. In `Perishable`, if an expired item is processed, it should trigger an `ExpiredProductException`. 
4. Use encapsulation (private fields + public getters/setters). 
5. Override toString() in each subclass to display clean info.

### Concepts
- Abstract classes & polymorphism 
- Domain-specific behavior 
- Exception triggering from domain logic

----


## Task 2️⃣: Build a Generic Storage Unit

- [x] Task completed  ✅
- [ ] Task pending

### Background
Warehouses need containers for storing different item types. These containers must be generic, so they can hold any type, 
and must prevent invalid use (e.g., adding null, or retrieving when empty).

### Steps
1. Create a generic class `StorageUnit<T>`. 
2. Add:
   - `addItem(T item)`: If `item` is null, throw an `InvalidInputException`. 
   - `getItem():` If nothing is stored, throw an `EmptyStorageException`.
3. Add another version that holds multiple items in a `List<T>` (like a shelf). 
4. Implement basic bulk operations like adding a list of items and retrieving the whole list.

### Concepts
- Generic types 
- Exception safety 
- Defensive programming 
- Collection use


----
## Task 3️⃣: Create Packages and Inventory System

- [x] Task completed  ✅
- [ ] Task pending

### Background

Items are grouped into packages, and packages are mapped in inventory by ID. These structures must handle bulk data, type 
diversity, and potential data issues (like expired items).

### Steps
1. Design a generic class `Package<T>` that holds a collection of products. 
2. Create an `Inventory<T>` class containing a `Map<String, Package<T>>` to associate package IDs to their contents. 
3. Add methods to:
   - Add new packages. 
   - Retrieve packages by ID. 
   - Print inventory using a method that accepts wildcards `(List<? extends Product>)`.
4. Ensure any invalid or expired product in a package triggers an exception during validation or reporting.


### Concepts
- Map-based indexing 
- Generic and wildcard methods 
- Data integrity enforcement
- Exception-driven control flow

----
## Task 4️⃣: Create People Hierarchy (Supplier/Customer)

- [ ] Task completed
- [ ] Task pending

### Background

People in the supply chain either provide products (suppliers) or receive them (customers). Each role must interact with 
the system in a safe, validated manner.

### Steps
1. Create an abstract class Person with shared fields like `id`, `name`, and method `getRole()`. 
2. Implement:
   - **Supplier**: Owns a list of `Package<? extends Product>`. Can add products to packages.
   - **Customer**: Can `receivePackage(Package<?>)`. If a package includes expired items, throw `ExpiredProductException`. 
3. Ensure that no person is created with a blank or null ID/name. Use InvalidInputException to enforce this.


### Concepts
- Abstract class + inheritance 
- Polymorphic roles 
- Wildcards in method parameters 
- Runtime input validation

----
## Task 5️⃣: Utility Methods (with Exception Handling)

- [ ] Task completed
- [ ] Task pending

### Background

Utility classes provide reusable functionality, and they should be defensive. These methods will validate, filter, and display data safely.

### Steps
1. Create a class `SupplyChainUtils`.
2. Add:
   - A generic method `displayItem(T item)` to print any item.
   - A method `<T extends Perishable> List<T> getExpired(List<T> items, int today)` that returns expired items.
     - If any are expired, consider throwing `ExpiredProductException` or logging a warning.
   - A method `validateInput(String value)` that throws `InvalidInputException` for null/empty strings.
3. Use these utility methods across your entire app.


### Concepts
- Generic methods 
- Input validation 
- Bounded types and exceptions 
- Centralized error prevention