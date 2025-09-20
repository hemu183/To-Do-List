package com.example.To_Do_ListApp1.controller;

import com.example.To_Do_ListApp1.entity.Task;
import com.example.To_Do_ListApp1.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class TaskController {
    @Autowired
    TaskService taskService;

    @RequestMapping("/")

    public Task CreateTask(@RequestBody Task task){
    return taskService.addTask(task);
}

}
