package com.ngn.project.attendance.service;

import com.ngn.project.attendance.dao.EmployeeDao;
import com.ngn.project.attendance.entity.EmployeeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * ====================================================================
 * Created by DELL on 11/05/2019.
 * Description:
 * ====================================================================
 * Modified by:
 * Modified date:
 * Purpose:
 * ====================================================================
 */
@Service
public class EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    public String getName(){
        return "NGN ";
    }


    public String saveEmployee(){
        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setEmployeeId(1);
        employeeEntity.setEmployeeName("Tester");
        employeeEntity.setEmployeeCode("2019001");
        employeeEntity.setDob(new Date());
        employeeDao.save(employeeEntity);
        return "Success";

    }

    public List<EmployeeEntity> getAllEmployee(){
        return employeeDao.getAllEmployee();
    }


}
