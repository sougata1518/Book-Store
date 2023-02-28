package bookStore.management.com.bookstore.management.Controller;

import bookStore.management.com.bookstore.management.Model.Entity;
import bookStore.management.com.bookstore.management.Model.MyBookEntity;
import bookStore.management.com.bookstore.management.Service.MyBookServiceInterface;
import bookStore.management.com.bookstore.management.Service.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    private ServiceInterface serviceInterface;

    @Autowired
    private MyBookServiceInterface myBookServiceInterface;

    @RequestMapping("/create")
    public String showPage(){
        return "home";
    }

    @RequestMapping("/book_register")
    public String bookRegister(){
        return "BookRegister";
    }

    @RequestMapping("/home")
    public String homePage(){
        return "home";
    }

    @PostMapping("/save")
    public String saveData(@ModelAttribute Entity entity){
        serviceInterface.saveData(entity);
        return "redirect:/available_books";
    }

//    @GetMapping("/available_books")
//    public ModelAndView getData(){
//        List<Entity> entity = serviceInterface.getAllData();
////        ModelAndView modelAndView = new ModelAndView();
////        modelAndView.setViewName("booklist");
////        modelAndView.addObject("book",entity);
//        return new ModelAndView("booklist","book",entity);
//    }

    @GetMapping("/available_books")
    public String viewHomePage(Model model){
        model.addAttribute("list",serviceInterface.getAllData());
        return "AvailableBook";
    }

    @RequestMapping("/my_books")
    public String getMyBooks(Model model){
        List<MyBookEntity> myBookEntities = myBookServiceInterface.getAllDataOfMyBook();
        model.addAttribute("myBookList",myBookEntities);
        return "MyBooks";
    }

    @RequestMapping("/mylists/{id}")
    public String getMyList(@PathVariable int id){
        Entity entity = serviceInterface.getBookById(id);
        MyBookEntity myBookEntity = new MyBookEntity(entity.getId(), entity.getName(), entity.getAuthor(), entity.getPrice());
        myBookServiceInterface.saveMyBookEntityData(myBookEntity);
        return "redirect:/my_books";
    }

    @RequestMapping("/delmainentity/{id}")
    public String deleteById(@PathVariable int id){
        serviceInterface.deleteData(id);
        return "redirect:/available_books";
    }

    @RequestMapping("/editBook/{id}")
    public String editBook(@PathVariable int id,Model model){
        Entity entity = serviceInterface.getBookById(id);
        model.addAttribute("onebook",entity);
        return "BookEdit";
    }
}
