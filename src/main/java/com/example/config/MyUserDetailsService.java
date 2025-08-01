package com.example.config;

import com.example.entity.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        UserDetails user= User
//                .withDefaultPasswordEncoder()
//                .username("user")
//                .password("123456")
//                .roles("USER")
//                .build();
//
//        UserDetails admin=User
//                .withDefaultPasswordEncoder()
//                .username("admin")
//                .password("admin")
//                .roles("ADMIN")
//                .build();


        User user=new User(100L,"name1","123456");
        return new UserPrincipal(user);
    }
}
