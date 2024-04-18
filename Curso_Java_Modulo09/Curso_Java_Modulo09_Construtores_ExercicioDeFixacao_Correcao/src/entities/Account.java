package entities;

public class Account {

    private int number;
    private String clientName;
    private double clientBalance;

    public Account(int number, String clientName) {
        this.number = number;
        this.clientName = clientName;
    }

    public Account(int number, String clientName, double initialDeposit) {
        this.number = number;
        this.clientName = clientName;
        deposit(initialDeposit);
    }


    //O Numero da conta nao pode ser alterado
    // entao apagamos o metodo SET
    public int getNumber() {
        return number;
    }


    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    //O SALDO da conta SÓ pode ser alterado
    // por meio do saque e do deposito e nao pele metodo SET
    public double getClientBalance() {
        return clientBalance;
    }


    public void deposit(double amount) {
        clientBalance += amount;
    }

    public void withdraw(double amount) {
        double tax = 5;
        clientBalance -= amount + tax;
    }

    public String toString() {
        return "Account " + number
                + ", Holder: " + clientName
                + ", Balance: $ " + String.format("%.2f", this.clientBalance);
    }
}