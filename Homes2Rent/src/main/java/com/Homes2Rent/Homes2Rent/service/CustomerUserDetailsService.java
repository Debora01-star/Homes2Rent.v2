package com.Homes2Rent.Homes2Rent.service;

import com.Homes2Rent.Homes2Rent.dto.UserDto;
import com.Homes2Rent.Homes2Rent.model.Authority;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
@Service

public class CustomerUserDetailsService implements UserDetailsService {



    private final UserService userService;

    public CustomerUserDetailsService(UserService userService) {
        this.userService = userService;
    }


    @Override
        public UserDetails loadUserByUsername(String username) {
            UserDto userDto = userService.getUser(username);


            String password = userDto.getPassword();

            Set<Authority> authorities = userDto.getAuthorities();
            List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
            for (Authority authority: authorities) {
                grantedAuthorities.add(new SimpleGrantedAuthority(authority.getAuthority()));
            }

            return new org.springframework.security.core.userdetails.User(username, password, grantedAuthorities);
        }

    }

