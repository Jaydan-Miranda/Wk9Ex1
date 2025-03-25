import java.util.Scanner;

 class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  //scanner to read input

        System.out.println("Interest Calculator Program");

        // Ask principal
        System.out.print("What is principal amount of the loan in dollars? ");
        double principal = scanner.nextDouble();

        // Ask interest rate
        System.out.print("What is interest rate (input 0.05 for 5%)? ");
        double rate = scanner.nextDouble();

        // Ask loan period in years
        System.out.print("What is period of loan in years? ");
        int time = scanner.nextInt();

        // Calculate interest
        double interest = principal * rate * time;

        // Display result
        System.out.println("Total interest of Loan: " + (int) interest + " dollars.");


    }
  }