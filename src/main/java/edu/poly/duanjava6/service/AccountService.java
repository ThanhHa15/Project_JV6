package edu.poly.duanjava6.service;

import java.util.List;

import edu.poly.duanjava6.bean.Role;

import edu.poly.duanjava6.bean.Account;
import edu.poly.duanjava6.bean.RoleDetail;

public interface AccountService {
    List<Account> findAll();

    Account findByUsername(String username);    

    Account save(Account account);

    void deleteByUsername(String username); 

    boolean existsById(String username);

    List<Account> findByFullname(String fullname);

    List<Role> findAllRole();

    List<RoleDetail> findAllAuthorities();

    RoleDetail saveRoleDetail(RoleDetail authority);

    void deleteRoleDetail(Long id);

    List<Account> findByUsernameLike(String username);

    Long countCustomer(String role);

}
