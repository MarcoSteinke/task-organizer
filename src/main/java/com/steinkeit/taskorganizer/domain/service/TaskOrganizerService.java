package com.steinkeit.taskorganizer.domain.service;

import com.steinkeit.taskorganizer.domain.repositoryabstraction.TaskOrganizerRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskOrganizerService {

    private final TaskOrganizerRepository taskOrganizerRepository;

    public TaskOrganizerService(TaskOrganizerRepository taskOrganizerRepository) {
        this.taskOrganizerRepository = taskOrganizerRepository;
    }
}
