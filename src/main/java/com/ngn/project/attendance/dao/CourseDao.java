package com.ngn.project.attendance.dao;

import com.ngn.project.attendance.base.BaseDao;
import com.ngn.project.attendance.dto.Course;
import com.ngn.project.attendance.entity.CourseEntity;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
@Repository
public class CourseDao extends BaseDao {

    public void save(Object object) {
        saveOrUpdate(object);
    }

    public List<CourseEntity> getCourse() {
        return getCurrentSession().createQuery("from CourseEntity", CourseEntity.class).list();
    }

    public CourseEntity getSingleCourse(int id) {
        return (CourseEntity) getCurrentSession().get(CourseEntity.class, id);
    }

    public void deleteCourse(Integer id) {
        CourseEntity courseEntity = getCurrentSession().get(CourseEntity.class, id);
        if (courseEntity != null) {
            getCurrentSession().delete(courseEntity);
            System.out.println("Course is deleted");
        }
    }
}
