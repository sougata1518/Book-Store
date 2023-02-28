package bookStore.management.com.bookstore.management.Service;

import bookStore.management.com.bookstore.management.Model.MyBookEntity;
import bookStore.management.com.bookstore.management.Repository.MyBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyBookService implements MyBookServiceInterface{

    @Autowired
    private MyBookRepository myBookRepository;

    @Override
    public void saveMyBookEntityData(MyBookEntity myBookEntity) {
        myBookRepository.save(myBookEntity);
    }

    @Override
    public List<MyBookEntity> getAllDataOfMyBook() {
        List<MyBookEntity> myBookEntities = myBookRepository.findAll();
        return myBookEntities;
    }

    @Override
    public void deleteById(int id) {
        myBookRepository.deleteById(id);
    }
}
