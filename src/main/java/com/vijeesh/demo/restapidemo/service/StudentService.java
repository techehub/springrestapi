package com.vijeesh.demo.restapidemo.service;

import com.vijeesh.demo.restapidemo.model.StudentDTO;

import java.util.List;

public interface StudentService {
    StudentDTO getStudentInfo (long id);
    List<StudentDTO> getAllStudent ();
}
