package unit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import test.AddressBook;
import test.BuddyInfo;

/**
 * Created by praveenensrikumaran on 1/12/2017.
 */
public class AddressBookTest {
    private AddressBook book;
    private BuddyInfo buddy;
    @Before
    public void setUp() throws Exception {
        book = new AddressBook();
        book = new AddressBook();
        buddy = new BuddyInfo("test1", "1234");
        book.addBuddy(buddy);
    }

    @Test
    public void addBuddy() throws Exception {
        book.addBuddy(new BuddyInfo("test", "1234"));
        Assert.assertTrue(book.getContacts().size() == 2);
        book.addBuddy(new BuddyInfo("test1", "1234"));
        Assert.assertTrue(book.getContacts().size() == 3);
        book.addBuddy(new BuddyInfo("test2", "1234"));
        Assert.assertTrue(book.getContacts().size() == 4);
        book.addBuddy(new BuddyInfo("test3", "1234"));
        Assert.assertTrue(book.getContacts().size() == 5);
    }

    @Test
    public void removeBuddy() throws Exception {
        book.removeBuddy(buddy);
        Assert.assertTrue(book.getContacts().size() == 0);
    }

    @Test
    public void getSize() throws Exception {
        Assert.assertTrue(book.getContacts().size() == 1);
    }



}