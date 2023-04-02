package com.mevaro.mevaro.services;

import com.mevaro.mevaro.models.Category;
import com.mevaro.mevaro.repositories.CategoryRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.util.List;


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
    public Category addCategory(String title, String url, byte [] photo) {
        Category category = new Category();
        category.setTitle(title);
        category.setUrl(url);
        category.setPhoto(photo);
        category.setCreatedAt(Instant.now());
        return repository.save(category);
    }

    @Transactional
    public void deleteCategoryById(long id) {
       repository.deleteById(id);
    }
    @Transactional
    public void deleteCatagoriesAll() {
        repository.deleteAll();
    }
}