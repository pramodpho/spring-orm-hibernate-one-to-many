package com.ngn.project.attendance.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * ====================================================================
 * Created by DELL on 13/05/2019.
 * Description:
 * ====================================================================
 * Modified by:
 * Modified date:
 * Purpose:
 * ====================================================================
 */
@Entity
@Table(name = "Employee")
public class EmployeeEntity implements Serializable {
    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "employeeid",unique = true)
    private Integer employeeId;
    @Column(name = "employeename")
    private String employeeName;
    @Column(name = "employeecode")
    private String employeeCode;
    @Column(name = "dob")
    private Date dob;

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
}
