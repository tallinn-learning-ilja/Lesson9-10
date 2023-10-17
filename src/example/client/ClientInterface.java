package example.client;

import java.util.List;

public interface ClientInterface<T> {

    List<T> getAll();

    T getById (String id);

    T create(T entity);

    T update(T updatedEntity);

    void delete (String id);
}
