EC2: virtual cloud server

1. launch an instance
2. Create a .pem key pair
3. launch the instance
4. connect through ssh
5. do operation inside the computer
6. private ipv4 is used to communicate through differecnt cloud computers
7. public ip needs inbound rules to connect from outside

ECR(Elastic Container Registry): Used to work with docker images.

1. download and install aws cli
2. login to elastic container registry using:
aws ecr get-login-password --region (REGION_NAME) | docker login --username AWS --password-stdin (USER_ID).dkr.ecr.(REGION).amazonaws.com

3. docker tag (name of the image) (USER_ID).dkr.ecr.(REGION).amazonaws.com/name of the image
4. push to the repository

Now,
go to ECS(Elastic Container Service): Used to work with docker images.

1. select aws Fargate
2. create a cluster
3. view cluster
4. go to task definition:
 1. fargate: keep everything  default
 2. select the container for
 3. map the container port
5. create a service
 1. give service name
 2. num of task: container replicas
 3. keep everything default

### ECS vs. EKS

| Feature                  | Amazon ECS                                   | Amazon EKS                                      |
|--------------------------|----------------------------------------------|--------------------------------------------------|
| **Container Orchestration**| Proprietary AWS service                    | Kubernetes (open-source)                        |
| **Ease of Use**           | Simpler setup, good for smaller projects     | More complex, suitable for larger projects      |
| **Compatibility**         | Well-integrated with AWS services             | Standard Kubernetes compatibility               |
| **Control**               | More opinionated, less control                | More customizable, greater control              |
| **Learning Curve**        | Easier for beginners                          | Steeper learning curve for Kubernetes           |
| **Scaling**               | Auto-scaling based on CloudWatch metrics      | Auto-scaling based on Kubernetes configurations |
| **Pricing Model**         | Task and Service pricing models               | Node and Fargate pricing models                  |
| **Managed Nodes**         | Fully managed service with Fargate or EC2     | Requires managing worker nodes                  |

### SQS vs. SNS

| Feature                 | Amazon SQS                                  | Amazon SNS                                      |
|-------------------------|---------------------------------------------|-------------------------------------------------|
| **Communication Type**   | Point-to-point (message goes to one subscriber) | Publish/subscribe (message goes to multiple subscribers) |
| **Message Distribution** | Single subscriber                           | Multiple subscribers                           |
| **Message Retention**    | Retains messages for a configurable period  | Typically not retained                          |
| **Use Cases**            | Decoupling and buffering requests between components | Broadcasting messages to multiple subscribers |
| **Delivery Retry**       | Supports automatic retries for message delivery | Retry depends on the subscriber's capabilities   |
| **Error Handling**       | Supports dead-letter queues for handling failed messages | Error handling typically at the subscriber level |

This detailed table provides insights into various aspects, including ease of use, compatibility, control, learning curve, scaling, pricing model, managed nodes, communication type, message distribution, message retention, use cases, delivery retry, and error handling for each service.
