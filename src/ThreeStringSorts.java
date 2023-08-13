import java.util.Arrays;
import java.util.Scanner;

public class ThreeStringSorts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter first string: ");
        String first = scanner.nextLine();
        System.out.print("Please enter second string: ");
        String second = scanner.nextLine();
        System.out.print("Please enter third string: ");
        String third = scanner.nextLine();

        scanner.close();

        String[] strings = {first, second, third};
        Arrays.sort(strings);

        System.out.println("The sorted strings are: ");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
