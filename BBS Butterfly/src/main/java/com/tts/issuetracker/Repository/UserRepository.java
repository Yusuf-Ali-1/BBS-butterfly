package com.tts.issuetracker.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tts.issuetracker.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	
}

