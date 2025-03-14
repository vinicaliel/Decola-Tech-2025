package me.dio.service;

import me.dio.domain.model.User;

import org.springframework.stereotype.Service;

@Service
public interface UserService {

    User findById(long id);

    User create (User userToCreate);
}
