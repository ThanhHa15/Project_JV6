package edu.poly.duanjava6.service;

import java.util.List;
import java.util.Locale.Category;

public interface CategoryService {

    List<Category> findAll();

    boolean existsById(String id);

    Category findById(String id);

    List<Category> findByName(String kw);

    Category save(Category cate);

    void deleteById(String id);
}
