package com.ngn.project.attendance.contoller;

import com.ngn.project.attendance.dto.Course;
import com.ngn.project.attendance.entity.CourseEntity;
import com.ngn.project.attendance.entity.SubjectEntity;
import com.ngn.project.attendance.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
@Controller
@RequestMapping(value = "/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("courseList", courseService.getCourse());
        return "course";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public String save(CourseEntity course) {
        return courseService.save(course);
    }

    @RequestMapping(value = "/getSingleCourse/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CourseEntity getSingleCourse(@PathVariable("id") int id, Model model) throws IOException {
        //model.addAttribute("course", courseService.getSingleCourse(id));
        CourseEntity courseEntity = courseService.getSingleCourse(id);
        List subjects = courseEntity.getSubjects();
        courseEntity.setSubjects(subjects);
        return courseEntity;
    }

    @RequestMapping(value = "/deleteCourse/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String deleteCourse(@PathVariable("id") int id) {
        return courseService.deleteCourse(id);
    }

}
