package bookStore.management.com.bookstore.management.Service;

import bookStore.management.com.bookstore.management.Model.MyBookEntity;

import java.util.List;

public interface MyBookServiceInterface {

    public void saveMyBookEntityData(MyBookEntity myBookEntity);

    public List<MyBookEntity> getAllDataOfMyBook();

    public void deleteById(int id);

}
