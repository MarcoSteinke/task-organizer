package com.steinkeit.taskorganizer.infrastructure.persistence.mapper;

import com.steinkeit.taskorganizer.domain.model.Task;
import com.steinkeit.taskorganizer.infrastructure.persistence.dto.TaskDTO;

public class TaskMapper {

    public static TaskDTO mapTaskToTaskDTO(Task task) {
        return new TaskDTO(task.id(), task.name(), task.description(), task.category());
    }

    public static Task mapTaskDTOToTask(TaskDTO taskDTO) {
        return new Task(taskDTO.id(), taskDTO.name(), taskDTO.description(), taskDTO.category());
    }
}
