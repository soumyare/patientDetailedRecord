# patientDetailedRecord

PatientManagementSystem Springboot framework, 

Hybernate to connect with database(MYSQL) using application.properties file 
Spring boot is used because of fast and easy development of Spring-based applications. 

Plus Points 
------------
Use Swagger to list all your APIs - Not Used 
Use Unit tests for API using JUNIT, or Mockito - used JUNIT to write the tests. 
Using user token authentication for API access - not used 
You can use Maven build type to create your project - Created maven project 
Maven build/deploy/test scripts -not used 
Maven library configurations not used 
Use logging through Log4j 2.x http://logging.apache.org/log4j/1.2/ - not used

Database(MYSQL)
----------------
Create database patientdb. 
Tables will be automatically created because of annotation which we have used.

Running Tests
--------------
Install Intellij IDE, 
clone the project or download and import in intellij. 
Run the main class application starts in the port 8081. 
Install postman , 
Enter the url https://localhost:8081/api/v1/patient select GET and click on send, will get all data 
Select POST enter the data in the form of json click send 
Select PUT for updating and 
select DELETE for deleting

Deploying project to github
----------------------------
Create new repository in github,
select the project, 
open project in git bash, 
use the commands to push, 
git init, 
git status, 
git add . , 
git commit -m "some comment" ,
git remote add origin https://github.com/soumyare/PatientManagementSystem.git , 
git branch -M main ,
git push -u origin main
