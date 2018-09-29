package com.spring.japroject.recipe.repositories;

import com.spring.japroject.recipe.domain.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jacheampong
 */
@Repository
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
