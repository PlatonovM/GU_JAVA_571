package Lesson2_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Chat extends JFrame {
    public Chat(){
        setTitle("Chat v0.1");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(new Rectangle(0,0,300,500));
        setLayout(new GridLayout(2,1));
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());
        JTextArea chatField = new JTextArea();
        chatField.setEditable(false);
        top.add(chatField);
        JPanel bottom = new JPanel();
        bottom.setLayout(new GridLayout(1,2));
        JTextField inputField = new JTextField();
        add(inputField);
        inputField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                appendText(chatField,inputField);
//                StringBuilder sb = new StringBuilder(chatField.getText());
//                sb.append("\n").append(inputField.getText());
//                chatField.setText(sb.toString());
//                inputField.setText("");
            }
        });
        inputField.setEditable(true);
        bottom.add(inputField);

        JButton buttonEnter = new JButton("Send");
        add(buttonEnter);
        buttonEnter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                appendText(chatField,inputField);
//                StringBuilder sb = new StringBuilder(chatField.getText());
//                sb.append("\n").append(inputField.getText());
//                chatField.setText(sb.toString());
//                inputField.setText("");
            }
        });

        bottom.add(buttonEnter);
        add(top);
        add(bottom);
        setVisible(true);

    }
    private void appendText(JTextArea chatField, JTextField inputField){
        StringBuilder sb = new StringBuilder(chatField.getText());
        sb.append("\n").append(inputField.getText());
        chatField.setText(sb.toString());
        inputField.setText("");
    }
}
