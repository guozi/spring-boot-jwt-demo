package me.guozi.springbootjwtdemo.service;

import me.guozi.springbootjwtdemo.dao.UserInfoRepository;
import me.guozi.springbootjwtdemo.dto.UserDTO;
import me.guozi.springbootjwtdemo.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by chenyun on 2019-07-09
 */
@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    private UserInfoRepository userInfoRepository;

    @Autowired
    private PasswordEncoder bcryptEncoder;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserInfo user = userInfoRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }

        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
            new ArrayList<>());
    }

    public UserInfo save(UserDTO user) {
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername(user.getUsername());
        userInfo.setPassword(bcryptEncoder.encode(user.getPassword()));
        userInfo.setMobile(user.getMobile());
        return userInfoRepository.save(userInfo);
    }
}
