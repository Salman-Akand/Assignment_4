import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        if(number == 0){
            System.out.println("The number is Zero.");
        }
        else if(number > 0){
            System.out.println("The number is Positive.");
        }
        else{
            System.out.println("The number is Negative.");
        }
    }

}
