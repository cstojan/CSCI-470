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
public class Main
{
  /************************************************************
 *                                                          *
 *  Method Name:  main                                      *
 *                                                          *
 *  Purpose:  man run class                                 *
 *                                                          *
 ************************************************************/
    public static void main(String args[])
    {
        int target = (int) (Math.random() * 1000);
        System.out.println("The number is " + target);
        
        Monitor monitor = new Monitor();
    
        
        FindItThread thread0 = new FindItThread(target, 0, 249);
        thread0.setName("Thread-0");
        monitor.addThread(thread0);
        
        FindItThread thread1 = new FindItThread(target, 250, 499);
        thread1.setName("Thread-1");
        monitor.addThread(thread1);
       
        FindItThread thread2 = new FindItThread(target, 500, 749);
        thread2.setName("Thread-2");
        monitor.addThread(thread2);
      
        FindItThread thread3 = new FindItThread(target, 750, 999);
        thread3.setName("Thread-3");
        monitor.addThread(thread3);
        
        Finder find0 = new Finder(monitor);
        find0.setName("Find-0");
        find0.run();

     
    }
}
