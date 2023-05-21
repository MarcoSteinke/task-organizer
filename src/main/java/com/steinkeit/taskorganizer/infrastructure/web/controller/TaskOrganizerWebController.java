package com.steinkeit.taskorganizer.infrastructure.web.controller;

import com.steinkeit.taskorganizer.domain.applicationservice.TaskOrganizerApplicationService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TaskOrganizerWebController {

    private final TaskOrganizerApplicationService taskOrganizerApplicationService;

    public TaskOrganizerWebController(TaskOrganizerApplicationService taskOrganizerApplicationService) {
        this.taskOrganizerApplicationService = taskOrganizerApplicationService;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
