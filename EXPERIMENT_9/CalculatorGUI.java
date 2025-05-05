import javax.swing.*;
import java.awt.*;
import java.event.*;

public class CalculatorGUI extends JFrame implements ActionListener{
    private JTextField textField;
    double num1,num2;
    String operator;

    public CalculatorGUI(){
          setTitle("Calculator");
          setSize(600,600);
          setDefaultCloseOperation(EXIT_ON_CLOSE);
          setLayout(null);
          
          textField = new JTextField();
          
    }
