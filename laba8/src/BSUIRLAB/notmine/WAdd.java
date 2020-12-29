package BSUIRLAB.notmine;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WAdd extends JFrame {
    private static JButton add;

    private static TextField tfModel;
    private static TextField tfBrand;
    private static TextField tfColor;
    private static TextField tfNumber;
    private static TextField tfData;

    private static JLabel lModel;
    private static JLabel lBrand;
    private static JLabel lColor;
    private static JLabel lNumber;
    private static JLabel lData;
    private static JLabel info;

    public WAdd() {
        add = new JButton("Добавить");

        tfModel = new TextField();
        tfBrand = new TextField();
        tfColor = new TextField();
        tfNumber = new TextField();
        tfData = new TextField();

        lModel = new JLabel("Модель");
        lBrand = new JLabel("Марка");
        lColor = new JLabel("Цвет");
        lNumber = new JLabel("Номер");
        lData = new JLabel("VIN");
        info = new JLabel("ТОЛЬКО ЦИФРЫ!!!");

        tfModel.setBounds(100,100,250,20);
        tfBrand.setBounds(100,150,250,20);
        tfColor.setBounds(100,250,250,20);
        tfNumber.setBounds(100,300,250,20);
        tfData.setBounds(100,350,250,20);

        lModel.setBounds(50,85,250,50);
        lBrand.setBounds(50,135,250,50);
        lColor.setBounds(40,235,250,50);
        lNumber.setBounds(50,285,250,50);
        lData.setBounds(50,335,250,50);
        info.setBounds(350,350,250,20);

        add(tfModel);
        add(tfBrand);
        add(tfColor);
        add(tfNumber);
        add(tfData);

        add(lModel);
        add(lBrand);
        add(lColor);
        add(lNumber);
        add(lData);
        add(info);

        add(add);

        add.setBounds(500,600,100,50);
        add.addActionListener(new WAdd.ButtonActionListenerAdd());

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocation(0, 0);
        setSize(1080, 720);
        setLayout(null);
        setVisible(true);
    }

    private static class ButtonActionListenerAdd implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            try {

                String textModel = tfModel.getText();
                String textData = tfData.getText();
                String textBrand = tfBrand.getText();
                String textNumber = tfNumber.getText();
                String textColor = tfColor.getText();

                ShowRoom.cars.add(new Car(textModel,Integer.parseInt(textData),textBrand
                        ,textNumber,textColor));
            } finally {
                ShowRoom.windowAdd.dispose();
            }
        }
    }
}

