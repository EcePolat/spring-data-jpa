package com.ecepolat.services.impl;

import com.ecepolat.dto.DtoAddress;
import com.ecepolat.dto.DtoCustomer;
import com.ecepolat.entities.Address;
import com.ecepolat.repository.AddressRepository;
import com.ecepolat.services.IAddressService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressServiceImpl implements IAddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public DtoAddress findAddressById(Long id) {

        DtoAddress dtoAddress = new DtoAddress();

        Optional<Address> optional = addressRepository.findById(id);

        if(optional.isEmpty()){
            return null;
        }

        Address address = optional.get();
        BeanUtils.copyProperties(address, dtoAddress);

        DtoCustomer dtoCustomer = new DtoCustomer();
        dtoCustomer.setId(address.getCustomer().getId());
        dtoCustomer.setName(address.getCustomer().getName());
        //dtoCustomer.setAddress(dtoAddress);
        dtoAddress.setCustomer(dtoCustomer);

        return dtoAddress;
    }
}
