package com.ciq.bean;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserBean {
	private String uname;
	private String email;
	private String password;
	private List<String> roles;

}
