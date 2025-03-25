package edu.poly.duanjava6.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.poly.duanjava6.bean.Role;

public interface RoleRepo extends JpaRepository<Role, String> {

}
