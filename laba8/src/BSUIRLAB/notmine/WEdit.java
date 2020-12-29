package BSUIRLAB.notmine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WEdit extends JFrame {
    private static JButton edit;

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
    private static JLabel lInfo;

    public WEdit() {
        edit = new JButton("Edit");

        tfModel = new TextField();
        tfBrand = new TextField();
        tfColor = new TextField();
        tfNumber = new TextField();
        tfData = new TextField();

        lModel = new JLabel("Модель");
        lBrand = new JLabel("Марка");
        lColor = new JLabel("Цвет");
        lNumber = new JLabel("Производ.");
        lData = new JLabel("VIN");
        lInfo = new JLabel("ТОЛЬКО ЦИФРЫ!!!");

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
        lInfo.setBounds(350,335,400,50);

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
        add(lInfo);

        add(edit);

        edit.setBounds(500,600,100,50);
        edit.addActionListener(new WEdit.ButtonActionListenerEdit());

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocation(0, 0);
        setSize(1080, 720);
        setLayout(null);
        setVisible(true);
    }

    private static class ButtonActionListenerEdit implements ActionListener {
        private int editIndex =  0;

        public void actionPerformed(ActionEvent e) {
            int k = 0;
            try {
                String textModel = tfModel.getText();
                String textData = tfData.getText();
                String textBrand = tfBrand.getText();
                String textNumber = tfNumber.getText();
                String textColor = tfColor.getText();



                for (int i = 0; i < ShowRoom.cars.size(); i++) {
                    if(ShowRoom.cars.get(i).getData() == Integer.parseInt(textData)) {
                        k = i;
                    }
                }

                ShowRoom.cars.set(k,new Car(textModel,Integer.parseInt(textData),textBrand,
                        textNumber,textColor));
            } finally {
                ShowRoom.windowEdit.dispose();
            }
        }
    }
}

