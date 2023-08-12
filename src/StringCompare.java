import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String string = scanner.nextLine();
        char firstChar = string.charAt(0);
        char lastChar = string.charAt(string.length() - 1);
        if(firstChar == lastChar){
            System.out.println("First and Last letter are the same.");
        }
        else{
            System.out.println("First and Last letter are the different.");
        }
    }
}
