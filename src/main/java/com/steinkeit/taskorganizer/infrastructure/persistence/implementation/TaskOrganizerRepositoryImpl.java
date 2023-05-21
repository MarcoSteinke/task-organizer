package com.steinkeit.taskorganizer.infrastructure.persistence.implementation;

import com.steinkeit.taskorganizer.domain.model.Task;
import com.steinkeit.taskorganizer.domain.repositoryabstraction.TaskOrganizerRepository;
import com.steinkeit.taskorganizer.infrastructure.persistence.dto.TaskDTO;
import com.steinkeit.taskorganizer.infrastructure.persistence.mapper.TaskMapper;
import com.steinkeit.taskorganizer.infrastructure.persistence.repository.TaskOrganizerCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public class TaskOrganizerRepositoryImpl implements TaskOrganizerRepository {

    private final TaskOrganizerCrudRepository taskOrganizerCrudRepository;

    public TaskOrganizerRepositoryImpl(TaskOrganizerCrudRepository taskOrganizerCrudRepository) {
        this.taskOrganizerCrudRepository = taskOrganizerCrudRepository;
    }

    public void save(Task task) {
        this.taskOrganizerCrudRepository.save(new TaskDTO(task.id(), task.name(), task.description()));
    }

    public Task findById(Long id) {
        return TaskMapper.mapTaskDTOToTask(this.taskOrganizerCrudRepository.findById(id).orElse(new TaskDTO(-1L, "ERROR", "")));
    }
}
