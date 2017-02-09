package test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by praveenensrikumaran on 1/26/2017.
 */
public class Launch {

    private MyJButton button;
    private ArrayList<BuddyInfo> buddyInfos;
    private MyJTextArea area;

    public Launch() {
        area = new MyJTextArea();
        //button = new MyJButton("New Buddy");
        AddressBook book = new AddressBook();
        book.addObserver(area);
       // MyActionListener listener = new MyActionListener(book);
        //button.addActionListener(listener);
       // MyJPanel panel = new MyJPanel(area, button);
       // MyJFrame frame = new MyJFrame("AddressBook", panel);
    }

    private ActionListener newBuddyListener = new ActionListener() {

        public void actionPerformed(ActionEvent e) {
            String name = JOptionPane.showInputDialog("Enter name");
            String number = JOptionPane.showInputDialog("Enter number");
            if (name != null && number != null) {
                BuddyInfo buddy = new BuddyInfo(name, number);
                buddyInfos.add(buddy);
                area.append(buddy.toString() + "\n");
            }
        }
    };

    public static void main(String[] args) {
        Launch l = new Launch();
    }
}