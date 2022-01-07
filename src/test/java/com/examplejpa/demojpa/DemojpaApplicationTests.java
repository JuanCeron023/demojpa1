package com.examplejpa.demojpa;

import dao.UserDAOService;
import model.User;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(properties = { "spring.jpa.database-platform=org.hibernate.dialect.H2Dialect" })
@AutoConfigureTestDatabase
class DemojpaApplicationTests {

	private  UserDAOService userDaoService;


	@Before
	public void setUp() {
		this.userDaoService = new UserDAOService();
	}

	@Test
	public void userIsCreatedAndRetrieved() {
		User user = new User("1","2") ;
		userDaoService = new UserDAOService();
		userDaoService.insert(user);
		assert  userDaoService.retrieve(1)!=null;
	}

}
