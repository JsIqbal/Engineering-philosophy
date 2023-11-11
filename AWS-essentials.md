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

