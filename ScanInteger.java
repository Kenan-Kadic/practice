import java.util.Scanner;

public class ScanInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your favorite number? ");
        int integer = scanner.nextInt();

        System.out.println(integer);
    }
}
