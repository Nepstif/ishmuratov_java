import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {

        float number = 7;

        System.out.print("Enter your number: ");
        try (Scanner scanner = new Scanner(System.in)) {
            float myNums = scanner.nextFloat();
            scanner.close();
            if (myNums > number) {
                System.out.println("Привет");
            }
        }
    }
}
