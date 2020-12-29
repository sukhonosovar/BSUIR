package BSUIRLAB.notmine;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class WSearch extends JFrame {
    private static JButton button;
    private static JLabel label;
    private static JTextField textField;

    public WSearch() {
        button = new JButton("Поиск");
        label = new JLabel("Нужно найти");
        textField = new JTextField();

        button.setBounds(750,600,100,50);
        label.setBounds(0,100,100,25);
        textField.setBounds(100,100,100,25);

        add(button);
        add(label);
        add(textField);

        button.addActionListener(new ButtonActionListenerSearch());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocation(0, 0);
        setSize(1080, 720);
        setLayout(null);
        setVisible(true);
    }

    private static class ButtonActionListenerSearch implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                FileWriter outName = new FileWriter("test.txt", true);
                String s = textField.getText();

                for(int i = 0; i < ShowRoom.cars.size();i++)
                {
                    if(ShowRoom.cars.get(i).getData() == Integer.parseInt(s)) {
                        outName.write(ShowRoom.cars.get(i).toString());
                    }
                }
                outName.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            } finally {
                ShowRoom.wSearch.dispose();
                Owner.showRoom.dispose();
            }
        }
    }
}

