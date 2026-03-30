package com.obando.todo_app.service;

import com.obando.todo_app.model.Task;

import java.util.List;

public interface TaskService {

    List<Task> getAllTasks();

    void createOneTask(String title);

    void deleteOneTask(Long id);

    void toggleTask(Long id);
}
