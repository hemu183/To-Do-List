package com.example.To_Do_ListApp1.service;

import com.example.To_Do_ListApp1.model.Task;
import com.example.To_Do_ListApp1.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TaskServiceImpl {
    @Autowired
    TaskRepository taskRepository;

    public void addTask(Task task) {
        taskRepository.save(task);
    }


    public String loaded(){
        List<Task> Tasks = new ArrayList<>(Arrays.asList(

        new Task(1, "Buy groceries", "Milk, Eggs, Bread", "PENDING"),

        new Task(2, "Finish project", "Complete the Spring Boot backend module", "IN_PROGRESS"),

        new Task(3, "Workout", "Evening gym session", "COMPLETED"),

        new Task(4, "Pay bills", "Electricity and Internet bills", "PENDING"),

        new Task(5, "Call mom", "Weekend family catch-up", "PENDING")));

        taskRepository.saveAll(Tasks);
        return "Loaded";

}

    public List<Task> getAllTask() {
        return taskRepository.findAll();
    }
}
