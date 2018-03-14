package controllers;

import javax.annotation.Resource;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import models.User;
import services.UserService;

@EnableAutoConfiguration
@RestController
public class UserController {
	@Resource(name = "UserService")
	private UserService userService;
	
	@RequestMapping(value = "/user", method = RequestMethod.GET, params = "id")
	public User getUser(@RequestParam(value = "id") long id) {
		return userService.get(id);
	}

	@RequestMapping(value = "/user", method = RequestMethod.POST, params = { "login", "password", "name", "username",
			"age" })
	public void addUser(@RequestParam(value = "login") String lgn, @RequestParam(value = "password") String pwd,
			@RequestParam(value = "username") String usrnm, @RequestParam(value = "age") int age) {
		userService.add(new User(lgn,pwd,usrnm,age));
	}

	@RequestMapping(value = "/user", method = RequestMethod.DELETE, params = "id")
	public void deleteUser(@RequestParam(value = "id") long id) {
		userService.delete(id);
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.PUT, params = "id")
	public void editUser(@RequestParam(value = "id") long id) {
		userService.edit(userService.get(id));
	}
}