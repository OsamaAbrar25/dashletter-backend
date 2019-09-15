package com.dashletter.dashletterbackend.Authentication;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import static com.dashletter.dashletterbackend.Authentication.SecurityConstants.*;

@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsServiceImpl userDetailsService;
    @Autowired
    private MerchantDetailsServiceImpl merchantDetailsService;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    /*public WebSecurity(UserDetailsService userDetailsService, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userDetailsService = userDetailsService;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }*/

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().authorizeRequests()
                .antMatchers(HttpMethod.POST, USER_SIGN_UP_URL).permitAll()
                .antMatchers(HttpMethod.POST, MERCHANT_SIGN_UP_URL).permitAll()
                .anyRequest().authenticated()
                .and()
                .addFilter(new UserJWTAuthenticationFilter(authenticationManager()))
                .addFilter(new UserJWTAuthorizationFilter(authenticationManager()))
                .addFilter(new MerchantJWTAuthenticationFilter(authenticationManager()))
                .addFilter(new MerchantJWTAuthorizationFilter(authenticationManager()));
    }

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder);
        auth.userDetailsService(merchantDetailsService).passwordEncoder(bCryptPasswordEncoder);
    }
}