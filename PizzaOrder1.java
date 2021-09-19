import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import java.awt.GridLayout;

public class PizzaOrder1 extends JFrame {
  
private JComboBox ToppingBox; 
private JPanel NorthPanel, ButtonPanel, SizePanel, RequestPanel, SRPanel;
private JButton Order, Clear, SPD;
private JLabel SizeLabel, SpecialLabel;
private JRadioButton Small, Medium, Large;
private ButtonGroup SizeGroup;
private JTextArea SpecialArea;
  
  
  public PizzaOrder1() { 
    

    String toppingsList [] = {"--Select Topping--", "pepperoni", "sausage", "veggie"};
    ToppingBox = new JComboBox(toppingsList);
    
    NorthPanel = new JPanel();
    NorthPanel.add(ToppingBox);
    
    add(NorthPanel, BorderLayout.NORTH);
    
    Order = new JButton("Order");
    Clear = new JButton("Clear");
    SPD = new JButton("Stocking Pizza Dough");
    
    ButtonPanel = new JPanel();
    ButtonPanel.add(Order);
    ButtonPanel.add(Clear);
    ButtonPanel.add(SPD);
    
    add(ButtonPanel, BorderLayout.SOUTH);
    
    SizeLabel = new JLabel("Size:");
    SizePanel = new JPanel();
    SizeGroup = new ButtonGroup();
    Small = new JRadioButton("Small");
    Medium = new JRadioButton("Medium");
    Large = new JRadioButton("Large");
    
    SizeGroup.add(Small);
    SizeGroup.add(Medium);
    SizeGroup.add(Large);
      
    SizePanel.add(SizeLabel);
    SizePanel.add(Small);
    SizePanel.add(Medium);
    SizePanel.add(Large);
    add(SizePanel, BorderLayout.CENTER);
    
    SRPanel = new JPanel();
    SRPanel.setLayout(new GridLayout(4,1));
    
    SpecialLabel = new JLabel("Special Request:");
    SpecialArea = new JTextArea(3,8);
    RequestPanel = new JPanel();
    RequestPanel.add(SpecialLabel);
    RequestPanel.add(SpecialArea);
    SRPanel.add(SizePanel);
    SRPanel.add(RequestPanel);
    add(SRPanel, BorderLayout.CENTER);
    
    
    
    
    setTitle("Pizza Order");
    setSize(500, 260);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  
  
  
  public static void main(String [] args){
  PizzaOrder1 app = new PizzaOrder1();  
    
    
    
    
  }
}