package com.steinkeit.taskorganizer.infrastructure.persistence.repository;

import com.steinkeit.taskorganizer.infrastructure.persistence.dto.TaskDTO;
import org.springframework.data.repository.CrudRepository;

public interface TaskOrganizerCrudRepository extends CrudRepository<TaskDTO, Long> {
}
