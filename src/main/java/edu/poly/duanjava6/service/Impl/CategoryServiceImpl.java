package edu.poly.duanjava6.service.Impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.poly.duanjava6.bean.Category;
import edu.poly.duanjava6.dao.CategoryRepo;
import edu.poly.duanjava6.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{
	@Autowired
	CategoryRepo cRepo;

	@Override
	public List<Category> findAll() {
		return cRepo.findAll();
	}

	@Override
	public boolean existsById(String id) {
		return cRepo.existsById(id);
	}

	@Override
	public Category findById(String id) {
		return cRepo.findById(id).get();
	}

	@Override
	public List<Category> findByName(String kw) {
		return cRepo.findByName(kw);
	}

	@Override
	public Category save(Category cate) {
		return cRepo.save(cate);
	}

	@Override
	public void deleteById(String id) {
		cRepo.deleteById(id);
	}

}

