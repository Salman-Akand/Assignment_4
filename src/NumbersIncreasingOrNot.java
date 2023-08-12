import java.util.Scanner;

public class NumbersIncreasingOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        if(first < second && second < third){
            System.out.println("The three numbers are Increasing.");
        }
        else if(first > second && second > third){
            System.out.println("The three numbers are Decreasing.");
        }
        else{
            System.out.println("Neither.");
        }
    }
}
