package com.cydeo.service;

import com.cydeo.dto.TaskDTO;

import java.util.List;

public interface TaskService {

    List<TaskDTO> listAllTasks();

    void save(TaskDTO dto);

    void update(TaskDTO dto);

    void delete(Long id); //we don't have anything unique except id

    TaskDTO findById(Long id);




}
