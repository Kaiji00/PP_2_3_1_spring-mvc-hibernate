package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    public List<User> getAllUsers();

    void save(User user);

    void update(User user);

    void delete(User user);

    User getUserById(long id);
}