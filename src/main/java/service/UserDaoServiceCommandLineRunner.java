package service;

import dao.UserDAOService;
import model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner {

    private static final Logger log =LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);
    private final  UserDAOService userDaoService;

    @Autowired
    public UserDaoServiceCommandLineRunner(@Qualifier("fakeDao") UserDAOService personDao) {
        this.userDaoService = personDao;
    }

    @Override
    public void run(String... arg0) throws Exception {
        User user = new User("Jack", "Admin");
        //New User is created : User [id=1, name=Jack, role=Admin]
        long insert = userDaoService.insert(user);
        log.info("New User is created : " + user);
        System.out.println("ggggggggggggggggggggjhhh");
    }
}