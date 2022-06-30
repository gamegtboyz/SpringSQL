# SpringSQL
This folder illustrates the connection of SQL and web services using Spring Framework.


<update 30/06/22>
This is the initial upload of this projects, so I need to berifly describe what I have done on this project.
#1 Create the SQL database.
  I created this database using mySQL, the projects illustrated the coffeshop named 'the_mad_coffee' with various products and branches. Then create user named james and give the super-user authorization to him.
  
#2 Build the Projects using Spring Boot
  Create maven project. Currently, I use 3 dependencies as follows;  spring-boot-starter-web (released version from org.springframework.boot), 
                                                                          spring-boot-starter-java-jdbc (released version from oeg.springframework.boot),
                                                                          mysql-connector-java(released version from mysql).
  Then do the following tasks in FILE:code\main\Start.java
  1. Run the Spring Boot applicaiton through class Start.
  2. Run the driver and build the connection string in class Initialize
  
  Then makes the project retreive data from SQL database, then illustrated in web browser in format of JavsScript Object Notation (JSON) as shown in FILE:code\main\Product.java
  Please noted that to read and write particular database, we need 3 components on each talbe; the table mapping, the repository, and the controller
  Build the Controller class (@RestController) in class ProductController which we create the mapping and and made it show all records in table products which we previously build in SQL. (for sure we will add more endpoints later), then @Autowired them with Repository.
  Build the Repository (@Repository) in interface ProductRepository which we extends it from class CrudRepository which is the pre-built class from Spring.
  Build the table (@Table) in class Product. We make the field of class get along with the field of SQL table.
  
  Please noted that I set the connection port in to 40000 as mentioned in FILE: web\application.properties
  
  If there's no any exception occurred, you may see output on your web brower with url: http://localhost:40000/api/product/showall you will see all input records from table product in JSON format.
