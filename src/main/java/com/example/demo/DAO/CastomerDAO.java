package com.example.demo.DAO;

import com.example.demo.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Роман on 01.11.2017.
 */
public interface CastomerDAO extends CrudRepository<Customer, Integer> {
}
