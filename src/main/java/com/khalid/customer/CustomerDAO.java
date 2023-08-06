package com.khalid.customer;

import java.util.List;
import java.util.Optional;

public interface CustomerDAO {
    public List<Customer> selectAllCustomers();
    public Optional<Customer>selectCustomer(Integer id);
}
