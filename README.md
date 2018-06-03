# Spring Web MVC App 
===========================
 
# Development
1. Import project using 'File'->'Open Projects From File system' menu of STS(Spring Tool Suite) 
2. Right click the project and click 'Run As'->'Run on Server'.
3. Select the server.
4. Open the url 'http://localhost:8080/vendor'

# Deployment on Tomcat
1. Generate .war package using below command. 
```
mvn package
```

2. Deploy 'target/srm.war' to 'webapps' directory in Tomcat Server.
3. Open the url 'http://localhost:8080/srm'
