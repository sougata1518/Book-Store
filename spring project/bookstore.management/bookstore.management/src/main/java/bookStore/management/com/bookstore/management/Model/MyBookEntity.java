package bookStore.management.com.bookstore.management.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyBookEntity {

    @Id
    private int id;
    private String name;
    private String author;
    private String price;
}
