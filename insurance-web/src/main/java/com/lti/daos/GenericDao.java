package com.lti.daos;

import java.util.ArrayList;

import com.lti.entities.Users;
import com.lti.exceptions.HrException;



public interface GenericDao {
	public boolean addUser(Users user) throws HrException;
	public ArrayList<Users> getDeptList() throws HrException;
}
