/************************************************************
 *                                                          *
 *  CSCI 470-2/502-2  In Class Example 9       Summer 2019  *
 *                                                          *
 *  Class Name:  Alligntest                                 *
 *                                                          *
 *  Programmer:  Cory Stojan                                *
 *               Z1804761                                   *
 *                                                          *
 *  Purpose:     Framework for a Allignment GUI             *
 ************************************************************/
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class AllignFrame extends JFrame
{
  private final JCheckBox checkBox1;
  private final JCheckBox checkBox2;
  
  private final JLabel x;
  private final JTextField xt;
  private final JLabel y;
  private final JTextField yt;
  
  
  private final JButton okButton;
  private final JButton cancelButton;
  private final JButton helpButton;
  
  
  public AllignFrame()
  {
    super("Allign");
    JPanel layout = new JPanel();
    layout.setLayout(new GridLayout(1,3,2,2));
    
    
    // set layout for checkbox section
    JPanel p1 = new JPanel();
    p1.setLayout(new GridLayout(2,1));
    checkBox1 = new JCheckBox("Checkbox 1");
    checkBox2 = new JCheckBox("Checkbox 2");
    p1.add(checkBox1);
    p1.add(checkBox2);
    layout.add(p1);
    
    // set layout for loction
    JPanel p2 = new JPanel();
    p2.setLayout(new GridLayout(2,2));
    x = new JLabel("X: ");
    xt = new JTextField("0", 5);
    y = new JLabel("Y: ");
    yt = new JTextField("0", 5);
    p2.add(x);
    p2.add(xt);
    p2.add(y);
    p2.add(yt);
    layout.add(p2);
    
    // set layout for button section
    JPanel p3 = new JPanel();
    p3.setLayout(new GridLayout(3,1));
    okButton = new JButton("Ok");
    cancelButton = new JButton("Cancel");
    helpButton = new JButton("Help");
    p3.add(okButton);
    p3.add(cancelButton);
    p3.add(helpButton);
    layout.add(p3);
    
    //output grid
    add(layout);
    
  
  }

}