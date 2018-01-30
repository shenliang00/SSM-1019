package com.ssm.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.entity.Student;
import com.ssm.service.StudentService;

@Controller

public class StudentController {
    @Autowired
    private StudentService studentService;

    //http://localhost:8080/springmvc002/queryStudent.do

    @RequestMapping("/queryStudent")

    public ModelAndView StudentList()throws Exception{
        ModelAndView mav = new ModelAndView();
        List<Student>studentList = studentService.selectFind(null);
        mav.addObject("studentList",studentList);
        mav.setViewName("student/studentList");
        return mav;
    }

}
