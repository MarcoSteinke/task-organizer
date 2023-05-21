package com.steinkeit.taskorganizer.domain.applicationservice;

import com.steinkeit.taskorganizer.domain.service.TaskOrganizerService;
import org.springframework.stereotype.Service;

@Service
public class TaskOrganizerApplicationService {

    private final TaskOrganizerService taskOrganizerService;

    public TaskOrganizerApplicationService(TaskOrganizerService taskOrganizerService) {
        this.taskOrganizerService = taskOrganizerService;
    }
}
