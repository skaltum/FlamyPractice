import java.util.Scanner;
public class PracticeIn {
   public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       System.out.print("Введи своё имя \n");
       String name = in.nextLine();
       System.out.print("Введи свой рост \n");
       int height = in.nextInt();
       System.out.print("Введи размер своего члена \n");
       float dicksize = in.nextFloat();
       System.out.printf("Твоё имя: %s Твой рост: %d " +
               "Зачем ты всем рассказываешь размер своего члена? " +
               "Тем более, что его размер всего лишь: %.2f",name, height, dicksize);
       in.close();
   }
}
