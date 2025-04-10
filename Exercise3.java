import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите сумму вклада.");
        float num = in.nextFloat();
        in.close();
        if(num<0){
            System.out.println("Некорректная сумма вклада.");
            return;
        }
        else if(num<100){
            num = (float) (num + num*0.05);
        } else if(num>=100 && num<=200){
            num = (float) (num + num*0.07);
        } else {
            num = (float) (num + num*0.1);
        }
        System.out.println("Ваш баланс составляет " + num);
        }
    }
