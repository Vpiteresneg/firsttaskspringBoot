package ru.vpiteresneg.kata.firsttaskspringBoot.service;



import ru.vpiteresneg.kata.firsttaskspringBoot.model.User;

import java.util.List;

public interface UserService {
    User findById(Long id);

    List<User> getAll();

    void saveUser(User user);

    void deleteUser(Long id);
}


