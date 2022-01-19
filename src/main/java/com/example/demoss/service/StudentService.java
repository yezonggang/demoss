package com.example.demoss.service;

import com.example.demoss.mapper.StudentMapper;
import com.example.demoss.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentMapper studentMapper;

    public String getItemTest(){
        return  studentMapper.selectById(1).toString();
    }




}
