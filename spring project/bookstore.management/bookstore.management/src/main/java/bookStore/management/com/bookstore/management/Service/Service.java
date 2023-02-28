package bookStore.management.com.bookstore.management.Service;

import bookStore.management.com.bookstore.management.Model.Entity;
import bookStore.management.com.bookstore.management.Repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Service implements ServiceInterface{

    @Autowired
    private Repository repository;

    public void saveData(Entity entity){
        repository.save(entity);
    }

    public List<Entity> getAllData(){
        List<Entity> findAllData = repository.findAll();
        return findAllData;
    }

    @Override
    public Entity getBookById(int id) {
        Entity entity = repository.findById(id).get();
        return entity;
    }

    @Override
    public void deleteData(int id) {
        repository.deleteById(id);
    }
}
