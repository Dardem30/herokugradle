package com.example.demo.service;

import com.example.demo.DAO.CastomerDAO;
import com.example.demo.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Роман on 01.11.2017.
 */
@Service
@Transactional
public class CustomerService {
    @Autowired
    private CastomerDAO castomerDAO;
    public List<Customer> findAll(){
        return (List<Customer>) castomerDAO.findAll();
    }
    public void saveCustomer(Customer customer){
        castomerDAO.save(customer);
    }
}
