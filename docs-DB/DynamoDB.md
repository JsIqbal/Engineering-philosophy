### Interface and Implementation

An interface serves as an abstraction of a method's signature. When we use an interface as a type, we must implement the method signature defined by that interface.

### Domain Driven Design Pattern

In the context of domain driven design pattern, the relationship between services, repositories, and REST APIs is interesting. While services and repositories are closely connected to the service, they are unaware of each other's existence.

### DynamoDB Key Types

DynamoDB uses two types of keys:

1. **Partition Key**: This key is used to hash each record's partition key and distribute them across various computers randomly.

2. **Sort Key**: The sort key can be used for sorting data, such as using email for sorting records.

### Storing Data in DynamoDB

**Story 1:**

1. DynamoDB hashes each record's partition key and distributes them randomly across computers.
2. The sort key, such as email, can be used for data sorting.

### Searching for Data in DynamoDB

Searching for a specific user among millions can be challenging and expensive (costing $0.25 for each scan read). To make searches more efficient, we introduce the global secondary index.

### Global Secondary Index (GSI)

In the example with user data having fields like userID, email, and createdBy, "createdBy" becomes the global secondary index. This allows records to be sorted and stored in separate computers, yet remain accessible through the same table.

### Local Secondary Index (LSI)

Further sorting can be achieved using local secondary indexes, like sorting by "age."

### Dynamic Data Storage

In DynamoDB, data records are stored dynamically and in a dynamic manner. This flexibility allows data to be stored in different computers, sorted in various ways, and retrieved efficiently. This dynamic storage and retrieval approach is what gives DynamoDB its name.

_Feel free to modify or adjust any sentences or code as needed._
