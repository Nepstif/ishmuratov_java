import java.util.Locale;
import java.util.Scanner;

public class NamePrint {
    public static void main(String[] args) {

        String name = "Вячеслав";

        System.out.print("Please enter the required name: ");
        try (Scanner scanner = new Scanner(System.in)) {
            String getName = scanner.nextLine();
            scanner.close();
            if (getName.equalsIgnoreCase(name)) {
                System.out.println("Привет , " + name);
            } else {
                System.out.println("Нет такого имени");
            }
        }
    }
}
