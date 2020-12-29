package BSUIRLAB.notmine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WDelete extends JFrame {
    private static JLabel label;
    private static TextField textField;
    private static JButton button;

    public WDelete() {
        label = new JLabel("Что вы хотите удалить?");
        textField = new TextField();
        button = new JButton("Удалить");

        label.setBounds(200,100,200,50);
        textField.setBounds(200,200,100,25);
        button.setBounds(500,600,100,50);

        add(label);
        add(textField);
        add(button);

        button.addActionListener(new WDelete.ButtonActionListenerDelete());

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocation(0, 0);
        setSize(1080, 720);
        setLayout(null);
        setVisible(true);
    }

    private static class ButtonActionListenerDelete implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                String s = textField.getText();

                for (int i = 0; i < ShowRoom.cars.size(); i++) {
                    if(ShowRoom.cars.get(i).getData() == Integer.parseInt(s)) {
                        ShowRoom.cars.remove(ShowRoom.cars.get(i));
                    }
                }
            } finally {
                ShowRoom.windowDelete.dispose();
            }
        }
    }
}


