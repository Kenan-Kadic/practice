import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How old are you? ");
        String age = scanner.next();

        System.out.println(age);

    }
}
