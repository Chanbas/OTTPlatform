package com.app.factory;

import com.app.Dao.USerDao;
import com.app.Dao.UserDaoImpl;
public class UserFactory {

	public static UserDaoImpl getUser() {
		return new UserDaoImpl();
	}
}
