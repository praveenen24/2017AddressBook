package test;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by praveenensrikumaran on 1/26/2017.
 */
public class MyJButton extends JButton {

    private ActionListener listener;

    public MyJButton() {
        super("AddressBook");
    }

    public void setActionListener(ActionListener listener) {
        this.listener = listener;
    }

    public void init() {
        this.addActionListener(listener);
    }

}
