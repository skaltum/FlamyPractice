import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два числа для сравнения.");
        double a = in.nextDouble();
        double b = in.nextDouble();
        in.close();
        if (a < b) {
            System.out.println("Число " + a + " меньше числа " + b);
        } else if (a > b) {
            System.out.println("Число " + a + " больше числа " + b);
        } else {
            System.out.println("Числа " + a + " и " + b + " равны.");
        }
    }
}
