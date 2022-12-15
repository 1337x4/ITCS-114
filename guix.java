import javax.swing.JFrame;

import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class guix extends JFrame implements ActionListener{

    //very important to declare outside constructor so we can refrence them in actionPerformed method or in general outside the constructor
    JLabel label1, label2,label3,label4,label5;
    JTextField text1,text2;
    JComboBox cbox1,cbox2;
    JButton button1;
   // Font a;
    String[] temp ={"Celsius", "Fahrenheit"};

    guix()
    {
        //no need to declare JFrame because its extended to our class 
        setSize(700,600);
        //destroys window instead of minimizing by default
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //the window spawns in the middle instead of the corner
        setLocationRelativeTo(null);
        // uses default flowchart
        setLayout(null);
        //set the color of the background, use this or color(hexcode) or color.grey 
        getContentPane().setBackground(java.awt.Color.gray);
        

        label1 = new JLabel("Temperature converter");

        label1.setBounds(140,10 , 600, 50);
        label1.setFont(new Font("Arial", Font.BOLD, 30));
     
        label2 = new JLabel("Value to Convert");

        label2.setBounds(90, 70, 150, 25);
      
        label3 = new JLabel("From");

        label3.setBounds(100, 140, 150, 25);

        label4 = new JLabel("To");

        label4.setBounds(100, 210, 150, 25);

        label5 = new JLabel("Answer");

        label5.setBounds(100, 280, 150, 25);

        text1 = new JTextField();
        text1.setBounds(200, 70, 150, 25);

        text2 = new JTextField();
        text2.setBounds(200, 280, 150, 25);

        cbox1 = new JComboBox<>(temp);
        cbox1.setBounds(200, 140, 150, 25);
        cbox1.addActionListener(this);

        cbox2 = new JComboBox<>(temp);
        cbox2.setBounds(200, 210, 150, 25);
        cbox2.addActionListener(this);

        button1 = new JButton("convert");
        //we use 'this' as we are implenting ActionListener to our class, but we can use lamda if we are not implementing the ActionListener(advanced not recommended)
        button1.addActionListener(this);
        button1.setBounds(190, 350, 200,50);

        //add all the comp to see them at the frame
        add(label1);
        add(label2);
        add(label3);
        add(label4);
        add(label5);
        add(text1);
        add(text2);
        add(cbox1);
        add(cbox2);
        add(button1);
    }

    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == button1) 
        {   //getting the text from the combo box and converting them from an object to a string
            String cq1 = cbox1.getSelectedItem().toString();
            String cq2 = cbox2.getSelectedItem().toString();
        //Converting C to F, recomended to use .equals because it ignores case so if we had celsius and Celsius there will be an error at runtime
         if (cq1.equalsIgnoreCase("Celsius") && cq2.equalsIgnoreCase("Fahrenheit") ) 
         {
            double xyz = Double.parseDouble(text1.getText());
            double yz = 9 * xyz/ 5;
            double ans1 = yz +32;
            text2.setText(Double.toString(ans1));
         }
        //Converting F to C, recomended to use .equals because it ignores case so if we had celsius and Celsius there will be an error at runtime
        // DO NOT USE == ITS FOR NUMBERS, USE ONLY'equalsIgnoreCase()' built in method to compare strings
         else if (cq1.equalsIgnoreCase("Fahrenheit") && cq2.equalsIgnoreCase("Celsius")) 
         { 
            double xy = Double.parseDouble(text1.getText());
            double ans2 = 5 * (xy-32) / 9;
            text2.setText(Double.toString(ans2));
         }

        }
    }
    //main
    public static void main(String[] args) throws Exception 
    {
        //new object (frame) from our previous class, you can any name instead of 'g' it's just to refrence our new object
        guix g = new guix();
        //must be visible to see the frame
        g.setVisible(true);
    }

}
