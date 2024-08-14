package com.api_rest.jpa_repository.repository;

import com.api_rest.jpa_repository.model.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends CrudRepository<User, Long> {
}
