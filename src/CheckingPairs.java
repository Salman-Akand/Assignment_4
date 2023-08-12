import java.util.Scanner;

public class CheckingPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter four integer numbers: ");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        int fourth = scanner.nextInt();
        int count = 0;
        if(first == second || first == third || first == fourth){
            count = count + 1;
        }
        if(second == third || second == fourth){
            count = count + 1;
        }
        if(third == fourth){
            count = count + 1;
        }
        if(count >= 2){
            System.out.println("Two pairs.");
        }
        else{
            System.out.println("Not two pairs.");
        }
    }
}
