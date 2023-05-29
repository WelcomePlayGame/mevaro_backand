package com.mevaro.mevaro.controllers;
import com.mevaro.mevaro.services.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.time.Instant;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/categories")
public class CategoriesController {
    private final CategoryService service;

    public CategoriesController(CategoryService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<?> getListCategories() {
        return new ResponseEntity<>(service.getListCategory(), HttpStatus.FOUND);
    }

    @PostMapping("/new")
    public ResponseEntity<?> addCategory(@RequestParam (required = true) String title, @RequestParam (required = true) String url, @RequestParam MultipartFile photo) throws Exception {
        service.addCategory(title, url, photo.getBytes());
        return ResponseEntity.ok("Create Category");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteCategoryById (@PathVariable long id) {
        service.deleteCategoryById(id);
        return ResponseEntity.ok("Category Delete");
    }

    @DeleteMapping("/deleteall")
    public ResponseEntity<?> deleteCategoriesAll() {
        service.deleteCatagoriesAll();
        return ResponseEntity.ok("Delete All Categories");
    }

}
