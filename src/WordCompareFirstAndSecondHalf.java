import java.util.Scanner;

public class WordCompareFirstAndSecondHalf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scanner.nextLine();
        scanner.close();
        String firstHalf = word.substring(0, word.length()/2);
        String secondHalf;
        if(word.length() % 2 == 0){
            secondHalf = word.substring(word.length()/2,word.length());
        }
        else {
             secondHalf = word.substring(word.length() / 2 + 1, word.length());
        }
        if(firstHalf.equals(secondHalf)){
            System.out.println("First and second half are the same.");
        }
        else{
            System.out.println("First and second half are different.");
        }
    }
}
