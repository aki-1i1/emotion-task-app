package com.example.emotiontaskapp.repository;

import com.example.emotiontaskapp.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}