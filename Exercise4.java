import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        double a = in.nextDouble();
        System.out.println("Введите второе число");
        double b = in.nextDouble();
        System.out.println("Введите номер операции: \n1.Сложение \n2.Вычитание \n3.Умножение");
        byte num = in.nextByte();
        in.close();
        double c=0;
        switch(num){
            case 1:
                System.out.println("Сложение");
                c = a+b;
                break;
                case 2:
            System.out.println("Вычитание");
            c = a-b;
            break;
            case 3:
                System.out.println("Умножение");
                c = a*b;
                break;
            default:
                System.out.println("Операция неопределена");
                return;
        }
        String d = String.format("%.2f",c);
        System.out.println("Результат операции: " + d);
    }
}
