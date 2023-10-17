package example.client.impletation;

import example.client.AbstractClient;
import example.client.ClientInterface;
import example.client.InternalClientInterface;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

public class UserClient extends AbstractClient implements ClientInterface<User>, InternalClientInterface<User> {
    @Override
    public List<User> getAll() {
        URI uri = URI.create(url);

        return new ArrayList<>();
    }

    @Override
    public User getById(String id) {
        URI uri = URI.create(url + "id");
        return new User();
    }

    @Override
    public User create(User entity) {
        URI uri = URI.create(url);
        return entity;
    }

    @Override
    public User update(User updatedEntity) {
        URI uri = URI.create(url);
        return updatedEntity;
    }

    @Override
    public void delete(String id) {
        URI uri = URI.create(url);
        System.out.println("User was deleted");
    }

    @Override
    public User createTestEntity(User entity) {
        return null;
    }
}
