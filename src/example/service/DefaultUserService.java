package example.service;

import example.client.impletation.User;

public class DefaultUserService implements UserService{
    @Override
    public User getUser(String id) {
        return new User();
    }

    @Override
    public User createUser(User user) {
        // complex validation logic etc
        return new User();
    }

    @Override
    public User updateUser(User user) {
        return new User();
    }

    public void deactivateUser(String id) {
        deactivateUser(id, false);
    }
    public void deactivateUser(String id,
                               boolean shouldDelete) {
        System.out.println("User was deactivated");
        if (shouldDelete) {
            System.out.println("User was also deleted");
        }
    }
}
