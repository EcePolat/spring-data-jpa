package com.ecepolat.services;

import com.ecepolat.dto.DtoHome;

public interface IHomeService {

    public DtoHome findHomeById(Long id);
}
