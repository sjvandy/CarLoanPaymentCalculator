public class App {
    public static void main(String[] args) throws Exception {
        int carLoan = 10_000;
        int loanLength = 3;
        int interestRate = 5;
        int downPayment = 2000;
        if (loanLength <= 0 || interestRate <= 0) {
            System.out.println("Error! You must take out a valid car loan.");            
        } else if (downPayment >= carLoan) {
            System.out.println("You can purchase the car outright!");
        } else {
            int remainingBalace = carLoan - downPayment;
            int months = loanLength * 12;
            int monthlyBalace = remainingBalace / months;
            int interest = monthlyBalace * interestRate / 100;
            int monthlyPayment = monthlyBalace + interest;
            System.out.println("Your monthly payment will be $" + monthlyPayment + " a month.");
        }
    }
}
