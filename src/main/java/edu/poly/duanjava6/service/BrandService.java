package edu.poly.duanjava6.service;

import java.util.List;

import edu.poly.duanjava6.bean.Brand;

public interface BrandService {
    List<Brand> findAll();

    Brand findById(String id);

    boolean existsById(String id);

    Brand save(Brand brand);

    void deleteById(String id);

    List<Brand> findByName(String kw);

}
