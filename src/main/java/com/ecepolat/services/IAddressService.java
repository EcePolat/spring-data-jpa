package com.ecepolat.services;

import com.ecepolat.dto.DtoAddress;

public interface IAddressService {

    public DtoAddress findAddressById(Long id);
}
