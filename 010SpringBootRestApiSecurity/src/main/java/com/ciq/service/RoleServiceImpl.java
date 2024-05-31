package com.ciq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.ciq.bean.RoleBean;
import com.ciq.enitity.Role;
import com.ciq.mapper.RoleMapper;
import com.ciq.repository.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleRepository roleRepository;

	@Override
	public Role findById(Long rid) {
		return roleRepository.findById(rid).get();
	}

	@Override
	public Role save(RoleBean roleBean) {
		Role role = RoleMapper.mapToRole(roleBean);
		return roleRepository.save(role);
	}

}
