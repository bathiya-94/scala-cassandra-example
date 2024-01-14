# Simple CRUD Application with Scala and Cassandra

This repository contains a simple crud application  to demonstrate  how  to carry out CRUD operations on a Cassandra 
DB with Scala.

To run this application  you to need have Cassandra in your machine. Easiest way to setup Cassandra locally is 
using Docker:

`docker pull cassandra:3.11`

Start the cassandra container and expose the port 9042. 
`docker run -p 9042:9042 --name cassandra -d cassandra`

The application will be using this port to connect to Cassandra.

To compile and build the project use:
`sbt clean compile`



