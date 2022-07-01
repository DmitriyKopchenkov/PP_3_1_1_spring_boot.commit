package ru.oparin.pp_3_1_1_spring_boot.service;

import ru.oparin.pp_3_1_1_spring_boot.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    List<User> index();
    User show(Long id);
    void update(User updatedUser);
    void delete(Long id);
}
