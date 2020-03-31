## Summary
This Springboot project using RESTful API gives employee information when you need employee details based on their id. 

The employee information is stored in MySQL database and hibernate is used to fetch data from it.


## Design
Unique design features in this project include:


i) Using optional class of Java 8 in the findById method of the EmployeeServiceImpl class. 

This uses the "T orElse(T other)" method of optional class, wherein it checks for employee with given id and if found returns employee information. Otherwise it returns null.

ii) Creating Environment Variables to be used at run/debug time by adding them in the configuration of "Application" class which runs the SpringBoot application. This is used to secure the DB_USER,DB_PASS and DB_URL used in the project.

iii) Using Hibernate to retrieve MySQL database repository information.

## Usage
Once you download the complete code, you should be able to open it on IntelliJ IDEA.

- You should set up MySQL database repository with employee information and use the database url with this project to find employee details by id.

- You need to set up Environment variables for the "Application" class or you could manually set values for Strings "DB_USER,DB_PASS, DB_URL" in the application.properties file.

- Once the above steps are done, you can run the project from IntelliJ IDEA and test it in Postman with the path variable- "/employees/{id}"

