package com.ngn.project.attendance.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
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
@Entity
@Table(name = "course")
public class CourseEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "courseId",unique = true)
    private Integer courseId;
    @Column(name = "courseName")
    private String courseName;
    @Column(name = "courseType")
    private String courseType;
    @Column(name = "status")
    private Character status;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "courseId", referencedColumnName = "courseId")
    private List<SubjectEntity> subjects;

    public CourseEntity() {
    }

    public CourseEntity(String courseName, String courseType, Character status, List<SubjectEntity> subjects) {
        this.courseName = courseName;
        this.courseType = courseType;
        this.status = status;
        this.subjects = subjects;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public List<SubjectEntity> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<SubjectEntity> subjects) {
        this.subjects = subjects;
    }
}
