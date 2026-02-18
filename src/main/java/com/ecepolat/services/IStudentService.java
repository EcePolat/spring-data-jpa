package com.ecepolat.services;

import com.ecepolat.dto.DtoStudent;
import com.ecepolat.dto.DtoStudentIU;
import com.ecepolat.entities.Student;

import java.util.List;

public interface IStudentService {

    public DtoStudent saveStudent(DtoStudentIU student);

    public List<DtoStudent> getAllStudents();

    public DtoStudent getStudentById(Integer id);

    public void deleteStudent(Integer id);

    public DtoStudent updateStudent(Integer id, DtoStudentIU dtoStudentIU);
}
