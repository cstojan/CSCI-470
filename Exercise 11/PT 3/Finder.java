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
public class Finder implements Runnable
  {
    private String name;
    private Monitor monitor;
    
/************************************************************
 *                                                          *
 *  Method Name:  Finder                                    *
 *                                                          *
 *  Purpose:  constructor for the finder class              *
 *                                                          *
 ************************************************************/
    public Finder(Monitor monitor){
     this.monitor = monitor;
    }
    
/************************************************************
 *                                                          *
 *  Method Name:  setName                                   *
 *                                                          *
 *  Purpose:  sets the name variable                        *
 *                                                          *
 ************************************************************/
    public void setName(String name){
      this.name = name;
    }
    
/************************************************************
 *                                                          *
 *  Method Name:  getName                                   *
 *                                                          *
 *  Purpose:  gets the name variable                        *
 *                                                          *
 ************************************************************/
    public String getName(){
      return this.name;
    }
    
/************************************************************
 *                                                          *
 *  Method Name:  run                                       *
 *                                                          *
 *  Purpose:  places the class into a loop                  *
 *                                                          *
 ************************************************************/
    public void run(){
      monitor.run();
    }
  
  }