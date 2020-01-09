public class Main
{
  public static class FindItThread extends Thread{
    private int number;
    private int begin;
    private int end;
    
    public FindItThread(int number, int begin, int end){
     this.number = number;
     this.begin = begin;
     this.end = end;
    }
    
    public void run(){
      for(int i = this.begin; i <= this.end; i++){
        if(i == this.number){
          System.out.println("The Number " + this.number + " was found in " + this.getName());
          return;
        }
      }
    }
  }
    public static void main(String args[])
    {
      
      
        int target = (int) (Math.random() * 1000);
        System.out.println("The number is " + target);
        
        FindItThread thread0 = new FindItThread((int)target, 0, 249);
        thread0.setName("Thread-0");
        thread0.run();
        FindItThread thread1 = new FindItThread(target, 250, 499);
        thread1.setName("Thread-1");
        thread1.run();
        FindItThread thread2 = new FindItThread(target, 500, 749);
        thread2.setName("Thread-2");
        thread2.run();
        FindItThread thread3 = new FindItThread(target, 750, 999);
        thread3.setName("Thread-3");
        thread3.run();
    }
}
