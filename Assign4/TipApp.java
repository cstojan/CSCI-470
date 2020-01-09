/************************************************************
 *                                                          *
 *  CSCI 470-2/502-2       Assignment 4        Summer 2019  *
 *                                                          *
 *  Class Name:  Date                                       *
 *                                                          *
 *  Programmer:  CORY STOJAN                                *
 *               Z1804761                                   *
 *                                                          *
 *  Purpose:  A Tip Calculator Using A GUI                  *
 *                                                          *
 ************************************************************/
import java.awt.GridLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JSlider;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

// Class Begins
public class TipApp extends JFrame implements ActionListener
{
  // Instatiate all varaibles
  private final GridLayout gridLayout;
  private final JPanel billPanel;
  private final JPanel tipPanel;
  private final JPanel partyPanel;
  private final JPanel buttonsPanel;
  private final JPanel outputPanel;
  private final FlowLayout flowLayout;
  private final GridBagLayout gridBagLayout;
  private final GridBagConstraints constraints;
  private final JTextField billAmountInput;
  private final JLabel billAmountLabel;
  private final JLabel tipPercentLabel;
  private final JLabel partySizeLabel;
  private final JButton calculateButton;
  private final JButton clearButton;
  private final JLabel totalBillLabel;
  private final JLabel individualShareLabel;
  private final JLabel totalOutLabel;
  private final JLabel individualOutLabel;
  private final JSlider tipSlider;
  private final JSpinner partySpiner;

/************************************************************
 *                                                          *
 *  Method Name:  Date                                      *
 *                                                          *
 *  Purpose:  Constructor for the tipApp Frame GUI          *
 *                                                          *
 ************************************************************/
  public TipApp()
  {
    super("Tip Calculator");

    // set inital values for the frame
    gridLayout = new GridLayout(2,2);
    billPanel = new JPanel();
    tipPanel = new JPanel();
    partyPanel = new JPanel();
    buttonsPanel = new JPanel();
    outputPanel = new JPanel();
    flowLayout = new FlowLayout();
    gridBagLayout = new GridBagLayout();
    constraints = new GridBagConstraints(); // instantiate constraints
    setLayout(gridBagLayout);
    // set constraints
    constraints.fill = GridBagConstraints.BOTH;
    constraints.ipady = 15;

    // set Components
    // bill input
    billAmountInput = new JTextField(15);    
    billAmountLabel = new JLabel("Bill Amount");

    billPanel.setLayout(flowLayout);
    billPanel.add(billAmountLabel);
    billPanel.add(billAmountInput);

    // tip input
    tipPercentLabel = new JLabel("Tip Percentage");
    tipSlider = new JSlider(0, 50, 20);
    tipPanel.setLayout(flowLayout);

    tipSlider.setPaintTrack(true); 
    tipSlider.setPaintTicks(true);
    tipSlider.setPaintLabels(true);

    tipSlider.setMajorTickSpacing(10);
    tipSlider.setMinorTickSpacing(5);
    tipPanel.add(tipPercentLabel);
    tipPanel.add(tipSlider);

    // Party Spinner
     int partyNum = 0;
    partySizeLabel = new JLabel("Party Size");
    
    SpinnerNumberModel partySpinerModel = new SpinnerNumberModel(1, 1, 20, 1);
    partySpiner = new JSpinner(partySpinerModel);

    partyPanel.setLayout(flowLayout);
    partyPanel.add(partySizeLabel);
    partyPanel.add(partySpiner);

    // buttons
    calculateButton = new JButton("Calculate");
    calculateButton.addActionListener(this);

    clearButton = new JButton("Clear");
    clearButton.addActionListener(this);

    buttonsPanel.setLayout(flowLayout);
    buttonsPanel.add(calculateButton);
    buttonsPanel.add(clearButton);

    // output
    totalBillLabel = new JLabel("Total Bill (With Tip)");
    individualShareLabel = new JLabel("Individual Share");
    totalOutLabel = new JLabel("$0.00");
    individualOutLabel = new JLabel("$0.00");

    outputPanel.setLayout(gridLayout);
    outputPanel.add(totalBillLabel);
    outputPanel.add(individualShareLabel);
    outputPanel.add(totalOutLabel);
    outputPanel.add(individualOutLabel);

    // add components
    addComponent(billPanel, 0, 0, 1, 1);

    addComponent(tipPanel, 1, 0, 1, 1);

    addComponent(partyPanel, 2, 0, 1, 1);

    addComponent(buttonsPanel, 3, 0, 1, 1);

    addComponent(outputPanel, 4, 0, 1, 1);
  }

 /************************************************************
 *                                                          *
 *  Method Name:  addComponent                              *
 *                                                          *
 *  Purpose:  adds a component to the gridBag layout        *
 *                                                          *
 ************************************************************/
  private void addComponent(Component component,
      int row, int column, int width, int height)
   {
      constraints.gridx = column; 
      constraints.gridy = row;
      constraints.gridwidth = width;
      constraints.gridheight = height;
      gridBagLayout.setConstraints(component, constraints); // set constraints
      add(component); // add component
   }

  
  
  
 /************************************************************
 *                                                          *
 *  Method Name:  actionPerformed                           *
 *                                                          *
 *  Purpose:  Handels the events from the clear             *
 *             and calculate buttons                        *
 *                                                          *
 ************************************************************/
  public void actionPerformed(ActionEvent event){
    // get action of buttons
    String action = event.getActionCommand();

    // if calculate button was pressed
    if (action.equals("Calculate")){
      // variables for calculating total bill and individual bill portions
      float totalOut, individualOut;
      String billStringOut = "$";
      String individualStringOut = "$";

      // get values from gui
      try {
        
        float tipVal = tipSlider.getValue();
        float bill = Float.parseFloat(billAmountInput.getText());
        if(bill <= 0){
          JOptionPane.showMessageDialog(null, "Bill amount must be greater than zero", "Invalid Bill", JOptionPane.PLAIN_MESSAGE);
        }
        else{
          int party = (Integer)partySpiner.getValue();

          // set tip to a percentage of total bill
          tipVal = tipVal/100;
          tipVal += 1;

          // find total bill and individual portion
          totalOut = bill * tipVal;
          float IndividualOut = totalOut / party;

          // format both for output
          billStringOut += String.format("%.2f", totalOut);
          individualStringOut += String.format("%.2f", IndividualOut);

          // output results
          totalOutLabel.setText(billStringOut);
          individualOutLabel.setText(individualStringOut);
        }
      }
      catch (NumberFormatException | NullPointerException nfe) {
        JOptionPane.showMessageDialog(null, "Bill amount must be numeric", "Invalid Bill", JOptionPane.PLAIN_MESSAGE);
      }

    }
    // if clear button was pressed reset all fields
    else if (action.equals("Clear")){
      billAmountInput.setText("");
      tipSlider.setValue(20);
      partySpiner.setValue(1);
      totalOutLabel.setText("$0.00");
      individualOutLabel.setText("$0.00");
    }
  }
} // Class Ends