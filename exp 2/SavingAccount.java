
public class SavingAccount {
    public static double annualInterestRate;
    private double savingsBalance;

    public SavingAccount() {
        annualInterestRate = 0.0;
        savingsBalance = 0.0;
    }

    public SavingAccount(double intRate, double savBal) {
        annualInterestRate = intRate;
        savingsBalance = savBal;
    }

    public double calculateMonthlyInterest() {
        double intRate = (savingsBalance * annualInterestRate / 12);
        savingsBalance = savingsBalance + intRate;
        return intRate;
    }

    public static void modifyInterestRate(double newInteresRate) {
        annualInterestRate = newInteresRate;
    }

    public void setSavingsBalance(double newBal) {
        savingsBalance = newBal;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
}
