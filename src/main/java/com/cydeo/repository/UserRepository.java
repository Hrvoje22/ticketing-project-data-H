package com.cydeo.repository;

import com.cydeo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

public interface UserRepository extends JpaRepository<User,Long> { //goes with entities

    User findByUserName(String username);

    @Transactional //if something goes bad it goes back to original
    void deleteByUserName(String username);



}
