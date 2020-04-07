package newcalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;


public class CalcFrame extends JFrame 
{
    private JButton No1;
    private JButton No2;
    private JButton No3;
    private JButton No4;
    private JButton No5;
    private JButton No6;
    private JButton No7;
    private JButton No8;
    private JButton No9;
    private JButton No0;
    private JButton equals;
    private JButton addition;
    private JButton subtract;
    private JButton multiply;
    private JButton divide;
    private JButton factorial;
    private JButton modulus;
    private JButton power;
    private JButton root;
    private JButton clear;
    private JTextField Screen;
    private int temp;
    private JButton pom;
            
    private Calculator Calc;
    private double firstOp;
    private double secondOp;
    private char operator;
    
    public CalcFrame()
    {
        Calc = new Calculator();
        No1 = new JButton("1");
        No2 = new JButton("2");
        No3 = new JButton("3");
        No4 = new JButton("4");
        No5 = new JButton("5");
        No6 = new JButton("6");
        No7 = new JButton("7");
        No8 = new JButton("8");
        No9 = new JButton("9");
        No0 = new JButton("0");
        clear = new JButton("C");
        equals = new JButton("=");
        addition = new JButton("+");
        subtract = new JButton("-");
        multiply = new JButton("*");
        divide = new JButton("/");
        factorial = new JButton("!");
        modulus = new JButton("%");
        power = new JButton("^");
        root = new JButton("S");
        
        Screen = new JTextField();
        pom = new JButton("+/-");
        
        No1.setBounds(65,131,65,65);
        No2.setBounds(131,131,65,65);
        No3.setBounds(197,131,65,65);
        divide.setBounds(263,131,65,65);
        No4.setBounds(65,197,65,65);
        No5.setBounds(131,197,65,65);
        No6.setBounds(197,197,65,65);
        power.setBounds(263,197,65,65);
        No7.setBounds(65,263,65,65);
        No8.setBounds(131,263,65,65);
        No9.setBounds(197,263,65,65);
        multiply.setBounds(263,263,65,65);
        subtract.setBounds(65,329,65,65);
        equals.setBounds(263,329,65,65);
        addition.setBounds(197,329,65,65);   
        No0.setBounds(131,329,65,65);
        root.setBounds(65,395,65,65);
        factorial.setBounds(131,395,65,65);
        modulus.setBounds(197,395,65,65);
        clear.setBounds(263,395,65,65);
        
        Screen.setBounds(65,25,263,65);
        Screen.setEditable(false);
        pom.setBounds(330,25,65,65);
        
        
        No1.addActionListener(new ListeningTo1());
        No2.addActionListener(new ListeningTo2());
        No3.addActionListener(new ListeningTo3());
        No4.addActionListener(new ListeningTo4());
        No5.addActionListener(new ListeningTo5());
        No6.addActionListener(new ListeningTo6());
        No7.addActionListener(new ListeningTo7());
        No8.addActionListener(new ListeningTo8());
        No9.addActionListener(new ListeningTo9());
        No0.addActionListener(new ListeningTo0());
        addition.addActionListener(new ListeningToAdd());
        subtract.addActionListener(new ListeningToSubtract());
        multiply.addActionListener(new ListeningToMultiply());
        clear.addActionListener(new ListeningToClear());
        equals.addActionListener(new ListeningToEqual());
        modulus.addActionListener(new ListeningToModulus());
        factorial.addActionListener(new ListeningToFactorial());
        root.addActionListener(new ListeningToSquareRoot());
        divide.addActionListener(new ListeningToDivision());
        power.addActionListener(new ListeningToPower());
        
        setLayout(null);
        setSize(400,550);
        setLocation(100,300);
        setResizable(false);
        add(No1);
        add(No2);
        add(No3);
        add(No4);
        add(No5);
        add(No6);
        add(No7);
        add(No8);
        add(No9);
        add(No0);
        add(clear);
        add(equals);
        add(addition);
        add(multiply);
        add(subtract);
        add(Screen);
        add(divide);
        add(power);
        add(root);
        add(factorial);
        add(modulus);
        add(pom);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
 public class ListeningTo1 implements ActionListener
 {
     public void actionPerformed(ActionEvent e)
     {
        Screen.setText(Screen.getText()+"1");
     }
 }
 
 public class ListeningTo2 implements ActionListener
 {
     public void actionPerformed(ActionEvent e)
     {
        Screen.setText(Screen.getText()+"2");
     }
 }
 
 public class ListeningTo3 implements ActionListener
 {
     public void actionPerformed(ActionEvent e)
     {
        Screen.setText(Screen.getText()+"3");
     }
 }
 
 public class ListeningTo4 implements ActionListener
 {
     public void actionPerformed(ActionEvent e)
     {
        Screen.setText(Screen.getText()+"4");
     }
 }
 
 public class ListeningTo5 implements ActionListener
 {
     public void actionPerformed(ActionEvent e)
     {
        Screen.setText(Screen.getText()+"5");
     }
 }
    
public class ListeningTo6 implements ActionListener
 {
     public void actionPerformed(ActionEvent e)
     {
        Screen.setText(Screen.getText()+"6");
     }
 }

public class ListeningTo7 implements ActionListener
 {
     public void actionPerformed(ActionEvent e)
     {
        Screen.setText(Screen.getText()+"7");
     }
 }

public class ListeningTo8 implements ActionListener
 {
     public void actionPerformed(ActionEvent e)
     {
        Screen.setText(Screen.getText()+"8");
     }
 }

public class ListeningTo9 implements ActionListener
 {
     public void actionPerformed(ActionEvent e)
     {
        Screen.setText(Screen.getText()+"9");
     }
 }

public class ListeningTo0 implements ActionListener
 {
     public void actionPerformed(ActionEvent e)
     {
        Screen.setText(Screen.getText()+"0");
     }
 }

public class ListeningToAdd implements ActionListener
 {
     public void actionPerformed(ActionEvent e)
     {
        firstOp = Double.parseDouble(Screen.getText());
        operator = '+';
        Screen.setText("");
     }
 }
    
public class ListeningToSubtract implements ActionListener
 {
     public void actionPerformed(ActionEvent e)
     {
        firstOp = Double.parseDouble(Screen.getText());
        operator = '-';
        Screen.setText("");
       
     }
 }

public class ListeningToMultiply implements ActionListener
 {
     public void actionPerformed(ActionEvent e)
     {
        firstOp = Double.parseDouble(Screen.getText());
        operator = '*';
        Screen.setText("");
     }
 }

public class ListeningToModulus implements ActionListener
 {
     public void actionPerformed(ActionEvent e)
     {
        firstOp = Double.parseDouble(Screen.getText());
        operator = '%';
        Screen.setText("");
     }
 }

public class ListeningToPower implements ActionListener
 {
     public void actionPerformed(ActionEvent e)
     {
        firstOp = Double.parseDouble(Screen.getText());
        operator = '^';
        Screen.setText("");
     }
 }

public class ListeningToSquareRoot implements ActionListener
 {
     public void actionPerformed(ActionEvent e)
     {
        firstOp = Double.parseDouble(Screen.getText());
        operator = 's';
        Screen.setText(Calc.root(firstOp)+"");
        firstOp = Double.parseDouble(Screen.getText());
        
     }
 }

public class ListeningToDivision implements ActionListener
 {
     public void actionPerformed(ActionEvent e)
     {
        firstOp = Double.parseDouble(Screen.getText());
        operator = '/';
        Screen.setText("");
     }
 }

public class ListeningToFactorial implements ActionListener
 {
     public void actionPerformed(ActionEvent e)
     {
        firstOp = Double.parseDouble(Screen.getText());
        operator = '!';
        Screen.setText(Calc.factorial(firstOp)+"");
        firstOp = Double.parseDouble(Screen.getText());
     }
 }

public class ListeningToClear implements ActionListener
 {
     public void actionPerformed(ActionEvent e)
     {
        Screen.setText("");
     }
 }

public class ListeningToEqual implements ActionListener 
{
    public void actionPerformed(ActionEvent e)
    {
         secondOp= Double.parseDouble(Screen.getText());
           if(operator == '+')
           {
               Screen.setText(Calc.addition(firstOp,secondOp)+"");
               firstOp = Double.parseDouble(Screen.getText());
           }
           
           else if(operator == '-')
           {
               Screen.setText(Calc.subtraction(firstOp,secondOp)+"");
               firstOp = Double.parseDouble(Screen.getText());
           }
           
           else if(operator == '*')
           {
               Screen.setText(Calc.multiplication(firstOp,secondOp)+"");
               firstOp = Double.parseDouble(Screen.getText());
           }
           
           else if(operator == '/')
           {
               Screen.setText(Calc.division(firstOp,secondOp)+"");
               firstOp = Double.parseDouble(Screen.getText());
           }
           
            else if(operator == '%')
           {
               Screen.setText(Calc.modulus(firstOp,secondOp)+"");
               firstOp = Double.parseDouble(Screen.getText());
           }
            
           else if(operator == 's')
           {
               Screen.setText(Calc.root(firstOp)+"");
               firstOp = Double.parseDouble(Screen.getText());
           }
           
           else if(operator == '!')
           {
               Screen.setText(Calc.factorial(firstOp)+"");
               firstOp = Double.parseDouble(Screen.getText());
               
           }
           else{
               Screen.setText(Calc.power(firstOp,secondOp)+"");
           }
        
      
    }
}

   
}
