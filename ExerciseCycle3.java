import java.util.Scanner;
public class ExerciseCycle3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите сумму вклада: ");
        float sum= in.nextFloat();
        System.out.println("Введите срок вклада в месяцах: ");
        int months= in.nextInt();
        for(int i=1; i<=months; i++){
            sum+=sum*0.07f;
        }
        in.close();
        System.out.printf("После %d месяцев сумма вклада составит: %f", months, sum);
    }
}
