import java.util.Scanner;

class Month {
    private int monthNumber;

    public Month(int monthNumber) {
        this.monthNumber = monthNumber;
    }

    public int getLength() {
        int daysInMonth = 0;

        // Check for February
        if (monthNumber == 2) {
            daysInMonth = 28;
        }
        // Check for months with 30 days
        else if (monthNumber == 4 || monthNumber == 6 || monthNumber == 9 || monthNumber == 11) {
            daysInMonth = 30;
        }
        // Default to months with 31 days
        else {
            daysInMonth = 31;
        }

        return daysInMonth;
    }
}

public class MonthDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a month (1 for January, 2 for February, etc.): ");
        int monthNumber = scanner.nextInt();

        Month month = new Month(monthNumber);
        int daysInMonth = month.getLength();

        System.out.println(daysInMonth + " days");

        scanner.close();
    }
}