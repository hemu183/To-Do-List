package com.example.To_Do_ListApp1.service;

import com.example.To_Do_ListApp1.entity.Task;
import com.example.To_Do_ListApp1.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    TaskRepository taskRepository;

    // Add task
    public Task addTask(Task task){
        return taskRepository.save(task);
    }

//    // Get Tasks
//    public List<Task> getTask() {
//        return taskRepository.findAllById();
//    }

    // Delete Task
    public void deleteTask(Long Id){
        taskRepository.deleteById(Id);

    }
}
