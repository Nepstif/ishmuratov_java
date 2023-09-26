import java.util.Scanner;

public class Three {
    public static void main(String[] args) {

        System.out.print("Please enter the number of digits ");
        try (Scanner scanner = new Scanner(System.in)) {

            int length = scanner.nextInt();
            int[] numsArray = new int[length];

            System.out.println("Please enter numbers: ");
            for (int i = 0; i < length; i++) {
                numsArray[i] = scanner.nextInt();
            }
            scanner.close();

            for (int i = 0; i < length; i++) {
                if (numsArray[i] % 3 == 0) {
                    System.out.print(numsArray[i]+ " ");
                }
            }
        }
    }
}
