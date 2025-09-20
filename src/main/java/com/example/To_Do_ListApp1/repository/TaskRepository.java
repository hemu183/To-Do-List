package com.example.To_Do_ListApp1.repository;

import com.example.To_Do_ListApp1.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {
}
