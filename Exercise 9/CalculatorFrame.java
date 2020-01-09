/************************************************************
 *                                                          *
 *  CSCI 470-2/502-2  In Class Example 9       Summer 2019  *
 *                                                          *
 *  Class Name:  CalculatorFrame                            *
 *                                                          *
 *  Programmer:  Cory Stojan                                *
 *               Z1804761                                   *
 *                                                          *
 *  Purpose:     Framework for a calculator GUI             *
 ************************************************************/
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class CalculatorFrame extends JFrame
{
  
  private final JTextField display;
  private final JButton zero;
  private final JButton one;
  private final JButton two;
  private final JButton three;
  private final JButton four;
  private final JButton five;
  private final JButton six;
  private final JButton seven;
  private final JButton eight;
  private final JButton nine;
  private final JButton period;
  private final JButton equals;
  private final JButton plus;
  private final JButton minus;
  private final JButton times;
  private final JButton divide;
  public CalculatorFrame()
  {
    super("Calculator");
    
    FlowLayout outLayout = new FlowLayout();
    setLayout(outLayout);
    // text field
    display = new JTextField(50);
    JPanel numLayout = new JPanel();
    add(display);
    
    
    numLayout.setLayout(new GridLayout(4,4,10,10));
    zero = new JButton("0");
    one = new JButton("1");
    two = new JButton("2");
    three = new JButton("3");
    four = new JButton("4");
    five = new JButton("5");
    six = new JButton("6");
    seven = new JButton("7");
    eight = new JButton("8");
    nine = new JButton("9");
    period = new JButton(".");
    equals = new JButton("=");
    plus = new JButton("+");
    minus = new JButton("-");
    times = new JButton("*");
    divide = new JButton("/");
    
    numLayout.add(seven);
    numLayout.add(eight);
    numLayout.add(nine);
    numLayout.add(divide);
    numLayout.add(four);
    numLayout.add(five);
    numLayout.add(six);
    numLayout.add(times);
    numLayout.add(one);
    numLayout.add(two);
    numLayout.add(three);
    numLayout.add(minus);
    numLayout.add(zero);
    numLayout.add(period);
    numLayout.add(equals);
    numLayout.add(plus);
    
    add(numLayout);
  }
}