package com.api_rest.jpa_repository.service;

import com.api_rest.jpa_repository.model.dto.UserDTO;
import com.api_rest.jpa_repository.model.entity.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {

    List<User> findAll();

    Optional<User> findById(Long id);

    User save(User user);

    void deletedById(Long id);
}
