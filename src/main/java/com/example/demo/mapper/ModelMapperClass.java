package com.example.demo.mapper;

import com.example.demo.dto.CustomerDTO;
import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.service.CustomerService;
import org.modelmapper.ModelMapper;

import java.text.ParseException;


public class ModelMapperClass {


    public CustomerDTO convertDto(Customer customer) {
        CustomerDTO customerDTO = new ModelMapper().map(customer, CustomerDTO.class);
        return customerDTO;
    }

    public Customer convertToEntity(CustomerDTO customerDTO)  {
        Customer customer = new ModelMapper().map(customerDTO, Customer.class);
        return customer;
    }


}
