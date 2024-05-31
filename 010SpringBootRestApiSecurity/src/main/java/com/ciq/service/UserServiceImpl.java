package com.ciq.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.bean.UserBean;
import com.ciq.enitity.Role;
import com.ciq.enitity.User;
import com.ciq.mapper.UserMapper;
import com.ciq.repository.RoleRepository;
import com.ciq.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RoleRepository roleRepository;

	@Override
	public User save(UserBean userBean) {
		User user = UserMapper.mapToUser(userBean);
		List<String> roles = userBean.getRoles();
		Set<Role> roleSet = new HashSet<>();
		for (String roleName : roles) {
			roleSet.add(roleRepository.findByRname(roleName));
		}

		user.setRoles(roleSet);

		return userRepository.save(user);
	}

}
