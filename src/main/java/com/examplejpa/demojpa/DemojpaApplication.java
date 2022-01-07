package com.examplejpa.demojpa;

import dao.UserDAOService;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemojpaApplication {

	private  UserDAOService userDaoService;


	public DemojpaApplication() {
		this.userDaoService = null;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemojpaApplication.class, args);
		DemojpaApplication g = new DemojpaApplication();
		g.algo();
	}

	public void algo()
	{
		this.userDaoService = new UserDAOService();
		User user = new User("Jack", "Admin");
		//New User is created : User [id=1, name=Jack, role=Admin]
		long insert = userDaoService.insert(user);

		System.out.println("ggggggggggggggggggggjhhh");


}




}
