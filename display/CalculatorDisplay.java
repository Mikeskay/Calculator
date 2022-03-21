package calculator.base.display;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import calculator.base.engine.BasicCalculator;

public class CalculatorDisplay extends JFrame implements ActionListener {

    protected JPanel numberPanels;
    protected JTextArea textArea;
    protected JPanel CalculationPanel;

    public JButton one;
    public JButton two;
    public JButton three;
    public JButton four;
    public JButton five;
    public JButton six;
    public JButton seven;
    public JButton eight;
    public JButton nine;
    public JButton zero;
    public JButton dot;
    public JButton clearAll;

    private JButton division;
    private JButton multiply;
    private JButton minus;
    private JButton plus;
    private JButton equals;

    private double num1;
    private double num2;
    private char operator;
    


    public CalculatorDisplay(){

        setTitle("Basic Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(createTextArea(), BorderLayout.PAGE_START);
        getContentPane().add(createNumberPanels(), BorderLayout.CENTER);
        getContentPane().add(createCalculationPanel(), BorderLayout.EAST);
        setBounds(100,100, 300, 600);
       
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        zero.addActionListener(this);
        dot.addActionListener(this);
        clearAll.addActionListener(this);
        division.addActionListener(this);
        multiply.addActionListener(this);
        minus.addActionListener(this);
        plus.addActionListener(this);
        equals.addActionListener(this);

        this.setVisible(true);
        pack();
    } 

    @Override
    public void actionPerformed(ActionEvent e){

        Object buttonPressed = e.getSource();
        String cal;

        if (buttonPressed == one){
          textArea.setText(textArea.getText() + "1");
         }
  
         if (buttonPressed == two){
           textArea.setText(textArea.getText() + "2");
         }
  
         if (buttonPressed == three){
            textArea.setText(textArea.getText() + "3");
         }


        if (buttonPressed == four){
            textArea.setText(textArea.getText() + "4");
         }
  
         if (buttonPressed == five){
            textArea.setText(textArea.getText() + "5");
         }
  
         if (buttonPressed == six){
            textArea.setText(textArea.getText() + "6");
         }


        if (buttonPressed == seven){
            textArea.setText(textArea.getText() + "7");
         }
  
         if (buttonPressed == eight){
            textArea.setText(textArea.getText() + "8");
         }
  
         if (buttonPressed == nine){
            textArea.setText(textArea.getText() + "9");
         }
         if (buttonPressed == zero){
            textArea.setText(textArea.getText() + "0");
          }
   
          if (buttonPressed == dot){
            textArea.setText(textArea.getText() + ".");
          }
   
          if (buttonPressed == clearAll){
            textArea.setText("");
          }

          if (buttonPressed == division){

            num1 = Double.parseDouble(textArea.getText()); 
            operator = '/';
            textArea.setText("");
            
         }
  
         if (buttonPressed == multiply){
            
            num1 = Double.parseDouble(textArea.getText()); 
            operator = '*';
            textArea.setText("");
             
         }
         if (buttonPressed == minus){
            num1 = Double.parseDouble(textArea.getText());  
            operator = '-';
            textArea.setText("");
            
          }
   
          if (buttonPressed == plus){
            num1 = Double.parseDouble(textArea.getText()); 
            operator = '+';
            textArea.setText("");
             
          }
   
          if (buttonPressed == equals){
          
           num2 = Double.parseDouble(textArea.getText()); 
            
           Double numCal = BasicCalculator.calculation(operator, num1, num2);

           cal = Double.toString(numCal);
         

           textArea.setText(cal);

          }
  
  }

    public JTextArea createTextArea() {
        textArea = new JTextArea(2, 10);
        
        return textArea;
    }

    public JPanel createNumberPanels(){

        numberPanels = new JPanel();

        numberPanels.setLayout(new GridLayout(4,3));


         one = new JButton("1");
         two = new JButton("2");
         three = new JButton("3");
         four = new JButton("4");
         five = new JButton("5");
         six = new JButton("6");
         seven = new JButton("7");
         eight = new JButton("8");
         nine = new JButton("9");
         zero = new JButton("0");
         dot = new JButton(".");
         clearAll = new JButton("CE");
        
        numberPanels.add(one);
        numberPanels.add(two);
        numberPanels.add(three);
        numberPanels.add(four);
        numberPanels.add(five);
        numberPanels.add(six);
        numberPanels.add(seven);
        numberPanels.add(eight);
        numberPanels.add(nine);
        numberPanels.add(zero);
        numberPanels.add(dot);
        numberPanels.add(clearAll);
     
        return numberPanels;

    }

    public JPanel createCalculationPanel() {
         division = new JButton("÷");
         multiply = new JButton("x");
         minus = new JButton("-");
         plus = new JButton("+");
         equals = new JButton("=");
        
        CalculationPanel = new JPanel(new GridLayout(5, 1));
       
        CalculationPanel.add(division);
        CalculationPanel.add(multiply);
        CalculationPanel.add(minus);
        CalculationPanel.add(plus);
        CalculationPanel.add(equals);
     
        return CalculationPanel;
    }

    
}
