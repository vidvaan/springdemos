package com.ciq.mapper;

import com.ciq.bean.UserBean;
import com.ciq.enitity.User;

public class UserMapper {
	
	public static User mapToUser(UserBean userBean) {
		User user = new User();
		user.setUname(userBean.getUname());
		user.setEmail(userBean.getEmail());
		user.setPassword(userBean.getPassword());
		return user;
	}

}
