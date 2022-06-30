create database the_mad_coffee;
create user james identiied with mysql_native_password by 'bond';
grant all on the_mad_coffee.* to james;
use the_mad_coffee

create table product (
    code int unique auto_increment,
    name varchar(80),
    size char,
    price float
);

insert into product(name, size, price) values("Espresso", "S", 40);
insert into product(name, size, price) values("Americano", "S", 50);
insert into product(name, size, price) values("Mocha", "S", 60);
insert into product(name, size, price) values("Latte", "S", 50); 
insert into product(name, size, price) values("Espresso", "M", 50);
insert into product(name, size, price) values("Americano", "M", 60);
insert into product(name, size, price) values("Mocha", "M", 70);
insert into product(name, size, price) values("Latte", "M", 60);
insert into product(name, size, price) values("Espresso", "L", 60);
insert into product(name, size, price) values("Americano", "L", 70);
insert into product(name, size, price) values("Mocha", "L", 80);
insert into product(name, size, price) values("Latte", "L", 70);

create table branch (
    code     int unique auto_increment,
    name     varchar(80),
    area     float
);

insert into branch(name, area) values("New York", 120);
insert into branch(name, area) values("London", 80);
insert into branch(name, area) values("Paris", 90);
insert into branch(name, area) values("Tokyo", 75);
insert into branch(name, area) values("Sydney", 105);