package com.jyoticodes.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jyoticodes.springboot.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer>{

}

