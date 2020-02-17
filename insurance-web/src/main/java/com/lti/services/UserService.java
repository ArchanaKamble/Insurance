package com.lti.services;

import java.util.ArrayList;


import com.lti.entities.Users;
import com.lti.exceptions.HrException;



public interface UserService {

	public boolean addUser(Users user) throws HrException;
	public ArrayList<Users> getDeptList() throws HrException;
}
