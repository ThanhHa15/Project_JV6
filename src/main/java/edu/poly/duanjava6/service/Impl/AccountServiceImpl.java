package edu.poly.duanjava6.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.poly.duanjava6.bean.Account;
import edu.poly.duanjava6.bean.RoleDetail;
import edu.poly.duanjava6.dao.AccountRepo;
import edu.poly.duanjava6.dao.RoleDetailRepo;
import edu.poly.duanjava6.dao.RoleRepo;
import edu.poly.duanjava6.service.AccountService;
import edu.poly.duanjava6.bean.Role;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountRepo aRepo;
    @Autowired
    RoleRepo rRepo;
    @Autowired
    RoleDetailRepo rdRepo;

    @Override
    public List<Account> findAll() {
        return aRepo.findAll();
    }

    @Override
    public Account findByUsername(String username) {
        return aRepo.findById(username).get();
    }

    @Override
    public Account save(Account account) {
        return aRepo.save(account);
    }

    @Override
    public void deleteByUsername(String username) {
        aRepo.deleteById(username);
    }

    @Override
    public boolean existsById(String username) {
        return aRepo.existsById(username);
    }

    @Override
    public List<Account> findByFullname(String fullname) {
        return aRepo.findByFullname(fullname);
    }

    @Override
    public List<Role> findAllRole() {
        return rRepo.findAll();
    }

    @Override
    public List<RoleDetail> findAllAuthorities() {
        return rdRepo.findAll();
    }

    @Override
    public RoleDetail saveRoleDetail(RoleDetail authority) {
        return rdRepo.save(authority);
    }

    @Override
    public void deleteRoleDetail(Long id) {
        rdRepo.deleteById(id);
    }

    @Override
    public List<Account> findByUsernameLike(String username) {
        return aRepo.findByUsernameLike(username);
    }

    @Override
    public Long countCustomer(String role) {
        return aRepo.countCustomer(role);
    }

}
