package com.boot.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.boot.demo.entity.LoginUser;

public interface LoginUserRepo extends CrudRepository<LoginUser, String>{

}
