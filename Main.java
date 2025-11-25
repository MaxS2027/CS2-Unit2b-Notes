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

         //use loop to iterate through character in project
         //

         String name = "max";
         int finalIndex = name.length();
         System.out.println("Final index" + finalIndex);

         for(int i = finalIndex; i>=0; i--){
            System.out.println("Current index " + i);
            String currentLetter = name.substring(i, i+1)
            System.out.println("Current letter: " + currentLetter)
            string reverse = "vvnkl";
            System.out.println("Name backwards" + reverse)
         }
      }
   }
}
