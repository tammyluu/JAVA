package org.example.zoo_design_pattern.factory;

import org.example.zoo_design_pattern.builder.AnimalBuilder;
import org.example.zoo_design_pattern.entity.Animal;

public abstract class AnimalFactory {
    abstract Animal createAnimal(AnimalBuilder buider);
}
