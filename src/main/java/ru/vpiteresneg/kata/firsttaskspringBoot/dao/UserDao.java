package ru.vpiteresneg.kata.firsttaskspringBoot.dao;



import ru.vpiteresneg.kata.firsttaskspringBoot.model.User;

import java.util.List;

public interface UserDao {
    //В приложении должна быть страница, на которую выводятся все юзеры с возможностью добавлять, удалять и изменять юзера

    User findById(Long id);

    List<User> getAll();

    void saveUser(User user);

    void deleteUser(Long id);
}
