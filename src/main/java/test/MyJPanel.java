package test;

import javax.swing.*;

/**
 * Created by praveenensrikumaran on 1/26/2017.
 */
public class MyJPanel extends JPanel {

    private MyJTextArea area;
    private MyJButton button;
    private AddressBook addressBook;

    public MyJPanel() {

    }

    public void setArea(MyJTextArea area) {
        this.area = area;
    }

    public void setAddressBook(AddressBook addressBook) {
        this.addressBook = addressBook;
    }

    public void setButton(MyJButton button) {
        this.button = button;
    }

    public void init() {
        add(area);
        add(button);
        addressBook.addObserver(area);
    }
}
