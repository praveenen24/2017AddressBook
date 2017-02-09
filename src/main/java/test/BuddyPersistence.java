package test;

import javax.persistence.*;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by praveenensrikumaran on 1/18/2017.
 */
public class BuddyPersistence {

    public static void persistAddressBook() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa-4806");
        EntityManager manager = factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();

        transaction.begin();

        AddressBook book = new AddressBook();
        book.setId(1);

        BuddyInfo buddy1 = new BuddyInfo();
        buddy1.setName("Praveenen");
        buddy1.setNumber("1234");

        BuddyInfo buddy2 = new BuddyInfo();
        buddy2.setName("Test");
        buddy2.setNumber("4321");

        BuddyInfo buddy3 = new BuddyInfo();
        buddy3.setName("Testing");
        buddy3.setNumber("3212");

        book.addBuddy(buddy1); book.addBuddy(buddy2); book.addBuddy(buddy3);

        manager.persist(book);

        transaction.commit();

        Query query = manager.createQuery("SELECT a from AddressBook a");

        List<AddressBook> contacts = query.getResultList();


        System.out.println("\n----------------Printing BuddyInfos in Addressbook--------------");
        for (AddressBook b : contacts) {
            for (BuddyInfo bud : b.getContacts()) {
                System.out.println(bud);
            }
        }

        manager.close();
        factory.close();
    }

    public static void persistBuddy() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa-4806");
        EntityManager manager = factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();

        transaction.begin();

        BuddyInfo buddy1 = new BuddyInfo();
        buddy1.setName("Praveenen");
        buddy1.setNumber("1234");

        manager.persist(buddy1);

        transaction.commit();
        Query query = manager.createQuery("SELECT b from BuddyInfo b");

        List<BuddyInfo> contacts = query.getResultList();

        for (BuddyInfo buddy : contacts) {
            System.out.println(buddy);
        }

        manager.close();
        factory.close();
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        persistAddressBook();
    }
}
