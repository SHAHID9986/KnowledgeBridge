package com.shahid.bookwebmvc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shahid.bookwebmvc.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User,String>{
	
}