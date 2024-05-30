package com.ciq.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import static org.springframework.security.config.Customizer.*;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

	@Bean
	public UserDetailsService userDetailsService() {

		UserDetails ciq = User.builder().username("ciq").password("{noop}ciq").roles("USER").build();

		UserDetails vidvaan = User.builder().username("vidvaan").password("{noop}vidvaan").roles("USER").build();

		UserDetails admin = User.builder().username("admin").password("{noop}admin").roles("ADMIN").build();

		return new InMemoryUserDetailsManager(ciq, vidvaan, admin);
	}

	@Bean
	    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

	    	return http
            .csrf(AbstractHttpConfigurer::disable)
            .authorizeHttpRequests( auth -> auth
                    .requestMatchers("/public/home","/public/about").permitAll()
                    .requestMatchers("/private/findAll","/private/findById").hasRole("USER")
                    .requestMatchers("/admin").hasRole("ADMIN").anyRequest().authenticated()
            )
            .formLogin(withDefaults())
            .build();
	    }

}
