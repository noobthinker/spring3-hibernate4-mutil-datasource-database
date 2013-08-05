package com.xkorey.db.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class GenericDao<T extends java.io.Serializable> {

    	
    @Autowired
    @Qualifier("masterSessionFactory")
    private SessionFactory masterSessionFactory;
    
    
    @Autowired
    @Qualifier("slaveSessionFactory")
    private SessionFactory slaveSessionFactory;
    
    
    private SessionFactory sessionFactory;
    
    
    private void fixSession(){
	String name=this.getClass().getName();
	/**
	 * �����master ���µ�dao ȫ��ָ��Ϊ masterSessionFactory
	 */
	if(name.indexOf("com.xkorey.db.master")>-1){
	    sessionFactory = masterSessionFactory;
	}
	/**
	 * Ĭ�ϵ�dao�� slaveSessionFactory �µĿ�
	 */
	else{
	    sessionFactory =  slaveSessionFactory;
	}
    }
    
    public Session getSession() {
	fixSession();
        return sessionFactory.getCurrentSession();
    }
    
}
