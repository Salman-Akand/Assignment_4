import java.util.Scanner;

public class NumberCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = scanner.nextInt();
        System.out.print("Enter second number: ");
        int second = scanner.nextInt();
        System.out.print("Enter third number: ");
        int third = scanner.nextInt();
        if(first == second && second == third){
            System.out.println("The three numbers are equals.");
        }
        else if(first != second && first !=third && second != third){
            System.out.println("The three numbers are different.");
        }
        else{
            System.out.println("Neither.");
        }
    }
}
