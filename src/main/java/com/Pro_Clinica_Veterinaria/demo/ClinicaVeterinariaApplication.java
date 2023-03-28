package com.Pro_Clinica_Veterinaria.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
@SpringBootApplication
public class ClinicaVeterinariaApplication extends WebSecurityConfigurerAdapter {

    public static void main(String[] args) {
        SpringApplication.run(ClinicaVeterinariaApplication.class, args);
    }

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/css/**", "/js/**", "/img/**", "/**", "/error**").permitAll()
                .antMatchers("/principal/**").hasRole("admin")
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/")
                .defaultSuccessUrl("/principal")
                .failureUrl("/?error=true")
                .permitAll()
                .and()
                .logout()
                .logoutSuccessUrl("/")
                .permitAll();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService)
                .passwordEncoder(passwordEncoder);
    }
}
