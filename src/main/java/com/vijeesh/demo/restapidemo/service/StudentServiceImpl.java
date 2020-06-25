package com.vijeesh.demo.restapidemo.service;

import com.vijeesh.demo.restapidemo.entity.Student;
import com.vijeesh.demo.restapidemo.model.StudentDTO;
import com.vijeesh.demo.restapidemo.repository.StudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentDAO dao;

    public StudentDAO getDao() {
        return dao;
    }

    public void setDao(StudentDAO dao) {
        this.dao = dao;
    }

    @Override
    public StudentDTO getStudentInfo(long id) {
        return null;
    }

    @Override
    public List<StudentDTO> getAllStudent() {
        List<StudentDTO> studentDTOS = new ArrayList();
        for (Student student : dao.findAll()) {
            StudentDTO s = new StudentDTO();
            s.setRollno(student.getId().toString());
            s.setName(student.getName());
            s.setBranch(student.getBranch());
            studentDTOS.add(s);
        }

        return studentDTOS;
    }


}
