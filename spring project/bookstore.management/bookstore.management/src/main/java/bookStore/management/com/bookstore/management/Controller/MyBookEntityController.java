package bookStore.management.com.bookstore.management.Controller;

import bookStore.management.com.bookstore.management.Service.MyBookServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyBookEntityController {

    @Autowired
    private MyBookServiceInterface myBookServiceInterface;

    @RequestMapping("/deleteMyList/{id}")
    public String deleteMyList(@PathVariable int id){
        myBookServiceInterface.deleteById(id);
        return "redirect:/my_books";
    }
}
