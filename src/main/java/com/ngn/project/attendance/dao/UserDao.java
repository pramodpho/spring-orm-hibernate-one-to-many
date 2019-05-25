package com.ngn.project.attendance.dao;

import com.ngn.project.attendance.base.BaseDao;
import com.ngn.project.attendance.dto.UserDTO;
import com.ngn.project.attendance.entity.UserEntity;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
@Repository
public class UserDao extends BaseDao {

    @Transactional(readOnly = true)
    public List<UserDTO> getUserList() {
        String sql = properties.getProperty("UserDao.getUserList");
        Query query = sqlQuery(sql, UserDTO.class);
        return query.list();

    }

    @Transactional
    public void save(UserEntity userEntity) {
        saveOrUpdate(userEntity);
    }

    @Transactional
    public void delete(UserEntity userEntity) {
        deleteE(userEntity);
    }


}
