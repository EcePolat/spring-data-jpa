package com.ecepolat.services;

import com.ecepolat.dto.DtoCustomer;

public interface ICustomerService {

    public DtoCustomer findCustomerById(Long id);
}
