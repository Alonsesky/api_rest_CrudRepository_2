package com.api_rest.jpa_repository.service.impl;

import com.api_rest.jpa_repository.model.dto.UserDTO;
import com.api_rest.jpa_repository.model.entity.User;
import com.api_rest.jpa_repository.repository.IUserRepository;
import com.api_rest.jpa_repository.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService {

    @Autowired
    private IUserRepository userRepository;


    @Transactional(readOnly = true)
    @Override
    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    @Transactional
    @Override
    public User save(User user) {
        userRepository.save(user);
        return user;
    }

    @Transactional
    @Override
    public void deletedById(Long id) {
        userRepository.deleteById(id);
    }
}
