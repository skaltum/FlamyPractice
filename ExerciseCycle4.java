import java.util.Scanner;
public class ExerciseCycle4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите сумму вклада: ");
        float sum= in.nextFloat();
        System.out.println("Введите срок вклада в месяцах: ");
        int months= in.nextInt();
        int i=1;
        while(i<=months){
            sum+=sum*0.07f;
            i++;
        }
        in.close();
        System.out.printf("После %d месяцев сумма вклада составит: %f", months, sum);
    }
}