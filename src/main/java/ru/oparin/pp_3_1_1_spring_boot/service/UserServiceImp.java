package ru.oparin.pp_3_1_1_spring_boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.oparin.pp_3_1_1_spring_boot.dao.UserDao;
import ru.oparin.pp_3_1_1_spring_boot.model.User;

import java.util.List;

@Service
@Transactional
public class UserServiceImp implements UserService {


    private UserDao userDao;
    @Autowired
    public UserServiceImp(UserDao userDao) {

        this.userDao = userDao;
    }

    public void add(User user) {

        userDao.add(user);
    }

    @Transactional(readOnly = true)
    public List<User> index() {

        return userDao.index();
    }
    @Transactional(readOnly = true)
    public User show(Long id) {

        return userDao.show(id);
    }
    public void update(User updatedUser) {

        userDao.update(updatedUser);
    }
    public void delete(Long id) {

        userDao.delete(id);
    }

}
