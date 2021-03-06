package com.pl.giflib.data;

import com.pl.giflib.model.Category;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;


@Component
public class CategoryRepository {
    private static final List<Category> ALL_CATEGORIES = Arrays.asList(
        new Category(1, "Tech"),
        new Category(2, "People"),
        new Category(3, "Distribution")
    );

    public List<Category> getAllCategories() {
        return ALL_CATEGORIES;
    }

    public Category findById(int id) {
        for (Category category : ALL_CATEGORIES) {
            if (category.getId() == id) {
                return category;
            }
        }
        return null;
    }
}
