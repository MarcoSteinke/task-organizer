package com.steinkeit.taskorganizer.domain.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

public record Task(@Min(-1L) Long id, @NotNull @Length(min = 6, max = 100) String name,
                   @NotNull @Length(max = 500) String description, @NotNull Category category) {
}
