package com.ngn.project.attendance.service;

import com.ngn.project.attendance.base.BaseService;
import com.ngn.project.attendance.dao.UserDao;
import com.ngn.project.attendance.dto.UserDTO;
import com.ngn.project.attendance.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
public class UserService extends BaseService {
    @Autowired
    private UserDao userDao;

    public List<UserDTO> getUserList(){
        return userDao.getUserList();
    }

    public void save(UserDTO userDTO) {
        UserEntity userEntity = convertToEntity(userDTO);
        userDao.save(userEntity);
    }

    public String delete(Integer id){
        UserEntity userEntity = new UserEntity();
        userEntity.setUserId(id);
        userDao.delete(userEntity);
        return "Success";
    }

    private UserEntity convertToEntity(UserDTO userDTO){
        UserEntity userEntity = new UserEntity();
        userEntity.setUserId(userDTO.getUserId());
        userEntity.setPassword(userDTO.getPassword());
        userEntity.setUsername(userDTO.getUsername());
        userEntity.setStatus(userDTO.getStatus());
        return userEntity;
    }
}
