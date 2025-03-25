package edu.poly.duanjava6.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import edu.poly.duanjava6.bean.Brand;
import edu.poly.duanjava6.dao.BrandRepo;
import edu.poly.duanjava6.service.BrandService;

@Service
public class BrandServiceImpl implements BrandService {
	@Autowired
	BrandRepo bRepo;

	@Override
	public List<Brand> findAll() {
		Sort sort = Sort.by(Direction.ASC, "name");
		return bRepo.findAll(sort);
	}

	@Override
	public Brand findById(String id) {
		return bRepo.findById(id).get();
	}

	@Override
	public boolean existsById(String id) {
		return bRepo.existsById(id);
	}

	@Override
	public Brand save(Brand brand) {
		return bRepo.save(brand);
	}

	@Override
	public void deleteById(String id) {
		bRepo.deleteById(id);
	}

	@Override
	public List<Brand> findByName(String kw) {
		System.out.println(kw);
		return bRepo.findByName(kw);
	}

}
