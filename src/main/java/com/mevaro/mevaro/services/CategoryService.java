package com.mevaro.mevaro.services;

import com.mevaro.mevaro.models.Category;
import com.mevaro.mevaro.repositories.CategoryRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class CategoryService {
    private final CategoryRepository repository;

    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }

    public List<Category> getListCategory() {
        return repository.findAll();
    }

    @Transactional
    public Category addCategory(Category category) {
        Optional<Category>  newCategory = Optional.of(repository.save(category));
        return newCategory.orElse(null);
    }

}
