/************************************************************
 *                                                          *
 *  CSCI 470-2/502-2  In Class Example 10       Summer 2019 *
 *                                                          *
 *  Class Name:  NumGuessGameFrameTest                      *
 *                                                          *
 *  Programmer:  Cory Stojan                                *
 *               Z1804761                                   *
 *                                                          *
 *  Purpose:     Test the Guessing game GUI                 *
 ************************************************************/
import javax.swing.JFrame;
import java.awt.EventQueue;

public class NumGuessGameFrameTest
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

      NumGuessGameFrame guessGame = new NumGuessGameFrame();
      guessGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      guessGame.setSize(650,200);
      guessGame.setVisible(true);
  }
}