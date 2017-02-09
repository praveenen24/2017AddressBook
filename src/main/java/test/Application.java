package test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/*@SpringBootApplication
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    @Bean
    public CommandLineRunner demo1(AddressBookRepository repository, BuddyInfoRepository repo) {
        return (args) -> {
            AddressBook book1 = new AddressBook();
            AddressBook book2 = new AddressBook();
            book1.setId(1);
            book1.setId(2);
            book1.addBuddy(new BuddyInfo("Jack", "1234"));
            book1.addBuddy(new BuddyInfo("Chloe", "2144"));
            book1.addBuddy(new BuddyInfo("Kim", "1432"));
            book1.addBuddy(new BuddyInfo("David", "1223"));
            book1.addBuddy(new BuddyInfo("Michelle", "2211"));
            repository.save(book1);
            repository.save(book2);

            BuddyInfo buddy = new BuddyInfo("Jack", "1234");
            BuddyInfo buddy2 = new BuddyInfo("Chloe", "2144");
            BuddyInfo buddy3 = new BuddyInfo("Kim", "1432");
            BuddyInfo buddy4 = new BuddyInfo("David", "1223");
            BuddyInfo buddy5 = new BuddyInfo("Michelle", "2211");
            repo.save(buddy);
            repo.save(buddy2);
            repo.save(buddy3);
            repo.save(buddy4);
            repo.save(buddy5);

            log.info("AddressBooks found with findAll():");
            log.info("-------------------------------");
            for (AddressBook addressBook : repository.findAll()) {
                log.info("Id = " + addressBook.getId());
            }
            log.info("");

            log.info("addressBook found with findById(1):");
            log.info("--------------------------------------------");
            for (AddressBook addressBook1 : repository.findById(1)) {
                log.info("Id = " + addressBook1.getId());
            }
            log.info("");

            log.info("Buddys found with findAll():");
            log.info("-------------------------------");
            for (BuddyInfo bud : repo.findAll()) {
                log.info(bud.toString());
            }
            log.info("");
        };
    }

}*/