package com.spring.japroject.recipe.controllers;

import com.spring.japroject.recipe.domain.Category;
import com.spring.japroject.recipe.domain.UnitOfMeasure;
import com.spring.japroject.recipe.repositories.CategoryRepository;
import com.spring.japroject.recipe.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * Created by jacheampong
 */
@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String showIndex() {

        Optional<Category> categoryOptional = categoryRepository.findByDescription("");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("");

        System.out.println("Cat ID: " + categoryOptional.get().getId());
        System.out.println("UOM ID: " + unitOfMeasureOptional.get().getId());

        return "index";
    }
}
