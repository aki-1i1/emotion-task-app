package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

public class TaskController {
    @GetMapping("/tasks")
    public List<String> getTasks() {
        return List.of("タスク1", "タスク2");
    }
}
