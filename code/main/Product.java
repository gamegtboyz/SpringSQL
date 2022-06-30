package main;

//reminder: we have to use 3 class for to show recorded entries in SQL; the controller, the table, and the repository

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
class ProductController {
   @RequestMapping("api/product/showall")
   List Show() {
       return (List)repository.findAll();
   }
   
   
   @Autowired ProductRepository repository;
}

@Repository
interface ProductRepository extends CrudRepository<Product, Integer> {
    
}

@Table("product")
class Product {
    @Id int code;
    public String name;
    public char size;
    public double price;
}
