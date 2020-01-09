/************************************************************
 *                                                          *
 *  CSCI 470-2/502-2  In Class Example 9       Summer 2019  *
 *                                                          *
 *  Class Name:  Alligntest                                 *
 *                                                          *
 *  Programmer:  Cory Stojan                                *
 *               Z1804761                                   *
 *                                                          *
 *  Purpose:     Allignment GUI                             *
 ************************************************************/
import javax.swing.JFrame;
import java.awt.EventQueue;

public class Alligntest
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
      
    
    AllignFrame allignFrame = new AllignFrame();
    allignFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    allignFrame.setSize(500,300);
    allignFrame.setVisible(true);
  }
}