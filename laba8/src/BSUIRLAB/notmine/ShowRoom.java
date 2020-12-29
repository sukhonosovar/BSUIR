package BSUIRLAB.notmine;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class ShowRoom extends JFrame {
    protected static WSearch wSearch;
    protected static WAdd windowAdd;
    protected static WDelete windowDelete;
    protected static WEdit windowEdit;

    private static JButton bAdd;
    private static JButton bDelete;
    private static JButton bEdit;
    private static JButton bSearch;

    protected static List<Car> cars = new ArrayList<>();


    public ShowRoom() throws FileNotFoundException {
        bAdd = new JButton("Добавить");
        bDelete = new JButton("Удалить");
        bEdit = new JButton("Редактировать");
        bSearch = new JButton("Сортировать");

        bAdd.setBounds(375,600,100,50);
        bDelete.setBounds(500,600,100,50);
        bEdit.setBounds(625,600,100,50);
        bSearch.setBounds(750,600,100,50);

        add(bAdd);
        add(bDelete);
        add(bEdit);
        add(bSearch);

        bAdd.addActionListener(new ShowRoom.ButtonActionListenerAdd());
        bDelete.addActionListener(new ShowRoom.ButtonActionListenerDelete());
        bEdit.addActionListener(new ShowRoom.ButtonActionListenerEdit());
        bSearch.addActionListener(new ShowRoom.ButtonActionListenerSearch());

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocation(0, 0);
        setSize(1080, 720);
        setLayout(null);
        setVisible(true);
    }


    private static class ButtonActionListenerAdd implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            windowAdd = new WAdd();
        }
    }

    private static class ButtonActionListenerDelete implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            windowDelete = new WDelete();
        }
    }

    private static class ButtonActionListenerEdit implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            windowEdit = new WEdit();
        }
    }

    private static class ButtonActionListenerSearch implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            wSearch = new WSearch();
        }
    }
}

