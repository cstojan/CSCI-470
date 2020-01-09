/************************************************************
 *                                                          *
 *  CSCI 470-2/502-2  In Class Example 11       Summer 2019 *
 *                                                          *
 *  Class Name:  NumGuessGameFrame                          *
 *                                                          *
 *  Programmer:  Cory Stojan                                *
 *               Z1804761                                   *
 *                                                          *
 *  Purpose:     Framework for the guessing game GUI        *
 *                 note: does not verify data               *
 ************************************************************/
import java.util.ArrayList;

public class Monitor extends Thread
{
  private boolean found;
  private ArrayList<Thread> arrayThread = new ArrayList<Thread>();
  
  /************************************************************
 *                                                          *
 *  Method Name:  Monitor                                   *
 *                                                          *
 *  Purpose:  constructor for the monitor calss             *
 *                                                          *
 ************************************************************/
  public Monitor(){
    this.found = false;
  }
  
  /************************************************************
 *                                                          *
 *  Method Name:  addThread                                 *
 *                                                          *
 *  Purpose:  adds a thread to the thread array list        *
 *                                                          *
 ************************************************************/
  public void addThread(Thread thread){
    this.arrayThread.add(thread);
  }
  
  /************************************************************
 *                                                          *
 *  Method Name:  foundNumber                               *
 *                                                          *
 *  Purpose:  intrrupts each thread in the array and sets   *
 *              found to true                               *
 *                                                          *
 ************************************************************/
  public synchronized void foundNumber(){
    
    for (Thread thread: arrayThread){
      thread.interrupt();
      this.found = true;
    }
  }
  
  /************************************************************
 *                                                          *
 *  Method Name:  run                                       *
 *                                                          *
 *  Purpose:  runs the class thread                         *
 *                                                          *
 ************************************************************/
  public void run(){
  
    while(this.found == false){
     
    }
   
  }
}