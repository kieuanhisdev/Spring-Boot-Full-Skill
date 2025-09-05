package dev.kieuanh.SpringBootFullSkill.service.impl;

import dev.kieuanh.SpringBootFullSkill.dto.request.UserRequestDTO;
import dev.kieuanh.SpringBootFullSkill.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public int addUser(UserRequestDTO user) {
        System.out.println("UserServiceImpl addUser");
        return 0;
    }
}
