package dao;

import model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository("fakeDao")
@Transactional
public class UserDAOService {


    private EntityManager entityManager;

    public long insert(User user) {
        entityManager.persist(user);
        return user.getId();
    }

    public User retrieve(long e)
    {
        return entityManager.find(User.class, e);
    }






}

/*
 * Spring Data JPA
 *
 *
 *
 */
