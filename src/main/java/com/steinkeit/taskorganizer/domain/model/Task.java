package com.steinkeit.taskorganizer.domain.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

public class Task {

    @Min(-1L)
    private final Long id;

    @NotNull
    @Length(min=6, max=100)
    private final String name;

    @NotNull
    @Length(max=500)
    private final String description;

    public Task(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
