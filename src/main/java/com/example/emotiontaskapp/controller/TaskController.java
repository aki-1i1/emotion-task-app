package com.example.emotiontaskapp.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class TaskController {

    private List<String> tasks = new ArrayList<>();

    @GetMapping("/tasks")
    public List<String> getTasks() {
        return tasks;
    }

    @PostMapping("/tasks")
    public List<String> addTask(@RequestBody String task) {
        tasks.add(task);
        return tasks;
    }
}
