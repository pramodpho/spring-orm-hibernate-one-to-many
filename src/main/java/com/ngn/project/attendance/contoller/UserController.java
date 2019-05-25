package com.ngn.project.attendance.contoller;

import com.ngn.project.attendance.dto.UserDTO;
import com.ngn.project.attendance.entity.UserEntity;
import com.ngn.project.attendance.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap model) {
        model.addAttribute("userList",userService.getUserList());
        return "user";
    }

    @ResponseBody
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String save(UserDTO userDTO) {
        userService.save(userDTO);
        return "Saved successfully.";
    }

    @RequestMapping(path = "/delete")
    public String delete(@RequestParam("id") int id, ModelMap model) {
        model.addAttribute("msg", userService.delete(id));
        return "redirect:/user";
    }




}
