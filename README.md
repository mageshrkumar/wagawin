# Coding Challenge

Coding Task:

To build the project execute maven "clean package" commands from the project root.

To run the project execute this in command line java -jar person-0.0.1-SNAPSHOT.jar 



## Project description

The project provides a  following endpoints:

The RESTful API provides the following interfaces:


* Get House for given person

```
GET http://localhost:8080/api/house?id={value}




```

* Get Parent and Favourite meal for given child

```
GET http://localhost:8080/api/child/info?id={value}




```

* Get Hair color or Bicycle color for given child

```
GET http://localhost:8080/api/child/color?id={value}




```

* Get ParentChildSummary

```
GET http://localhost:8080/api/persons/children




```


## Script File

Please find the script file in init.sql

## Docker file

If you want to deploy as a containerized application , check Dockerfile. 


