package com.demo.pgExample.security;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class WebSecurityConfig {

    // @Bean
    // public InMemoryUserDetailsManager userDetailsManager() {

    // UserDetails user =
    // User.builder().username("mohamed1").password("{bvcrypt}test123").roles("ADMIN").build();

    // return new InMemoryUserDetailsManager(user);
    // }

    @Bean
    public UserDetailsManager userDetailsManager(DataSource datasource) {

        JdbcUserDetailsManager jdbcUserDetailsManager = new JdbcUserDetailsManager(datasource);

        String userByUserNameQuery = "select email,password,enabled from users where email=?";
        String authoritesByUserNameQuery = "select email,authority from authorities where email=?";

        jdbcUserDetailsManager.setUsersByUsernameQuery(userByUserNameQuery);
        jdbcUserDetailsManager.setAuthoritiesByUsernameQuery(authoritesByUserNameQuery);
        return jdbcUserDetailsManager;
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder(10);
    }

    // @Bean
    // public DaoAuthenticationProvider authenticationProvider() {
    //     DaoAuthenticationProvider authentication = new DaoAuthenticationProvider();
    //     authentication.setPasswordEncoder(passwordEncoder());
    //         authentication.setUserDetailsService(UserDetailsSer);
    //     return authentication;

    // }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests((auth) -> {
                    auth.requestMatchers(HttpMethod.GET, "/*/**").permitAll();
                });

        http
                .authorizeHttpRequests((auth) -> {
                    auth.requestMatchers(HttpMethod.POST, "/*/**").permitAll();
                });
        http.csrf(csrf -> {
            csrf.disable();
        });

        http.httpBasic(Customizer.withDefaults());

        return http.build();
    }

}