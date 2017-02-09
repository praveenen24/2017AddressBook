package test;

import javax.swing.*;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by praveenensrikumaran on 1/26/2017.
 */
public class MyJTextArea extends JTextArea implements Observer {

    public void update(Observable o, Object arg) {
        append(arg.toString() + "\n");
    }
}
