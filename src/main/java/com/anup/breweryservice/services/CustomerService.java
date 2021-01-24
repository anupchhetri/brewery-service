package com.anup.breweryservice.services;

import com.anup.breweryservice.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getCustomerById(UUID customerId);
}
