package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {
    public List<User> getAllUsers();

    void save(User user);

    void update(User user);

    void delete(User user);

    User getUserById(long id);
}
