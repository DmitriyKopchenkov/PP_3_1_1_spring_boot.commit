package ru.oparin.pp_3_1_1_spring_boot.dao;

import org.springframework.stereotype.Repository;
import ru.oparin.pp_3_1_1_spring_boot.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
public class UserDaoImp implements UserDao {


    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public void add(User user) {

        entityManager.persist(user);
    }

    @Override
    public List<User> index() {

        return entityManager.createQuery("SELECT u FROM User u", User.class).getResultList();
    }

    @Override
    public User show(Long id) {

        return entityManager.find(User.class, id);
    }


    @Override
    public void update(User updatedUser) {

        entityManager.merge(updatedUser);
    }

    @Override
    public void delete(Long id) {

        entityManager.remove(show(id));
    }
}
