# Simple CRUD Application with Scala and Cassandra

This repository contains a simple crud application  to demonstrate  how  to carry out CRUD operations on a Cassandra 
DB with Scala.

To run this application  you to need have Cassandra in your machine. Easiest way to setup Cassandra locally is 
using Docker <br>

`docker pull cassandra:3.11`

Start the cassandra container and expose the port 9042. <br>
`docker run -p 9042:9042 --name cassandra -d cassandra` <br>
The application will be using this port to connect to Cassandra.

Access the bash terminal of the cassandra docker container. <br>
`docker exec -it <<containerid>> bin/bash`

Access CQL shell <br>
`cqlsh`

Execute following the CQL query to create the necessary keyspace for the application: <br>
`CREATE KEYSPACE IF NOT EXISTS user_details WITH replication = {'class': 'SimpleStrategy', 'replication_factor': 1};`

The execute the following CQL statement to create the user table required for this application.
` CREATE TABLE IF NOT EXISTS user (     id UUID PRIMARY KEY,     name TEXT,     age INT );`


To compile and build the project use:
`sbt clean compile`



