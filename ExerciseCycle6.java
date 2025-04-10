import java.util.Scanner;
public class ExerciseCycle6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        for( ; ; ){
            System.out.println("Введите первое число");
            int i = in.nextInt();
            System.out.println("Введите второе число");
            int j = in.nextInt();
            System.out.printf("Результат умножения введённых чисел: %d", i*j);
            System.out.println("\nДля завершения выполнения программы введите 1, для продолжения - любое другое число");
            int stop= in.nextInt();
            if(stop==1) break;
        }
        in.close();
    }
}
