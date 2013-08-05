package com.xkorey.db.master.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.xkorey.db.dao.GenericDao;
import com.xkorey.db.master.model.Users;

@Repository("UsersDao")
public class UsersDao extends GenericDao<Users>{
    
//  @Autowired
//  @Qualifier("masterSessionFactory")
//  private SessionFactory sessionFactory;
    
}
