package com.ngn.project.attendance.entity;

import com.ngn.project.attendance.dto.Course;

import javax.persistence.*;

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
@Table(name = "subject")
public class SubjectEntity {
    @Id
    @Column(name = "subjectId",unique = true)
    private Integer subjectId;
    @Column(name = "subjectName")
    private String subjectName;
    @Column(name = "score")
    private double score;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "courseId")
    private CourseEntity course;

    public SubjectEntity() {
    }

    public SubjectEntity(Integer subjectId, String subjectName, double score, CourseEntity course) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.score = score;
        this.course = course;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public CourseEntity getCourse() {
        return course;
    }

    public void setCourse(CourseEntity course) {
        this.course = course;
    }
}
