package com.ngn.project.attendance.dao;

import com.ngn.project.attendance.base.BaseDao;
import com.ngn.project.attendance.dto.UserDTO;
import com.ngn.project.attendance.entity.EmployeeEntity;
import org.hibernate.Session;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * ====================================================================
 * Created by DELL on 13/05/2019.
 * Description:
 *
 * Modified by:
 * Modified date:
 * Purpose:
 * ====================================================================
 */
@Repository
public class EmployeeDao extends BaseDao {

    public void save(EmployeeEntity employeeEntity){
        Session session = emf.unwrap(Session.class);
        session.saveOrUpdate(employeeEntity);
    }

    public List<EmployeeEntity> getAllEmployee(){
        return (List<EmployeeEntity>)persistenceQuery("select * from employee",EmployeeEntity.class).getResultList();
    }




}
