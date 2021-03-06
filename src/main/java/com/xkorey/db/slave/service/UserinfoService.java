package com.xkorey.db.slave.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xkorey.db.slave.dao.UserinfoDao;
import com.xkorey.db.slave.model.Userinfo;

@Service("UserinfoService")
@Transactional(value="slaveTransactionManager")
public class UserinfoService {

    @Autowired
    @Qualifier("UserinfoDao")
    private UserinfoDao userinfoDao;
    
    public String findUserInfoById(int id){
	Userinfo userinfo = (Userinfo) userinfoDao.getSession().get(Userinfo.class,id);
	return userinfo.info;
    }
}
