package example.service;

import example.client.impletation.User;

public interface UserService {

    User getUser(String id);

    User createUser(User user);

    User updateUser(User user);


    void deactivateUser(String id);


    void deactivateUser(String id, boolean shouldDelete);

}
