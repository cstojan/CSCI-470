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
public class FindItThread extends Thread{
  private int number;
  private int begin;
  private int end;
  
 /************************************************************
 *                                                          *
 *  Method Name:  FindItThread                              *
 *                                                          *
 *  Purpose:  constructor for the FindItThread class        *
 *                                                          *
 ************************************************************/
  public FindItThread(int number, int begin, int end){
    this.number = number;
    this.begin = begin;
    this.end = end;
  }

/************************************************************
 *                                                          *
 *  Method Name:  run                                       *
 *                                                          *
 *  Purpose:  runs the thread                               *
 *                                                          *
 ************************************************************/
  public void run(){
    for(int i = this.begin; i <= this.end; i++){
      if(i == this.number){
        System.out.println("The Number " + this.number + " was found in " + this.getName());
        return;
      }
      if (i % 10 == 0)
        try{
        sleep(1);
      }
      catch(InterruptedException e){
        System.out.println(e);
      }
    }
  }
}