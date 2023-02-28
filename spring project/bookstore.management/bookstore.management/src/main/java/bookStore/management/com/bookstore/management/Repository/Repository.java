package bookStore.management.com.bookstore.management.Repository;

import bookStore.management.com.bookstore.management.Model.Entity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Entity,Integer> {

}
