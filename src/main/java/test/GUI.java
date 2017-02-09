package test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by praveenensrikumaran on 1/26/2017.
 */
public class GUI {
    private JMenuBar bar;
    private JMenu menu;
    private JMenuItem newBuddy;
    private ArrayList<BuddyInfo> buddyInfos;
    private JTextArea area;

    public GUI() {
        JFrame frame = new JFrame();
        this.buddyInfos = new ArrayList<BuddyInfo>();
        JPanel panel = new JPanel();
        area = new JTextArea();
        panel.add(area);
        frame.setContentPane(panel);
        bar = new JMenuBar();
        menu = new JMenu("Buddy");
        newBuddy = new JMenuItem("New Buddy");
        menu.add(newBuddy);
        newBuddy.addActionListener(newBuddyListener);
        bar.add(menu);
        frame.setJMenuBar(bar);
        frame.setVisible(true);
        frame.setSize(500,500);
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

    public void updateList() {
        area = new JTextArea();
        for (BuddyInfo b : buddyInfos) {
            area.append(b.toString());
        }
    }

    public static void main(String[] args) {
        GUI gui = new GUI();
    }
}
