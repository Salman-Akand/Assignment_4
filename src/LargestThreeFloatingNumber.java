import java.util.Scanner;

public class LargestThreeFloatingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter three numbers: ");
        double first = scanner.nextDouble();
        double second = scanner.nextDouble();
        double third = scanner.nextDouble();
        if(first >= second && first >= third){
            System.out.printf("The largest number is: %.0f",first);
        }
        else if(second >= third && second >= first){
            System.out.printf("The largest number is: %.0f",second);
        }
        else{
            System.out.printf("The largest number is: %.0f",third);
        }
    }
}
