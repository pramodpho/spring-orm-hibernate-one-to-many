package com.ngn.project.attendance.service;

import com.ngn.project.attendance.dao.CourseDao;
import com.ngn.project.attendance.dto.Course;
import com.ngn.project.attendance.dto.Subject;
import com.ngn.project.attendance.entity.CourseEntity;
import com.ngn.project.attendance.entity.SubjectEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;

/**
 * ====================================================================
 * Created by DELL on 17/05/2019.
 * Description:
 * ====================================================================
 * Modified by:
 * Modified date:
 * Purpose:
 * ====================================================================
 */
@Service
public class CourseService {

    @Autowired
    private CourseDao courseDao;

    @Transactional
    public String save(CourseEntity course){
        courseDao.save(course);
        return "saved successfully";
    }

    @Transactional(readOnly = true)
    public List<CourseEntity> getCourse() {
        return courseDao.getCourse();
    }

    @Transactional(readOnly = true)
    public CourseEntity getSingleCourse(int id) throws IOException{
        return courseDao.getSingleCourse(id);
    }

    @Transactional
    public String deleteCourse(Integer id) {
        courseDao.deleteCourse(id);
        return "Deleted Succesfully";
    }
}
