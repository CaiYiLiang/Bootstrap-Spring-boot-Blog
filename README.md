# Bootstrap-Spring boot-Blog    [![Wercker](https://img.shields.io/wercker/ci/wercker/docs.svg?maxAge=2592000)]() 
<br>


This is a very simple and clean-design personal blog page implemented with Bootstrap framework and Spring Boot. And this simple Spring boot application is runing as my personal website on <a href="https://www.heroku.com/">Heroku</a>. You can check <a href="https://hicherry.herokuapp.com/">my psersonal website</a> for demo reference.
<br>

**version**
----------
<kbd>**version 0.1**</kbd>  &nbsp; 
>- Spring Boot and many of Spring familiy (Spring MVC, Spring JPA)
>- Hibernate + mySQL/postgreSQL(<a href="https://www.heroku.com/">Heroku</a> native database) 
>- <a href="https://getbootstrap.com/">Bootstrap</a> - A very popular and responsive front-end framework
><h6>*2016-07-31*</h6> 
<br>


**Quick Start**
----------
- <a href="">Download the project</a>
- Or Clone the repo: git clone https://github.com/CaiYiLiang/Flat-Page.git 
- Import as a Maven project in your IDE
- Update the ```src/main/application.properties``` based on your local database seeting.If you use postgreSQL database,no need to change anything.If you use mySQL databse, remove ```src/main/application.properties``` and ```src/main/java/demo/modelsDatabaseConfig.java``` ,then rename  ```src/main/mysql.application.properties``` to ```src/main/application.properties``` and update the settings(port ,user,password etc.)
- Run the command ```mvn spring-boot:run```
- After start up your application in local , point your browser to http://localhost:8080.



