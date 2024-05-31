package com.ciq.mapper;

import com.ciq.bean.RoleBean;
import com.ciq.enitity.Role;

public class RoleMapper {
	public static Role mapToRole(RoleBean roleBean) {
		Role role = new Role();
		role.setRname(roleBean.getRname());
		return role;
	}
}
