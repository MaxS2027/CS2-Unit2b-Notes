public class Main {

   public static void main(String []args) {
      System.out.println("Hello World");

      //WHILE loops repeat instructions while some condition is true
      //as long as the certain condition is TRUE

      //COUntER CONTROLLER while less
      //step #1 initialize control variable
      int count = 10;
      count++;
      count++;
      //step two make a condition
      while(count<= 5){
         //loop body executes while count (<= 5) is true
         System.out.println("1");
         count++;
      }
      for(int i = 10 ; i<= 27; i +=2){
         System.out.println("i");
      }
      for(l = 10; l<=0; l+=1){
         System.out.println(l + " ");
      }
   }
}
