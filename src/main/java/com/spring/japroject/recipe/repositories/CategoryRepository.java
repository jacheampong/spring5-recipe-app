package com.spring.japroject.recipe.repositories;

import com.spring.japroject.recipe.domain.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jacheampong
 */
@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
