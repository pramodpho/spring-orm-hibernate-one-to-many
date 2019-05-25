package com.ngn.project.attendance.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

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
@Entity
@Table(name = "student")
public class StudentEntity implements Serializable{
    @Id
    @Column(name = "studentId")
    private Integer studentId;
    @Column(name = "studentCode")
    private String studentCode;
    @Column(name = "studentName")
    private String studentName;
    @Column(name = "dob")
    private Date dob;
    @Column(name = "grade")
    private String grade;

    public StudentEntity() {
    }

    public StudentEntity(Integer studentId, String studentCode, String studentName, Date dob, String grade) {
        this.studentId = studentId;
        this.studentCode = studentCode;
        this.studentName = studentName;
        this.dob = dob;
        this.grade = grade;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
