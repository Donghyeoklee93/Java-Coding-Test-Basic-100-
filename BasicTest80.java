import java.util.Scanner;

public class BasicTest80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(16);

        for (int i = 1; i < 16; i++) {
            System.out.printf("%X*%X=%X\n", number, i, (number * i));
        }
    }
}