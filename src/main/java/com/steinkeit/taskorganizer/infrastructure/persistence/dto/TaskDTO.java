package com.steinkeit.taskorganizer.infrastructure.persistence.dto;

import com.steinkeit.taskorganizer.domain.model.Category;
import org.springframework.data.annotation.Id;

public record TaskDTO(@Id Long id, String name, String description, Category category) {
}
