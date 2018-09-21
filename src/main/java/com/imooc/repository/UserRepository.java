package com.imooc.repository;

import org.springframework.data.repository.CrudRepository;

import com.imooc.entity.User;

public interface UserRepository extends CrudRepository<User, Long>{

}
