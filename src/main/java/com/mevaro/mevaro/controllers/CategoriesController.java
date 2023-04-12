package com.mevaro.mevaro.controllers;
import com.mevaro.mevaro.services.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.time.LocalDate;
import java.util.Map;

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

    @PostMapping(value = "/new", consumes = MediaType.ALL_VALUE)
    public ResponseEntity<?> addCategory(@RequestParam String title, @RequestParam String url, @RequestParam MultipartFile photo) throws Exception {
        service.addCategory(title, url, photo.getBytes());
        System.out.println(LocalDate.now());
        return ResponseEntity.ok().body(Map.of("message", "Category created successfully"));
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteCategoryById (@PathVariable long id) {
        service.deleteCategoryById(id);
        return  ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @DeleteMapping("/deleteall")
    public ResponseEntity<?> deleteCategoriesAll() {
        service.deleteCatagoriesAll();
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
