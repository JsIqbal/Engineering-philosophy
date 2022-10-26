# class 1

Database : something that stores data.

Data: Anything we can store or anything that has a value.

* we can query easily and find the wanted records.
* security. Allowing division.

# class 2 -> Relational Database
----

Relation: A connection between data.

    2       4
    |       |
6-(6,2)-(6,4)
    |       |
8-(8,2)-(8,4)

Here we can see that 2,4,6,8 are building relations.

* 2 terms

    -  entity: A person. Anything we store data about.

    - attribute: the information of the persons. The data about the entity.

* when we apply attribute in reference to Entity we are creating a attribute type.

* Table:
    - we store attribute about an entity in a table.
    - relation about entity and attributes.

    1. Row or record or tuple: where we store the attribute of a specific person or product or user.

    2. Fields or column or attribute: where a specific type of data are store. This is Attribute.

    3. Entity type: It can be User or any category we want to store data about.

    4. Attribute type: the categories of the attributes.
        Ex: user, username, password etc.

-----------

class 3 -> RDBMS (Relational database management system)
--------------

DBMS : database management system
* we have tons of information in our database like user information, passwords and emails.

* what if we want the information about a specific entity? We can run a database QUERY. 
To use the DB query we need to have a database management system.

RDBMS is a sub category that is designed to manage relational databases.

1. Run fancy query.

DBMS / RDBMS:

    i. View mechanism : surface appearance of a data. Will give access to needed information to specific users. 
    ii. a security feature. 

        Ex: 
            1. Admins can view all the data.
            2. A user can only view a certain amount of data.

    ii. Transaction:
        a. Transfer money
        b. Deduct money
        c. If any error then the transaction terminates and unsaved everything to previous order.

    Examples of DBMS/RDBMS:
        1. MySQL
        2. Oracle
        3. SQL server

    * actual files are saved in hard drive.
    * database management system shows the data in a presentable way.
    * RDBMS creates consistency for the frontend. We can take a full name from frontend but we store it in firstname and lastname columns in backend.

    * Server side scripting language:
        1. php
        2. javascript etc


class 4 -> SQL (structured query language)
----------------
# SQL
    1. Define -> define the data 
        - DDL - data definition language 
        - the attributes, the tables & connection between table.

    2. Manipulates -> manipulates the data
        - DML - data manipulation language.
        - the data in the attributes are written using the DML.

        Example:
            1. CREATE - to create a table. (DDL)
            2. Update - for updating the value. (DML)

    3. Join:
        - table about different entities join to have a new view which will be another table.

    
Class 5 -> Naming conventions
----------------
1. Any kind of SQL will be IN CAPITAL LETTER. SELECT
2. Anything we write will be small letter. User, id
3. For spaces we use _ underscore.

If we have same columns in different tables then the attribute of those columns will be same. Foreign key.


Class 6 -> Database Design
----------
1. Data integrity:
    - correct data
    - updated data
    - managed properly

2. We should not have repeating data or broken data.

Design methods:
A schema tells us how the data will be structured.
- conceptual schema: 
    - brainstorming & thinking
    - how data is related
    - general idea

- logical schema: 
    - table structures
    - structuring columns, data types
    - schema design

- physical schema: 
    - which DBMS or RDBMS we will use
    - implementation in database
    - which server we will use
    - is it going online
    - program the database
    - building the users
    - the views
    - securities

* database design is using skill that you have to design a database that will not have data integrity issues and will not have any data anomalies.

* Break information in different tables. 

Class 7 -> Data integrity
-----------
It's about having correct data in the database.

1. Entity integrity:
    - unique id for entities

2. Referential integrity:
    - sale bought by a user that doesn't exist
    - foreign key constraints allow to connect tables

3. Domain integrity: 
    - acceptable values for a column
    - what we are storing
    - the range we are storing
    - schema using yup

RDBMS offers data types:

    - a type of data
    - integer, strings or dates
    - data type puts a limit

class 8 -> DB terms:
---------

* Data vocabularies:

1. Data: anything we store in a DB
2. Database: what we store our data in
3. Relational Database: specific kind DB.
    - it stores data in tables
4. DBMS: we control our DB
5. RDBMS: we control RDB
6. Null: column without a value. No data or no value
7. Anomalies: Errors in data integrity
8. Integrity: implement integrity to protect anomalies.
    i. Entity: uniqueness among the tables
    ii. Referential: keeps the connections across multiple tables.
    iii. Domain: a column within a table has the expected values.

* Design vocabularies:
---
1. Entity: anything we store data about
2. Attributes: things we store about the entity
3. Relation: another name for a table
4. Tuple: all attributes about a specific entity
5. Table: a physical represent of a relation.
6. Rows: all attributes about a specific entity
7. Columns: specific attribute of an entity
8. File: another name for a table
9. Record: all attributes about a specific entity
10. Field: another name for a column
11. Value: information that we put in to a specific column
12. Entry: when we enter data. It's also row
13. DBdesign: process of designing a table to remove anomaly and have data integrity.
14. Schema: a physical drawn out structure of our DB
15. Normalization: a bunch of steps to follow to help us get the best DB design
16. Naming conventions: consistency to name in a certain way.
17. Keys: something to make anything unique in a table

* physical structure: 
    - relation
    - tables
    - file

# talking about row
    - record
    - tuple
    - rows

# talking about column
    - attributes
    - column
    - field

# More database terms:

* SQL
    i. DDL - data definition language
    ii. DML - data manipulation language
        - update
        - delete
* SQL keywords:
    i. SELECT
    etc

* frontend: user uses and sees. Gives a view
* backend: complicated stuff.

1. Client side: frontend
2. Server side: backend that serves the frontend
    - server side scripting language to access the database from the client side which is the frontend.
    - views or view mechanism.
    - joins. Which is used by the views.


# class 9 -> Atomic values
---
1. Everything we store in a database should be one thing.
