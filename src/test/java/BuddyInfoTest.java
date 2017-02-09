import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import test.BuddyInfo;

/**
 * Created by praveenensrikumaran on 1/12/2017.
 */
public class BuddyInfoTest {
    private BuddyInfo buddy;

    @Before
    public void setUp() throws Exception {
        buddy = new BuddyInfo("name", "1234");
    }

    @Test
    public void getName() throws Exception {
        Assert.assertEquals(buddy.getName(), "name");
    }

    @Test
    public void setName() throws Exception {
        buddy.setName("test");
        Assert.assertEquals(buddy.getName(), "test");
    }

    @Test
    public void getNumber() throws Exception {
        Assert.assertEquals(buddy.getNumber(), "1234");
    }

    @Test
    public void setNumber() throws Exception {
        buddy.setNumber("test");
        Assert.assertEquals(buddy.getNumber(), "test");
    }

}