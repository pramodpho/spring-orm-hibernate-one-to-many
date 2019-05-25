package com.ngn.project.attendance.service;

import com.ngn.project.attendance.dao.StudentDao;
import com.ngn.project.attendance.dto.StudentDTO;
import com.ngn.project.attendance.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ====================================================================
 * Created by DELL on 15/05/2019.
 * Description:
 * ====================================================================
 * Modified by:
 * Modified date:
 * Purpose:
 * ====================================================================
 */
@Service
public class StudentService {
    @Autowired
    private StudentDao studentDao;

    public String save(StudentDTO studentDTO){

        if(studentDTO.getStudentId() == null){
            return "Student Id must be set.";
        }

        StudentEntity studentEntity = new StudentEntity(
                studentDTO.getStudentId(),studentDTO.getStudentCode(),studentDTO.getStudentName()
                ,studentDTO.getDob(),studentDTO.getGrade()
        );
        try {
            studentDao.save(studentEntity);
            return "saved successful.";
        }catch (Exception e){
            return "Error in saving";
        }

    }
}
