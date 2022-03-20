package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentPostGresRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    StudentPostGresRepository repository;

    @PostConstruct
    void init(){
//        Student student = new Student();
//        repository.save(student);
        System.out.println(repository.findAll());
    }
}
