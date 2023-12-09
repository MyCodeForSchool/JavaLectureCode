package Lab9Week.tshirt;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class TShirtGUI extends JFrame {
    private JPanel mainPanel;
    private JComboBox sizeComboBox;
    private JLabel selectedSizeLabel;
    private JComboBox<String> colorComboBox;
    private JLabel selectedColorLabel;

    TShirtGUI () {
        setTitle("T-Shirt Order Form");
        setContentPane(mainPanel);
        setPreferredSize(new Dimension( 300, 150));
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);




        sizeComboBox.addItem("Small");
        sizeComboBox.addItem("Medium");
        sizeComboBox.addItem("Large");

        sizeComboBox.setSelectedIndex(-1);

        sizeComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sizeSelected = (String) sizeComboBox.getSelectedItem();
                selectedSizeLabel.setText("Selected Size is " + sizeSelected);

            }
        });

        String[] colors = { "Red", "Blue", "Pink", "Black", "Green"};

        DefaultComboBoxModel<String> colorModel = new DefaultComboBoxModel<>(colors);
        colorComboBox.setModel(colorModel);

        colorModel.addElement ("Orange");
        colorModel.insertElementAt("Yellow", 2);
        colorModel.removeElementAt(0);

        List<String> moreColors = List.of("Gray", "White", "Navy");
        colorModel.addAll(moreColors);

        colorComboBox.setSelectedIndex(-1);

        System.out.println(colorModel.getIndexOf("Blue"));
        //value of -1 here, means it isn't there;  you could do
        // if (colorModel.getIndexOf("Puce") == -1) {
        //colorModel.addElement ("Pucee");
        // }

        //lambda version
//        colorComboBox.addActionListener(e -> {
//            String colorSelected = (String) colorComboBox.getSelectedItem();
//            selectedColorLabel.setText("Selected color is " + colorSelected);
//        });


        colorComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String colorSelected = (String) colorComboBox.getSelectedItem();
                selectedColorLabel.setText("Selected color is " + colorSelected);
            }
        });

    }

}
