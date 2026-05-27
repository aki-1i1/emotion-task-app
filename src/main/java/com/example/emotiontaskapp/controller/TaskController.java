package com.example.emotiontaskapp.controller;

import com.example.emotiontaskapp.entity.Task;
import com.example.emotiontaskapp.repository.TaskRepository;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class TaskController {

    private final TaskRepository taskRepository;

    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @GetMapping("/tasks")
    public List<Task> getTasks() {
        return taskRepository.findAll();
    }

    @PostMapping("/tasks")
    public List<Task> addTask(@RequestBody Task task) {
        taskRepository.save(task);
        return taskRepository.findAll();
    }

    @DeleteMapping("/tasks/{id}")
    public List<Task> deleteTask(@PathVariable Long id) {
        taskRepository.deleteById(id);
        return taskRepository.findAll();
    }

    @PutMapping("/tasks/{id}")
    public List<Task> updateTask(@PathVariable Long id, @RequestBody Task updatedTask) {
        Task task = taskRepository.findById(id).orElseThrow();
        task.setName(updatedTask.getName());
        taskRepository.save(task);
        return taskRepository.findAll();
    }
}