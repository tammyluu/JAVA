package com.example.exo1_recettes_springmvc.entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Recipe {
    private UUID id;
    @NotBlank(message = "Recipe name cannot be blank")
    @Size(min=3, max =30, message = "Name contain between 3 and 30 characters please")
    private String name;

    @NotEmpty(message = "Ingredient list cannot be empty")
    private List<String> ingredients;

    @NotBlank(message = "Instructions cannot be blank")
    private String instructions;
}
