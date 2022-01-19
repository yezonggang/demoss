package com.example.demoss.controller;

import com.example.demoss.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

@RestController
@Api("测试swagger的api")
@RequestMapping("/One")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/getStudent")
    @ApiOperation(value = "查询学生", notes = "xzxxxx")

    public String getStudentByID() {
        return studentService.getItemTest();
    }
}
