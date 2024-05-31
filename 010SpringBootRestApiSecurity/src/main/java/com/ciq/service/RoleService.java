package com.ciq.service;

import com.ciq.bean.RoleBean;
import com.ciq.enitity.Role;

public interface RoleService {
	
	public Role save(RoleBean roleBean);
	
	public Role findById(Long rid);
	

}
