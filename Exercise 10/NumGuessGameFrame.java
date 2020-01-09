/************************************************************
 *                                                          *
 *  CSCI 470-2/502-2  In Class Example 10       Summer 2019 *
 *                                                          *
 *  Class Name:  NumGuessGameFrame                          *
 *                                                          *
 *  Programmer:  Cory Stojan                                *
 *               Z1804761                                   *
 *                                                          *
 *  Purpose:     Framework for the guessing game GUI        *
 *                 note: does not verify data               *        
 ************************************************************/
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridBagConstraints;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;
import java.awt.Color;

public class NumGuessGameFrame extends JFrame implements ActionListener
{
  // grid
  private final GridBagLayout gridBagLayout;
  private final GridBagConstraints constraints;
  // labels, buttons, text
  private final JLabel numDisplayQuestionLabel;
  private final JLabel numEnteredLabel;
  private final JTextField numEnteredTextField;
  private final JLabel numDisplayResultLabel;
  private final JButton newNumButton;
  private final JButton guessButton;
  // result
  private final JLabel resultOfGuess;

  //private final ActionListener action;
  Random rand = new Random();
    int numberToGuess = rand.nextInt(999); 

  // create the frame
  public NumGuessGameFrame()
  {
    super("Number Guessing Game");
    // ensure number to be guessed is between 1 and 1000
    numberToGuess += 1;

    // instattiate layouts and set layout
    gridBagLayout = new GridBagLayout();
    constraints = new GridBagConstraints(); // instantiate constraints
    setLayout(gridBagLayout);

    // instantiate components
    numDisplayQuestionLabel = new JLabel("I have a number between 1 and 1000.  Can you guess my number?");
    numEnteredLabel = new JLabel("Please enter your first guess: ");
    numEnteredTextField = new JTextField(4);
    numDisplayResultLabel = new JLabel();
    newNumButton = new JButton("New Number");
    guessButton = new JButton("Guess");
    resultOfGuess = new JLabel("");

    // fill the frame with its components
    constraints.fill = GridBagConstraints.HORIZONTAL;
    
    constraints.ipadx = 25;
    addComponent(numDisplayQuestionLabel, 0, 0, 1, 1);
    addComponent(numEnteredLabel, 1, 0, 1, 1);
    addComponent(numEnteredTextField, 1, 1, 1, 1);
    numEnteredTextField.setText("0");
    addComponent(guessButton, 1, 2, 1, 1);

    addComponent(numDisplayResultLabel, 2, 0 , 1, 1);
    addComponent(newNumButton, 3, 2, 1, 1);
    
    addComponent(resultOfGuess, 4, 0, 1, 1);

    // add listenters
    guessButton.addActionListener(this);
    newNumButton.addActionListener(this);
  }
  // method used when adding gridbags
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

  // event handeling
  public void actionPerformed(ActionEvent event){
   // get action of buttons
    String action = event.getActionCommand();

    // if it is new number
    if (action.equals("New Number")) {
      System.out.println("New Number Pressed");

      // reset fields
      numEnteredTextField.setEditable(true);
      resultOfGuess.setText("");
      numEnteredTextField.setText("0");
      numberToGuess = rand.nextInt(999); 
      numberToGuess += 1;

      // Displays in counsole the numbers
      int num = 0;
      int comp = 0;
      num = Integer.parseInt(numEnteredTextField.getText());
      comp = numberToGuess;
      // display number in console for ease of testing
      System.out.println("Guessed Number: " + num + " Actual Number: " + comp);
    }
    // if button pressed is guess button
    else if (action.equals("Guess")){
      System.out.println("Guess Button Pressed");
      // compare numbers (random number and guessed number)
      int num = 0;
      int comp = 0;
      num = Integer.parseInt(numEnteredTextField.getText());
      comp = numberToGuess;
      // if lower
      if(comp - num > 0){
        resultOfGuess.setText("Your Guess Is Lower Than The Number!");
        resultOfGuess.setForeground(Color.blue);
      }
      // if greater
      else if(comp - num < 0){
        resultOfGuess.setText("Your Guess Is Greater Than The Number!");
        resultOfGuess.setForeground(Color.red);
      }
      // if you guess the number
      else{
        resultOfGuess.setText("You Guessed The Number!");
        resultOfGuess.setForeground(Color.green);
        numEnteredTextField.setEditable(false);
      }

      // Displays in counsole the numbers for ease in testing
      System.out.println("Guessed Number: " + num + " Actual Number: " + comp);

    }
  }
}