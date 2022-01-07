package service;

import dao.UserDAOService;
import dao.UserRepository;
import model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

    private static final Logger log =
            LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);

    private final UserRepository userRepository;

    @Autowired
    public UserRepositoryCommandLineRunner( UserRepository personDao) {
        this.userRepository = personDao;
    }

    @Override
    public void run(String... arg0) throws Exception {
        User user = new User("Jill", "Admin");
        userRepository.save(user);
        log.info("New User is created : " + user);

        Optional<User> userWithIdOne = userRepository.findById(1L);
        log.info("User is retrieved : " + userWithIdOne);

        List<User> users = userRepository.findAll();
        log.info("All Users : " + users);
    }
}