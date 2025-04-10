import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число.");
        int a = in.nextInt();
        in.close();
        if (a > 2 && a < 9) {
            System.out.println("Число " + a + " больше 2 и меньше 9");
        } else {
            System.out.println("Неизвестное число");
        }
    }
}
