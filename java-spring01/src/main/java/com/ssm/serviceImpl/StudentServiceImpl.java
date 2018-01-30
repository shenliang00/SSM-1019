package com.ssm.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.entity.Student;
import com.ssm.dao.StudentDao;
import com.ssm.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> selectFind(Student student) throws Exception {

        return studentDao.selectFind(student);
    }

    @Override
    public int add(Student student) {

        return studentDao.add(student);
    }

    @Override
    public int delete(int id) {

        return studentDao.delete(id);
    }

    @Override
    public int update(Student student) {

        return studentDao.update(student);
    }

    @Override
    public Student select(String name) {

        return studentDao.select(name);
    }

}
