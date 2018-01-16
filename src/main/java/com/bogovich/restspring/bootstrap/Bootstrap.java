package com.bogovich.restspring.bootstrap;

import com.bogovich.restspring.domain.Category;
import com.bogovich.restspring.repository.CategoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner {

    private final CategoryRepository categoryRepository;

    public Bootstrap(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        categoryRepository.save(Category.of("Fruits"));
        categoryRepository.save(Category.of("Dried"));
        categoryRepository.save(Category.of("Fresh"));
        categoryRepository.save(Category.of("Exotic"));
        categoryRepository.save(Category.of("Nuts"));

        System.out.println("Data Loaded = " + categoryRepository.count() );
    }
}
