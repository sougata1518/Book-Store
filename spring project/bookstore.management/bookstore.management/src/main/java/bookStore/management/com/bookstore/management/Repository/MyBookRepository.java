package bookStore.management.com.bookstore.management.Repository;

import bookStore.management.com.bookstore.management.Model.MyBookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyBookRepository extends JpaRepository<MyBookEntity,Integer> {
}
