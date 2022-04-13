package ru.oparin.pp_3_1_1_spring_boot.service;

import ru.oparin.pp_3_1_1_spring_boot.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    void deleteUser(Long id);
    void editUser(User user);
    User getUserById(Long id);
    List<User> getAllUsers();
}
