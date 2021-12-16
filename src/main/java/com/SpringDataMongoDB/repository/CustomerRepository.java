package com.SpringDataMongoDB.repository;

import com.SpringDataMongoDB.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface CustomerRepository extends MongoRepository<Customer, String> {

    public Customer findByFirstName(String firstName);
    public List<Customer> findByLastName(String lastName);

}
