package mx.escapeSchool.market.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder 
			auth) throws Exception {
		
		auth.inMemoryAuthentication()
		.withUser("myUser").password(
				"{noop}myPass").roles("USER")
		.and()
		.withUser("myAdmin").password(
				"{noop}myPassAdmin").roles("ADMIN");		
		
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.httpBasic()
		.and()
		.authorizeRequests()
		.antMatchers(HttpMethod.GET,"/product/**").hasAnyRole("ADMIN","USER")
		.antMatchers(HttpMethod.POST,"/product/**").hasRole("ADMIN")
		.antMatchers(HttpMethod.PUT,"/product/**").hasRole("ADMIN")
		.antMatchers(HttpMethod.DELETE,"/product/**").hasRole("ADMIN")
		.and()
		.csrf().disable()
		.formLogin().disable();
		
	}

	
}
