package com.cydeo.repository;

import com.cydeo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> { //goes with entities

    List<User> findAllByIsDeletedOrderByFirstNameDesc(Boolean deleted);
    User findByUserNameAndIsDeleted(String username, Boolean deleted);

    @Transactional //if something goes bad it goes back to original //it can be on the class level too
    void deleteByUserName(String username);

    List<User> findByRoleDescriptionIgnoreCaseAndIsDeleted(String description,Boolean deleted);


}
