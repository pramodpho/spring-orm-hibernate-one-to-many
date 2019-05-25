package com.ngn.project.attendance.contoller;

import com.ngn.project.attendance.dto.StudentDTO;
import com.ngn.project.attendance.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
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
@Controller
@RequestMapping("/student")
public class StudentController {

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);

        // true passed to CustomDateEditor constructor means convert empty String to null
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }
    @Autowired
    private StudentService studentService;

    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap model) {
        return "student";
    }

    @ResponseBody
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String save(StudentDTO studentDTO){
        return studentService.save(studentDTO);
    }
}
