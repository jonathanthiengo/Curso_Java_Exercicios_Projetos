package entities;

public class Client {

    private int accountNumber;
    public String clientName;
    private double amount;

    public Client(String clientName) {
        this.clientName = clientName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public double getAmount() {
        return amount;
    }

    public double setAmount(double amount) {
        this.amount = amount;
        return amount;
    }

    public double Deposit(double amount) {
        double clientAmount = getAmount();
        return this.setAmount(clientAmount + amount);
    }

    public double withdraw(double amount) {
        double tax = 5;
        double clientAmount = getAmount() - tax;
        return this.setAmount(clientAmount - amount);
    }

    public String toString() {
        return "Account " + accountNumber
                + ", Holder: " + clientName
                + ", Balance: " + String.format("%.2f", this.amount);
    }
}