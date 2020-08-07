package com.tts.issuetracker.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tts.issuetracker.entity.DeveloperEntity;

@Repository
public interface DeveloperDao extends JpaRepository<DeveloperEntity, Integer> {

}
