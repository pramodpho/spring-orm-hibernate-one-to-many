package com.ngn.project.attendance.dao;

import com.ngn.project.attendance.base.BaseDao;
import com.ngn.project.attendance.entity.StudentEntity;
import org.springframework.stereotype.Repository;

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
@Repository
public class StudentDao extends BaseDao {

    public void save(StudentEntity studentEntity){
        saveOrUpdate(studentEntity);
    }
}
