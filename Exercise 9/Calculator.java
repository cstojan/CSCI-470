/************************************************************
 *                                                          *
 *  CSCI 470-2/502-2  In Class Example 9       Summer 2019  *
 *                                                          *
 *  Class Name:  Calculator                                 *
 *                                                          *
 *  Programmer:  Cory Stojan                                *
 *               Z1804761                                   *
 *                                                          *
 *  Purpose:     Calculator GUI                             *
 ************************************************************/
import javax.swing.JFrame;
import java.awt.EventQueue;

public class Calculator
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
      
    
    CalculatorFrame calculatorFrame = new CalculatorFrame();
    calculatorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    calculatorFrame.setSize(300,300);
    calculatorFrame.setVisible(true);
  }
}