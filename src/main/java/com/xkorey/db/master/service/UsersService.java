package com.xkorey.db.master.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xkorey.db.master.dao.UsersDao;
import com.xkorey.db.master.model.Users;

@Service("UsersService")
@Transactional(value="masterTransactionManager")
public class UsersService {
    
    @Autowired
    @Qualifier("UsersDao")
    private UsersDao usersDao;
    
    public int findUserAgeById(int id){
	Users users = (Users) usersDao.getSession().get(Users.class,id);
	return users.age;
    }
}
