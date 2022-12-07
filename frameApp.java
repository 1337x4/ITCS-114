
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frameApp extends JFrame implements ActionListener
{

    // Specify the window size
    public static final int Width = 500; // Window Width
    public static final int Height = 300; // Window Height


    // Define the container
    Container con; // Container

    // Define the components
    JButton covertButton; // Buttons
    JTextField textField1, textField2;  // Text Fields
    JLabel Label1, Label2, Label3; // Labels

    // Constructor
    public frameApp(){


        setTitle("Weight Convertor"); // Window Title
        setSize(Width, Height); // Set the Size
        setLocationRelativeTo(null); // Set Window Location in the middle
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Container
        con = getContentPane();
        con.setLayout(null);
        con.setBackground(Color.orange);

        // Labels

           // Label 1
           Label1 = new JLabel("Weight Calculator");
           Label1.setBounds(160, 10, 400, 40);
           Label1.setFont(new Font ("Sans-serif", Font.BOLD, 20));

            // Label 2
            Label2 = new JLabel("Weight in Pounds: ");
            Label2.setBounds(10,50,300,20);

            // Label 3
            Label3 = new JLabel("Weight in Kilograms: ");
            Label3.setBounds(10,90,300,20);


        // TextFields

            // TextField 1
            textField1 = new JTextField(30);
            textField1.setBounds(140,50,300,20);


            // TextField 2
            textField2 = new JTextField(30);
            textField2.setBounds(140,90,300,20);


        // Buttons

            // Convert Button
            covertButton = new JButton("Convert");
            covertButton.addActionListener(this);
            covertButton.setBounds(220, 140, 100, 30);


        // Adding Components to the Container
        con.add(Label1);
        con.add(Label2);
        con.add(Label3);
        con.add(textField1);
        con.add(textField2);
        con.add(covertButton);


    }

    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();

       if (actionCommand.equals("Convert")) 
       {
           String text = textField1.getText();
           double pounds = Double.parseDouble(text);
           double kilograms = pounds * 0.453592;
           textField2.setText(Double.toString(kilograms));
       }
    }

    public static void main(String[] args){

        frameApp myWindow = new frameApp();
        myWindow.setVisible(true);
    }
}