package com.ecepolat.controller;

import com.ecepolat.dto.DtoAddress;

public interface IAddressController {

    public DtoAddress findAddressById(Long id);
}
