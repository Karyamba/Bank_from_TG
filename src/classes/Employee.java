package classes;

public class Employee extends Human{

    private int salary;
    private String department;
    private int balance;
    private int accountID;

    public Employee(String firstName, String lastName, int age, int documentId, int salary, String department, int balance, int accountID) {
        super(firstName, lastName, age, documentId);
        this.salary = salary;
        this.department = department;
        this.balance = balance;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
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
}
