import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the car loan amount: ");
        int carLoan = scanner.nextInt();

        System.out.print("Enter the loan length in years: ");
        int loanLength = scanner.nextInt();

        System.out.print("Enter the interest rate: ");
        int interestRate = scanner.nextInt();

        System.out.print("Enter the down payment: ");
        int downPayment = scanner.nextInt();

        if (loanLength <= 0 || interestRate <= 0) {
            System.out.println("Error! You must take out a valid car loan.");            
        } else if (downPayment >= carLoan) {
            System.out.println("You can purchase the car outright!");
        } else {
            int remainingBalance = carLoan - downPayment;
            int months = loanLength * 12;
            int monthlyBalance = remainingBalance / months;
            int interest = monthlyBalance * interestRate / 100;
            int monthlyPayment = monthlyBalance + interest;
            System.out.println("Your monthly payment will be $" + monthlyPayment + " a month.");
        }

        scanner.close();
    }
}