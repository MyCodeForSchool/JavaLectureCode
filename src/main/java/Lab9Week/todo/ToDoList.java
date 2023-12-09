package Lab9Week.todo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ToDoList extends JFrame {
    private JPanel rootPanel;
    private JTextField newToDoTextField;
    private JButton addToDoButton;
    private JList<String> toDoList;
    private JButton deleteSelectedButton;
    private DefaultListModel<String> listModel;
    private JPopupMenu rightClickMenu;
    private JMenuItem deleteMenuItem;

    ToDoList(){
        setTitle("To do list");
        setContentPane(rootPanel);
        setPreferredSize(new Dimension(600,600));
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        listModel = new DefaultListModel<>();
        toDoList.setModel(listModel);
        toDoList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        getRootPane().setDefaultButton(addToDoButton);

        rightClickMenu = new JPopupMenu();
        deleteMenuItem =new JMenuItem("Delete");
        rightClickMenu.add(deleteMenuItem);

        toDoList.setComponentPopupMenu(rightClickMenu);

        addListeners();


    }

    private void addListeners() {

        addToDoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String newTodo = newToDoTextField.getText();
                newTodo = newTodo.trim();
                if (newTodo.isEmpty()) {
                    JOptionPane.showMessageDialog(ToDoList.this,"Enter A To Do Item");
                } else {
                    listModel.addElement(newTodo);
                    newToDoTextField.setText("");
                }
            }
        });


//        toDoList.addListSelectionListener(new ListSelectionListener() {
//            @Override
//            public void valueChanged(ListSelectionEvent e) {
//                int selectedIndex = toDoList.getSelectedIndex(); //-1 if nothing selected
//                if (selectedIndex != -1) {
//                    String itemToDelete = toDoList.getSelectedValue();
//
//                    if (JOptionPane.showConfirmDialog(ToDoList.this, "Delete" + itemToDelete + "?", "Delete", JOptionPane.OK_CANCEL_OPTION)
//                            == JOptionPane.OK_OPTION) {
//                        listModel.remove(selectedIndex);
//                    }
//                }
//            }
//        });

        deleteSelectedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = toDoList.getSelectedIndex();
                if (selectedIndex != -1) {
                    String itemToDelete = toDoList.getSelectedValue();
                    if (JOptionPane.showConfirmDialog(ToDoList.this, "Delete" + itemToDelete + "?", "Delete", JOptionPane.OK_CANCEL_OPTION)
                            == JOptionPane.OK_OPTION) {
                        listModel.remove(selectedIndex);
                    }
                    }else {
                    JOptionPane.showMessageDialog(ToDoList.this, "Select an Item to Delete");
                }
            }
        });

        deleteMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = toDoList.getSelectedIndex();
                if (selectedIndex != -1) {
                    String itemToDelete = toDoList.getSelectedValue();
                       listModel.remove(selectedIndex);
                    }else {
                    JOptionPane.showMessageDialog(ToDoList.this, "Select an Item to Delete");
                }
            }
        });

        toDoList.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int selection =toDoList.locationToIndex(e.getPoint()); //which item is under the mouse click
                toDoList.setSelectedIndex(selection);
            }
            @Override
            public void mousePressed(MouseEvent e) {
            }
            @Override
            public void mouseReleased(MouseEvent e) {
            }
            @Override
            public void mouseEntered(MouseEvent e) {
            }
            @Override
            public void mouseExited(MouseEvent e) {
            }
        });


    }

}
