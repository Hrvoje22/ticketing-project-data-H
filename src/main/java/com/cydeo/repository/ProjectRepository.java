package com.cydeo.repository;

import com.cydeo.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository newer versions don't need it
public interface ProjectRepository extends JpaRepository<Project,Long> {

    Project findByProjectCode(String code);


}
