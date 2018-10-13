# Abstract Factory 

### Intent
 1. Provide an interface for creating `families of related or dependent objects` without specifying their concrete classes.
 
 2. A hierarchy that encapsulates `many possible "platforms"`, and the construction of a `suite of "products"`.
 
 3. the new operator considered harmful.

### Problem
 Imagine that you are creating a simulator of a furniture shop. Your code consists of:
 
 * Family of related products, say: **Chair** + **Sofa** + **CoffeeTable**.
 * Several variants of this family. For example, products Chair + Sofa + CoffeeTable available in these variants: **IKEA**, **VictorianStyle**, **ArtDeco**.
 
 1. You need a way to create individual furniture objects so that they match other objects of the same family. Customers get quite frustrated when they receive non-matching furniture.
 2. You do not want to change existing code when adding new products or families of products to the program. 
 3. Furniture vendors update their catalogs very often, and you do not want to change the core code each time it happens.
 
 ### Way to Solve 
 
 1. The first thing that Abstract Factory pattern suggests is to **go over all distinct products and force their variants to follow common interfaces**. For example, all chair variants must follow the Chair interface; all coffee tables must implement the CoffeeTable interface, etc.
 
 2. The second step is to create the **AbstractFactory**, a base interface that declares methods for creating all products that make a product family (i.e. createChair, createSofa and  createCoffeeTable). The important thing here is to make these methods to return abstract product types represented by interfaces we extracted previously: Chair, Sofa, CoffeeTable, etc.
 
 3. The third step is to implement concrete factories. Factories are classes that return products of a particular kind. For example, IKEAFactory, will only return IKEAChair, IKEASofa and  IKEACoffeeTable objects. All factories must follow the AbstractFactory interface while creating the same variety of products
 
 4. Client code has to work with factories and products only through their abstract interfaces. This way you can alter the type of products used in client code by passing it a different factory object.
 
 5. So, when client code asks a factory to produce a chair, it must not be aware of the factory's concrete class. It must not be aware of the concrete class of chair it will get either. Whether it will be a modern IKEA model or a Victorian style chair, it must work with all chairs in the same way, using the abstract Chair interface. The thing that the client code will know is that the resulting chair implements the sit method, declared in the interface. It also knows that whichever chair will be returned, it will match the type of sofa and coffee table, produced by the same factory.
 
 
 ### How to Implement
 1. Map out a matrix of distinct products versus variants of the same product.
 2. Create abstract interfaces for all distinct product types and make all concrete products follow these interfaces.
 3. Declare the abstract factory interface. This interface should list creation methods for all distinct types of products.
 4. Implement separate factory classes for each variant of the product family.
 5. Create a factory initialization code somewhere in client code. It should pick the type and create a concrete factory depending on the configuration or current environment.
 6. In the client code, replace all product constructor calls with calls to the creation method in the factory object.
 
 ### Pros and Cons
 
 Pros
 1. Follows the Open/Closed Principle.
 2. Allows building families of product objects and guarantees their compatibility.
 3. Avoids tight coupling between concrete products and code that uses them.
 4. Divides responsibilities between multiple classes.
 
 Cons 
 1. Increases overall code complexity by creating multiple additional classes.
 
 
 ### Relations with Other Patterns
 Often, designs start out using Factory Method (less complicated, more customizable via subclasses) and evolve toward Abstract Factory, Prototype, or Builder (more flexible, but more complex) as the designer discovers where more flexibility is needed.
 
 Builder focuses on constructing a complex object step by step. Abstract Factory creates families of product objects (either simple or complex). Builder returns the product as a final step, but the Abstract Factory returns the result immediately.
 
 Abstract Factory classes are often implemented with Factory Methods, but they can also be implemented using Prototype.
 
 Abstract Factory can be used as an alternative to Facade to hide platform-specific classes.
 
 Abstract Factory can be used along with a Bridge pattern. It's useful when the "interface" part of the Bridge can work only with a particular "implementation". In this case, factory can encapsulate these relations and hide the complexity from a client.
 
 Abstract Factory, Builder and Prototype can be implemented as Singletons.
 