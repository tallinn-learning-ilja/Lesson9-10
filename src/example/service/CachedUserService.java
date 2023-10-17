package example.service;

import example.client.impletation.User;

import java.util.HashMap;
import java.util.Map;

public class CachedUserService implements UserService {

    private UserService userService;

    private Map<String, User> userCache = new HashMap<>();

    public CachedUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public User getUser(String id) {
        if (userCache.containsKey(id)) {
            return userCache.get(id);
        }
        User user = userService.getUser(id);
        userCache.put(id, user);
        return user;
    }

    @Override
    public User createUser(User user) {
        User createdUser = userService.createUser(user);
        userCache.put(createdUser.getId(), createdUser);
        return createdUser;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public void deactivateUser(String id) {
        deactivateUser(id, false);
    }

    @Override
    public void deactivateUser(String id, boolean shouldDelete) {
        userService.deactivateUser(id, shouldDelete);
    }
}
