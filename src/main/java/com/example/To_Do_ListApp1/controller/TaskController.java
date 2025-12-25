package com.example.To_Do_ListApp1.controller;

import com.example.To_Do_ListApp1.model.Task;
import com.example.To_Do_ListApp1.service.TaskServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class TaskController {

    @Autowired
    TaskServiceImpl taskService;

    // Adding a task
    @PostMapping("Task")
    public void addTask(@RequestBody Task task){
        taskService.addTask(task);
    }


    // Fetching all tasks
    @GetMapping("Task")
    public List<Task> viewAllTasks(){
        return taskService.getAllTask();
    }


    //Deleting a Task by task Object
    @DeleteMapping("Task")
    public Task deleteTask(@RequestBody Task obj){
       return taskService.deleteTask(obj);
    }


    //Deleting a Task by id
    @DeleteMapping("Task/{id}")
    public String deleteTask(@PathVariable  int id){
        taskService.deleteTaskByid(id);
        return "Deleted Successfully";
    }


    // Updating status parameter
    @PatchMapping("Task")
    public String updateStatus(@RequestBody Task obj){
        taskService.updateTask(obj);
        return "Updated Successfully";
    }


    // Loading tasks
    @PostMapping("Load")
    public String createtasks(){
       return taskService.loaded();
    }


}


