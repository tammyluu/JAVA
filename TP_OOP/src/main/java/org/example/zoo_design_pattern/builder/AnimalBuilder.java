package org.example.zoo_design_pattern.builder;

import org.example.zoo_design_pattern.entity.Animal;

public abstract class AnimalBuilder {
    public  abstract  AnimalBuilder name(String name);
    public  abstract  AnimalBuilder category(String category);
    public abstract Animal build();

}
