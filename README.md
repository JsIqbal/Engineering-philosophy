# Engineering-philosophy

1. OOP?
	Technical: OOP is a programming paradigm where we work with objects & relations between objects.

	philosophy: All we see around us are objects. 
	But our computer doesn't know the objects around us. 
	So we need to make the computer understand the objects in its own way . so we need to use OOP paradigm's languages.

    technical:

    # class :
        technical: Structure of an object or a blueprint.

        philosphy: As we need to make the pc understand what an object is, first we need to make sure it understands the structure of an object . So, we say that classes are the structures or blueprints of an object.

        2 parts:
            1. properties || state || fields
            2. methods || behaviour

        3. Constructor() :

    OOP has 4 concepts:
    1. Inheritance
        - If a child class inherites all the properties of it's parents class then it is called inheritence.
    2. polymorphism
    3. Encapsulation
    4. Abstruction

    # Needed:
    --------

    1. Coupling : 

        * Sub-part:
            1. tightly Coupled: 
                - the more knowledge one class or method has about another class or method, the more tightly coupled structure is developed.
            2. Loosley Coupled :
                -  If the classes or methods know less about each other, the more loosely coupled structure comes into existence.

    2. Cohesion :
        - Cohesion in Java is the principle of Object-Oriented programming. 
        - Cohesion is closely related to ensuring that the purpose for which a class is getting created in Java is well-focused and single.

    3. Association: 
        - the connection between two classes that are set up through their objects.
        * IS-A Association
        * HAS-A Association
            - Aggregation
            - Composition

    4. Aggregation
        - When we create an instance of a class in another class then it is Aggregation.
        - This is for code reusibility.

    5. Composition

    # SOLID principle
    
    SOLID is a short form of 5 software design principle:
-----------------------------------------------------

1. S - Single Responsibility principle:
	i. A class will have only one responsibilty for it:
        Example: Employee class will not have methods or properties of customers.

2. O - Open Closed principle:
    i. We are happy to intruduce new features in our codebase.
    ii. we are not modifing our existing codebase for the new features.
    So, Our codebase is open for new features but closed for modification.

3. L - Liskov Substitution:
    1. The child class can enherit the base class.
    2. The child class will not modify the base class's implementation.
    example: we have a base class for getting project detais and employee details.
        1. if we want to see the details of a contractual employee then the base class's implementaion will be modified because we do not keep records of our contrctual employees.

4. I - Interface Segragation:
    1. Interfaces have definition in child classes.
    2. Suppose we have an interface that have methods like addToCart and CreditCardProcess. So, if we define a class to use the interface for offline order meaning it's a cash on delivary then the Interface's second method will be useless. So, we need to design the interface for global uses. Whenever an Interface is used then all the methods in it will be defined.

5. D - Dependency Inversion:
    1. Whenever A class get's dependant on other class then it in called dependency.
    2. A class needs to have all the necesasry properties to function properly. So that the instances of that class doesn't need to be dependant on other classes. Also following the Open Closed principle and Single Responsibility principle.
    # Design Patterns

    Databse:
        1. Cardinality / Relationship
        2. Normalization process
        3. Transaction
        4. Indexing in Databse ***

        # Extra: SQL Query

Software Engineering Methodologies:
-----------------------------------
1. Agile Methodology:
    1. We need to code a little portion everyday while maintaining the features.
    2. Must Follow the SOLID design Principle.
    3. agile development methodology to minimize risks.
    The way it works:
        i. Plan
        ii. Collaborate or code
        iii. delivary
        iv. Daily Review.
    Agile Methods: scrum, crystal, extreme programming (XP), and feature-driven development (FDD).

2. DevOps deployment methodology:
    i. DevOps is an Organizational Culture.

    Life Cycle: Plan -> Code -> Build -> Test -> Release -> Deploy -> Operate -> Monitor

3. Waterfall development method:
    i. waterfall method is the traditional software development method.

    Life Cycle : Requirements -> Design -> Implementations -> Varifications -> Maintanence

4. Rapid application development:
    i. development process that produces a high-quality system with low investment costs.

    Life cycle: planning -> user design -> construction -> cutover.

    *** The user design and construction phases repeat until the user confirms that the product meets all requirements.

# SOFA:
------
*four principles of object-oriented programming (OOP) design that apply to functions.

S - short: Functions should be as short as feasible without taking away from clarity.

O - One: Functions should address a single goal and rely on other functions for additional functionality.

F - Few Arguments: Functions should have as few arguments in number as is possible for them to address required functionality.

A - Abstraction: Functions should limit the level of abstraction they use to be consistent across all sub-parts. For example, a function should not combine a high-level API call to a webserver with a binary data conversion operation to process response data.

# Restful Services:
----------------
1. Client Server Architechture:
    1. Client is the App.
    2. Server is who he response.

    i. A client or an app can get response from the server using Some methods.
    ii. These methods which runs with the help of HTTP/HTTPS are known as Rest - Represantional State Transfer.
    iii. We can use The CRUD Operations to transfer states:
        1. c - create
        2. r - read
        3. u - update
        4. d - delete.

    iv. To do this operations we need to have some services.
        Those services are known as Restful Services or Restful APIs.

        Some of them are:
        1. CREATE
        2. GET
        3. PUT
        4. PATCH
        5. DELETE etc.
