package example.client.impletation;

import example.client.AbstractClient;
import example.client.ClientInterface;

import java.util.ArrayList;
import java.util.List;

public class AccountClient extends AbstractClient implements ClientInterface<Account> {
    @Override
    public List<Account> getAll() {
        return new ArrayList<>();
    }

    @Override
    public Account getById(String id) {
        return new Account();
    }

    @Override
    public Account create(Account entity) {
        return entity;
    }

    @Override
    public Account update(Account updatedEntity) {
        return updatedEntity;
    }

    @Override
    public void delete(String id) {
        System.out.println("Account was deleted");
    }
}
