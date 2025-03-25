package edu.poly.duanjava6.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.poly.duanjava6.bean.RoleDetail;

@Repository
public interface RoleDetailRepo extends JpaRepository<RoleDetail, Long> {
    // tự động viết mấy câu lệnh sql tự động ko cần thủ công
}
