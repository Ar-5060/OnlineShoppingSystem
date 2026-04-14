package services;

import models.User;

import java.util.HashMap;
import java.util.Map;

public class UserService {
    private Map<String, User> users;

    public UserService() {
        users = new HashMap<>();
        // Prepopulate with some users
        users.put("admin", new User("admin", "admin123", "admin@example.com"));
    }

    // Authenticate user
    public boolean authenticateUser(String username, String password) {
        User user = users.get(username);
        return user != null && user.getPassword().equals(password);
    }
}