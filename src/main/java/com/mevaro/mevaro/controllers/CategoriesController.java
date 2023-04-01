package com.mevaro.mevaro.controllers;
import com.mevaro.mevaro.models.Category;
import com.mevaro.mevaro.services.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@RestController
@RequestMapping(value = "/categories", produces = "application/json")
public class CategoriesController {
    private final CategoryService service;

    public CategoriesController(CategoryService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<?> getListCategories() {
        return new ResponseEntity<>(service.getListCategory(), HttpStatus.FOUND);
    }

    @PostMapping(value = "/new", consumes = "application/json")
    public ResponseEntity<?> addCategories(@RequestBody Category category) {
        return new ResponseEntity<>(service.addCategory(category), HttpStatus.CREATED);
    }

}
