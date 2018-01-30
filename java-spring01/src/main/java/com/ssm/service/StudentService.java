package com.ssm.service;

import java.util.List;

import com.ssm.entity.Student;

public interface StudentService {
    //查询所有
    List<Student> selectFind(Student student)throws Exception;
    //添加
    public int add(Student student);
    //删除
    public int delete(int id);
    //修改
    public int update(Student student);
    //查询
    public Student select(String name);

}
