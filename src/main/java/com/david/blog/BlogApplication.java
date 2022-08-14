package com.david.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogApplication.class, args);
	}
//	@Bean
//	CommandLineRunner run(UserService userService){
//		return  args -> {
//			userService.saveRole(new RoleEntity(null, Roles.ADMIN.toString()));
//			userService.saveRole(new RoleEntity(null,Roles.USER.toString()));
//
//			userService.saveUser(new UserEntity(null,"Yael","Menahem","yaelg1986@gmail.com","1234",new ArrayList<>()));
//			userService.saveUser(new UserEntity(null,"David","Menahem","dvmena39@gmail.com","1234",new ArrayList<>()));
//			userService.saveUser(new UserEntity(null,"test user","test user","dvmena40@gmail.com","1234",new ArrayList<>()));
//			userService.addRoleToUser("yaelg1986@gmail.com",Roles.ADMIN.toString());
//			userService.addRoleToUser("dvmena39@gmail.com",Roles.ADMIN.toString());
//			userService.addRoleToUser("dvmena40@gmail.com",Roles.USER.toString());
//		};
//	}

}
