package com.ngn.project.attendance.base;

import com.ngn.project.attendance.dto.Course;
import org.hibernate.Session;
import org.hibernate.transform.AliasToBeanConstructorResultTransformer;
import org.hibernate.transform.AliasToBeanResultTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Properties;


public abstract class BaseDao {
    protected String sqlQuery;
    @PersistenceContext
    protected EntityManager emf;
    @Autowired
    @Qualifier("queryProps")
    protected Properties properties;

    protected Session getCurrentSession() {
        return emf.unwrap(Session.class);
    }

    protected org.hibernate.query.Query sqlQuery(String query, Class dtoClazz) {
        return getCurrentSession()
                .createSQLQuery(query)
                .setResultTransformer(new AliasToBeanResultTransformer(dtoClazz));
    }

    protected org.hibernate.query.Query sqlQuery(String query) {
        return getCurrentSession().createSQLQuery(query);
    }

    protected Query persistenceQuery(String query, Class entityClazz) {
        return emf.createNativeQuery(query, entityClazz);
    }

    protected void saveOrUpdate(Object obj) {
        getCurrentSession().saveOrUpdate(obj);
    }

    protected void deleteE(Object obj) {
        emf.remove(emf.contains(obj) ? obj : emf.merge(obj));
    }

}




























