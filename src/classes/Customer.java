package classes;

public class Customer extends Human{

    private int balance;
    private int accountID;

    public Customer(String firstName, String lastName, int age, int documentId, int balance, int accountID) {
        super(firstName, lastName, age, documentId);
        this.balance = balance;
        this.accountID = accountID;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    @Override
    public String toString() {
        return "Document: \n" +
                "First name:  " + firstName + '\n' +
                "Last name:   " + lastName + '\n' +
                "Age:         " + age + '\n' +
                "Document Id: " + documentId + '\n' +
                "Account information:" + '\n' +
                "Id:          " + accountID + '\n' +
                "Balance:     " + balance;

    }
}
