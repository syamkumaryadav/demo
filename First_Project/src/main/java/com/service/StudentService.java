package com.service;

import com.dao.StudentDao;
import com.model.Student;

public class StudentService {

    public void registerStudent(Student student) {
        StudentDao studentDao = new StudentDao();
        studentDao.insertStudent(student);
    }

	
}

