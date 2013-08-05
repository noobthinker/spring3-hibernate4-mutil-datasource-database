package com.xkorey.db.slave.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.xkorey.db.dao.GenericDao;
import com.xkorey.db.slave.model.Userinfo;

@Repository("UserinfoDao")
public class UserinfoDao extends GenericDao<Userinfo>{
    
//    @Autowired
//    @Qualifier("slaveSessionFactory")
//    private SessionFactory sessionFactory;

}
