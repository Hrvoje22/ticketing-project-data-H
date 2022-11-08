package com.cydeo.entity;


import com.cydeo.enums.Status;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "tasks")
@Where(clause = "is_deleted=false")
public class Task extends BaseEntity{

    private String taskSubject;
    @Column(columnDefinition = "TEXT")
    private String taskDetail;
    @Enumerated(EnumType.STRING)
    private Status taskStatus;
    @Column(columnDefinition = "DATE")
    private LocalDate assignedDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id")
    private User assignedEmployee;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id") //not mandatory because it will make it like that by default
    private Project project;






}
