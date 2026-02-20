package com.ecepolat.controller;

import com.ecepolat.dto.DtoHome;

public interface IHomeController {

    public DtoHome findHomeById(Long id);
}
