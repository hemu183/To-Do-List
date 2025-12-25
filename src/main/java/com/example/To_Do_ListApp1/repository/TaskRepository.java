package com.example.To_Do_ListApp1.repository;

import com.example.To_Do_ListApp1.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Repository
public interface TaskRepository extends JpaRepository<Task,Integer> {

}

