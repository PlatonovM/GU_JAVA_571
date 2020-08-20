package Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form extends JFrame {
    Double result = 0.0;
    String operation = "";
    public Form(String title) {
        setTitle(title);
        setBounds(50, 30, 300, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new Color(100, 232,214));

        setLayout(new GridLayout(2, 1));

        JTextField inputField = new JTextField();
        inputField.setEditable(false);

        ButtonListener buttonListener = new ButtonListener(inputField);

        JPanel buttonPanel = new JPanel(new GridLayout(5, 3));

        for (int i = 0; i <= 9; i++) {
            JButton digit = new JButton(String.valueOf(i));
            digit.addActionListener(buttonListener);
            buttonPanel.add(digit);
        }

        JButton plus = new JButton("+");
        plus.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg1)
            {
                result = Double.valueOf(inputField.getText());
                operation = "+";
                inputField.setText("");
            }
        });
        JButton minus = new JButton("-");
        minus.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg1)
            {
                result = Double.valueOf(inputField.getText());
                operation = "-";
                inputField.setText("");
            }
        });
        JButton multiple = new JButton("*");
        multiple.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg1)
            {
                result = Double.valueOf(inputField.getText());
                operation = "*";
                inputField.setText("");
            }
        });

        JButton clear = new JButton("C");
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField.setText("");
            }
        });
        JButton divided = new JButton("/");
        divided.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg1)
            {
                result = Double.valueOf(inputField.getText());
                operation = "/";
                inputField.setText("");
            }
        });


        buttonPanel.add(plus);
        buttonPanel.add(minus);
        buttonPanel.add(multiple);
        buttonPanel.add(divided);
        buttonPanel.add(clear);

        add(buttonPanel);

        JPanel inputPanel = new JPanel(new BorderLayout());
        JButton submit = new JButton("Submit");
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int secondValue = Integer.parseInt(inputField.getText());
                if("+".equals(operation)){
                    inputField.setText(String.valueOf((result +secondValue)));
                }
                if("-".equals(operation)){
                    inputField.setText(String.valueOf((result -secondValue)));
                }
                if("*".equals(operation)){
                    inputField.setText(String.valueOf((result *secondValue)));
                }
                if("/".equals(operation)){
                    inputField.setText(String.valueOf((result /secondValue)));
                }
                result = 0.0;
            }
        });

        inputPanel.add(inputField, BorderLayout.CENTER);
        inputPanel.add(submit, BorderLayout.EAST);

        add(inputPanel);

        setVisible(true);
    }
}
