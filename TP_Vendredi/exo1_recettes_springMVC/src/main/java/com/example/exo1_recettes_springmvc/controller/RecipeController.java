package com.example.exo1_recettes_springmvc.controller;

import com.example.exo1_recettes_springmvc.entity.Recipe;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller

public class RecipeController {
    @Value("Our Food Stories")
    private String blogName;
    @Value("foodStories@foodblog.com")
    private String blogContact;
    private final List<Recipe> recipes = new ArrayList<>();

    @GetMapping("/")  // http://localhost:8080
    public String home(Model model){
        model.addAttribute("name",blogName);
        model.addAttribute("contact",blogContact);
        return "home";
    }

    @GetMapping("/form")
    public String form(Model model){
        model.addAttribute("recipe", new Recipe());
        return "form";
    }

    @PostMapping("/add")
       public String  addRecipe(@Valid @ModelAttribute("recipe")Recipe recipe, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "form";
        }
        recipes.add(recipe);
        return "redirect:/recipes";
    }
    @GetMapping("/recipes")
    public String showRecipes(Model model) {
        model.addAttribute("recipes", recipes);
        return "list";
    }

    private Recipe findRecipeById(UUID id) {
        for (Recipe recipe : recipes) {
            System.out.println("Recipe ID: " + recipe.getId());
            if (recipe.getId().equals(id)) {
                System.out.println("Found recipe with ID: " + id);
                return recipe;
            }
        }
        System.out.println("Recipe with ID " + id + " not found.");
        return null;
    }
    private boolean isValidUUID(String uuidString) {
        if (uuidString == null) {
            return false;
        }
        try {
            UUID.fromString(uuidString);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }
    @GetMapping("/recipes/{id}")
    public String showRecipeDetails(@PathVariable("id") String id, Model model) {
        if (!isValidUUID(id)) {

            return "redirect:/recipes";
        }
        UUID uuid = UUID.fromString(id);
        Recipe recipe = findRecipeById(uuid);
        if (recipe != null) {
            model.addAttribute("recipe", recipe);
            return "detail";
        } else {
            return "redirect:/recipes";
        }
    }




}
