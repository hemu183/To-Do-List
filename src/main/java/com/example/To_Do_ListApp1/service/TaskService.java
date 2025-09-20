package com.example.To_Do_ListApp1.service;

import com.example.To_Do_ListApp1.entity.Task;

public interface TaskService {
    public Task addTask(Task task);
    public void deleteTask(Long Id);

    }
