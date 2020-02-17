package com.lti.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.daos.GenericDao;
import com.lti.daos.GenericDaoImp;
import com.lti.entities.Users;
import com.lti.exceptions.HrException;


@Service
public class UserServiceImp implements UserService{

	@Autowired
	private GenericDao dao;

	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public boolean addUser(Users user) throws HrException {
		
		return dao.addUser(user);
		
	}

	public ArrayList<Users> getDeptList() throws HrException {
		return dao.getDeptList();
	}
	
}
