import javax.swing.JFrame;
import java.awt.EventQueue;

// Class Begins
public class TipCalcApp
{
  public static void main(String[] args)
  {
    // Starting on event dispatch
    EventQueue.invokeLater(() ->
                           {
                            createAndShowGUI();
    });
  }
    private static void createAndShowGUI(){

      TipApp tipCalculatorApp = new TipApp();
      tipCalculatorApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      tipCalculatorApp.setSize(400,350);
      tipCalculatorApp.setVisible(true);
  }
} // Class Ends