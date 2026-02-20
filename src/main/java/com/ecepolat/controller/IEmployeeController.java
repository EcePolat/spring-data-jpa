package com.ecepolat.controller;

import com.ecepolat.dto.DtoEmployee;

import java.util.List;

public interface IEmployeeController {
    public List<DtoEmployee> findAllEmployees();
}
