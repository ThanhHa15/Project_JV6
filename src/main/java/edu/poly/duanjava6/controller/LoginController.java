// package edu.poly.duanjava6.controller;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.ModelAttribute;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;

// import edu.poly.duanjava6.bean.Account;
// import edu.poly.duanjava6.bean.Role;
// import edu.poly.duanjava6.bean.RoleDetail;
// import edu.poly.duanjava6.service.AccountService;
// import edu.poly.duanjava6.service.SessionService;

// @Controller
// public class LoginController {

// @Autowired
// AccountService aService;

// @Autowired
// SessionService session;

// @GetMapping("/register")
// public String login(@ModelAttribute Account account) {
// return "register";
// }

// @PostMapping("/register")
// public String signup(Model model,
// @ModelAttribute Account account) {
// if (aService.existsById(account.getUsername())) {
// model.addAttribute("error", "Đã tồn tại username " + account.getUsername());
// return "register";
// } else {
// account.setActivated(true);

// account.setPhoto("logo.jpg");

// Role r = new Role();
// r.setRole("user");
// RoleDetail rd = new RoleDetail();
// rd.setAccount(account);
// rd.setRole(r);

// aService.save(account);
// aService.saveRoleDetail(rd);
// return "redirect:/register/success";
// }

// }

// @RequestMapping("/register/success")
// public String registerSuccess(Model model) {
// model.addAttribute("message", "Đăng ký thành công");
// return "/login";
// }

// @GetMapping("/login")
// public String login(Model model, @RequestParam(value = "username", required =
// true) String message) {
// model.addAttribute("message", message);
// return "login";
// }

// @PostMapping("/login")
// public String login(Model model, @RequestParam(value = "username", required =
// true) String username,
// @RequestParam(value = "password", required = true) String password) {
// try {
// Account account = aService.findByUsername(username);
// if (!account.getPassword().equals(password)) {
// model.addAttribute("message", "Sai mật khẩu");

// } else {
// String uri = session.get("security-uri");
// // if (uri != null) {
// // return "redirect:" + uri;
// // }
// session.set("user", account);
// if (this.checkAdmin(account)) {
// session.set("userAdmin", "admin");
// return "redirect:/admin";
// }
// model.addAttribute("message", "Đăng nhập thành công");
// return "redirect:/";
// }

// } catch (Exception e) {
// model.addAttribute("message", "Sai tên đăng nhập");
// }
// return "login";
// }

// public Boolean checkAdmin(Account account) {
// for (RoleDetail roleDetail : account.getRoleDetails()) {
// if (roleDetail.getRole().getRole().equals("staff") ||
// roleDetail.getRole().getRole().equals("director")) {
// return true;
// }
// }
// return false;
// }

// @RequestMapping("/logout")
// public String logoutSucces(Model model) {
// session.remove("user");
// session.remove("userAdmin");
// session.remove("security-uri");
// session.remove("uri");
// model.addAttribute("message", "Đăng xuất thành công");
// return "login";
// }

// }
