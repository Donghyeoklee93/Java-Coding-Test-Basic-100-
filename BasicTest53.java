import java.util.Scanner;

public class BasicTest53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        if (number1 == 1 || number2 == 1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}