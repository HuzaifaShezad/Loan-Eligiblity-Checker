import java.util.*;

public class LoanEligibilityChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Loan Eligibility Checker ---");

        System.out.print("Enter your monthly income (Rs): ");
        double income = sc.nextDouble();

        System.out.print("Enter your monthly expenses (Rs): ");
        double expenses = sc.nextDouble();

        System.out.print("Enter desired loan amount (Rs): ");
        double loanAmount = sc.nextDouble();

        System.out.print("Enter loan duration (years): ");
        int years = sc.nextInt();

        double interestRate = 0.12; // 12% annual interest
        int months = years * 12;
        double monthlyInterestRate = interestRate / 12;
        double emi = (loanAmount * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, months)) /
                     (Math.pow(1 + monthlyInterestRate, months) - 1);

        System.out.printf("\nEstimated EMI: Rs. %.2f\n", emi);

        double savings = income - expenses;
        if (savings >= emi) {
            System.out.println(" You are eligible for the loan.");
        } else {
            System.out.println(" You are not eligible for the loan.");
        }
    }
}