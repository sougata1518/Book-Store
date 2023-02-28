package bookStore.management.com.bookstore.management.Service;

import bookStore.management.com.bookstore.management.Model.Entity;

import java.util.List;

public interface ServiceInterface {

    public void saveData(Entity entity);
    public List<Entity> getAllData();

    public Entity getBookById(int id);

    public void deleteData(int id);
}
