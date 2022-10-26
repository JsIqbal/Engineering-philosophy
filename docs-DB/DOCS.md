Data vocabolaries:

1. Data
2. Database
3. Relational Database
4. DBMS
5. RDBMS
6. Null
7. Anomalies
8. Integrity
    i. Entity

    ii. Referntial

    iii. Domain

Design vocabolaries:

1. Entity
2. Attributes
3. Relation
4. Tuple
5. Table
6. Rows
7. Columns
8. File
9. Record
10. Field
11. Value
12. Entity
13. DBdesign
14. Normalization
15. Naming conventions

More database trerms:

* SQL
    i. DDL - data defination language
    ii. DML - data manipulation language
* SQL keywords:
    i. SELECT
    etc

* frontend: user uses and sees.
* backend: complicated stuff.

1. client side
2. server side
3. server side scripting language to access the database from the client side which is the frontend.
4. views or view mechanism.
5. joins. which is used by the views.


# class 1

Database : something that stores data.
Data: Anything we can store or anything that has a value.

* we can query easily and find the wanted records.
* security. Allowing division.

-------- Relational Database----class 2

Relation: A connection between data.

    2       4
    |       |
6-(6,2)-(6,4)
    |       |
8-(8,2)-(8,4)

Here we can see that 2,4,6,8 are builing relations.

* 2 terms

    -  entity: A person. Anything we store data about.

    - attribute: the informations of the persons. the data about the entity.

* when we apply attribute in reference to Entity we are creating a attribute type.

* Table:
    - we store attribute about an entity in a table.
    - relation about entity and attributes.

    1. row or record or tuple: where we store the attribute of a specific person or product or user.

    2. Fields or column or attribute: where a specific type of data are store. This is Attribute.

    3. Entity type: It can be User or any category we want to store data about.

    4. Attribute type: the categories of the attributes.
        ex: user, username, password etc.

-----------

class 3 -> RDBMS (Relational database management system)
--------------

DBMS : database management system
* we have tons of informations in our database like user informations, passwords and emails.

* what if we want the information about a specific entity? we can run a database QUERY. 
To use the DB query we need to have a databse management system.

RDBMS is a sub category that is designed to manage relational databases.

1. run fancy query.

DBMS / RDBMS:

    i. view mechanism : surface appearance of a data. will give access to needed informations to specific users. 
    it's a security feature. 

        ex: 
            1. Admins can view all the data.
            2. A user can only view a certain amount of data.

    ii. Transaction:
        a. transfer money
        b. deduct money
        c. if any error then the transaction terminates and unsave everything to previous order.

    Examples of DBMS/RDBMS:
        1. MySQL
        2. Oracal
        3. SQL server

    * actual files are saved in hard drive.
    * database management system shows the data in a presentable way.
    * RDBMS creates consestincy for the frontend. we can take a full name from frontend but we store it in firstname and lastname columns in backend.

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

        example:
            1. CREATE - to create a table. (DDL)
            2. update - for updating the value. (DML)

    3. Join:
        - table about different entities join to have a new view which will be another table.

    
class 5 -> Naming conventions
----------------
1. Any kind of SQL will be IN CAPITAL LETTER. SELECT
2. anthing we write will be small letter. user, id
3. for spaces we use _ underscore.

if we have same columns in different tables then the attribute of those columns will be same. foreign key.


class 6 -> Database Design
----------
1. Data integrity:
    - correct data
    - updated data
    - managed properly

2. we sould not have repeting data or broken data.

design methods:
A schema tells us how the data will be structured.
- conceptual schema: 
    - brainstorming & thining
    - how data is related
    - general idea

- logical schema: 
    - table structures
    - structuring colums, data types
    - schema design

- physical schema: 
    - which DBMS or RDBMS we will use
    - implemantaion in database
    - which server we will use
    - is it going online
    - program the database
    - building the users
    - the views
    - securities

* database design is using skill that you have to design a database that will not have data integrity issues and will not have any data anomalis.

* Break information in different tables. 

class 7 -> Data integrity
-----------
It's about having correct data in the database.

1. Entity integrity:
    - unique id for entities

2. referential integrity:
    - sale bought by a user that doesn't exist
    - foreign key constraints allow to connect tables

3. domain integrity: 
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

Data vocabolaries:

1. Data: anything we store in a DB
2. Database: what we store our data in
3. Relational Database: specific kind DB.
    - it stores data in tables
4. DBMS: we control our DB
5. RDBMS: we control RDB
6. Null: column without a value. no data or no value
7. Anomalies: Errors in data integrity
8. Integrity: implement integrity to protect anomalies.
    i. Entity: uniqeness among the tables
    ii. Referntial: keeps the connections accross multiple tables.
    iii. Domain: a column within a table has the expected values.

Design vocabolaries:
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
12. Entry: when we enter data. it's also row
13. DBdesign: process of desiging a table to remove anomaly and have data integrity.
14. schema: a physical drwn out structure of our DB
15. Normalization: a bunch of steps to follow to help us get the best DB design
16. Naming conventions: consestincy to name in a certain way.
17. keys: something to make anything uniqe in a table

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

# More database trerms:

* SQL
    i. DDL - data defination language
    ii. DML - data manipulation language
        - update
        - delete
* SQL keywords:
    i. SELECT
    etc

* frontend: user uses and sees. gives a view
* backend: complicated stuff.

1. client side: frontend
2. server side: backend that serves the frontend
    - server side scripting language to access the database from the client side which is the frontend.
    - views or view mechanism.
    - joins. which is used by the views.


# class 9 -> Atomic values
---
1. everything we store in a database should be one thing.
