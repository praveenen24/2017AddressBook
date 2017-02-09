package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by praveenensrikumaran on 2/2/2017.
 */
@Controller
public class AddressBookController {
    private AddressBookRepository repository;

    @Autowired
    public void initRepo(AddressBookRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String newGreeting() {
        return "greeting";
    }

    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @RequestMapping(value = "/book", method = RequestMethod.PUT)
    public String createAddressBook(Model model) {
        AddressBook book = new AddressBook();
        book.setId(1);
        model.addAttribute("book", book);
        repository.save(book);
        return "book";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addBuddy(@RequestParam(value="name", required=true, defaultValue="name") String name,
                           @RequestParam(value="number", required=true, defaultValue="12344")String number,
                           @ModelAttribute("book") AddressBook book,
                           Model model) {
        book = repository.findAll().iterator().next();
        book.addBuddy(new BuddyInfo(name, number));
        model.addAttribute("book", book);
        repository.save(book);
        return "book";
    }

    @RequestMapping(value = "/remove", method = RequestMethod.DELETE)
    public String removeBuddy(@ModelAttribute("book") AddressBook book,
                              @RequestParam(value="name", required=true, defaultValue="name") String name,
                              @RequestParam(value="number", required=true, defaultValue="12344")String number,
                              Model model) {
        book = repository.findAll().iterator().next();
        book.removeBuddy(new BuddyInfo(name, number));
        model.addAttribute("book", book);
        repository.save(book);
        return "book";
    }

}
