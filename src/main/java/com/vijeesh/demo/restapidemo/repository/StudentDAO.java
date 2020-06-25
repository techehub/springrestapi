package com.vijeesh.demo.restapidemo.repository;

import com.vijeesh.demo.restapidemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDAO extends JpaRepository <Student, Long>{
}
