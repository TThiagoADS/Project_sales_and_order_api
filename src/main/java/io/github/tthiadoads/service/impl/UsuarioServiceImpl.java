package io.github.tthiadoads.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UsuarioServiceImpl implements UserDetailsService {

    @Autowired
    private PasswordEncoder encoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException { //resposavel por carregar o usuario no db
            if(!username.equals("admin")){
                throw new UsernameNotFoundException("User not found");
            }


        return User
                .builder()
                .username("admin")
                .password(encoder.encode("123"))
                .roles("ADMIN", "USER")
                .build();

    }
}
