public class cronometro{
  public static void main(String[] args) {
    Scanner job = new Scanner(System.in);

    int minutos =0;
         int segundo =0 ;

         for(minutos=0;minutos<60;minutos++){

         for (segundo=0;segundo<60;segundo++)
         {
        System.out.println(minutos+":"+segundo);
        delaySegundo();
      }
}
}

 private static void delaySegundo()
 {
         try{
           Thread.sleep(1000);
         }catch(InterruptedException e){}
         }
  }
