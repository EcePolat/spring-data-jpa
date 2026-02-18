package com.ecepolat.controller;

import com.ecepolat.dto.DtoCustomer;

public interface ICustomerController {

    public DtoCustomer findCustomerById(Long id);
}
