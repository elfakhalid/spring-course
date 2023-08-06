package com.khalid.customer;

import com.khalid.Main;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class CustomerDataAccessService implements CustomerDAO{
    private static  List<Customer> customers;

    static {
        customers =new ArrayList<>();
        Customer alex=new Customer(1,28,"alex","alex@gmail.com");
        customers.add(alex);
        Customer jamila=new Customer(2,24,"jamila","jamila@gmail.com");
        customers.add(jamila);
    }
    @Override
    public List<Customer> selectAllCustomers() {
        return customers;
    }

    @Override
    public Optional<Customer> selectCustomer(Integer id) {
        return customers.stream().filter(c ->c.getId().equals(id)).findFirst();
    }
}
