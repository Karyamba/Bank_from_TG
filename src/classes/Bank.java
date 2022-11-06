package classes;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import enums.FirstNames;
import enums.LastName;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class Bank {
    String name;
    private int balance;

    public Human human = new Human("","",0, 0);
    public Collection<Human> humans = new ArrayList<>();


    public Customer customer = new Customer("","",0,0,0,0);
    public Collection<Customer> customers = new ArrayList<>();

    public Employee employee = new Employee("","",0,0,0,"",0,0);
    public Collection<Employee> employees = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void setBalance(float balance) {
        this.balance = (int) balance;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }




    public String createHDB() {

        Random random = new Random();
        Gson gson = new Gson();

        String fileHumans = "Humans.json";

        for (int i = 0; i < 100; i++) {
            human.setAge(random.nextInt(60) + 18);
            human.setFirstName(FirstNames.values()[(int) random.nextInt(10)].toString());
            human.setLastName(LastName.values()[(int) random.nextInt(10)].toString());
            human.setDocumentId(i);
            humans.add(new Human(human.getFirstName(), human.getLastName(), human.getAge(), human.getDocumentId()));

        }

        String sHuman = gson.toJson(humans);

        FileOutputStream fOut;

        {

            try {

                fOut = new FileOutputStream(fileHumans);

                OutputStreamWriter myOutWriter =new OutputStreamWriter(fOut);

                myOutWriter.append(sHuman);

                myOutWriter.close();

                fOut.close();

            } catch (IOException e) {

                e.printStackTrace();

            }

        }

        return "Operation successfully!";

    }

    public void openHDB() {

        Gson gson = new Gson();

        String fileHumans = "Humans.json";

        try{

        FileInputStream fIn = new FileInputStream(fileHumans);
        BufferedReader myReader = new BufferedReader(new InputStreamReader(fIn));
        String aDataRow = "";
        String aBuffer = "";

        while ((aDataRow = myReader.readLine()) != null){
            aBuffer += aDataRow ;
        }

        myReader.close();
        Type token = new TypeToken<Collection<Human>>() {}.getType();
        humans = gson.fromJson(aBuffer, token);

        } catch (IOException e){
            e.printStackTrace();
        }

        System.out.println("Operation: Open DBHumans successfully!");

    }

    public String createCDB() {

        Random random = new Random();
        Gson gson = new Gson();

        String fileCustomers = "Customers.json";

        for (int i = 0; i < 100; i++) {
            customer.setAge(random.nextInt(60) + 18);
            customer.setFirstName(FirstNames.values()[(int) random.nextInt(10)].toString());
            customer.setLastName(LastName.values()[(int) random.nextInt(10)].toString());
            customer.setDocumentId(i);
            customers.add(new Customer(customer.getFirstName(), customer.getLastName(), customer.getAge(), customer.getDocumentId(), customer.getBalance(),customer.getAccountID()));

        }

        String sCustomer = gson.toJson(customers);

        FileOutputStream fOut;

        {

            try {

                fOut = new FileOutputStream(fileCustomers);

                OutputStreamWriter myOutWriter =new OutputStreamWriter(fOut);

                myOutWriter.append(sCustomer);

                myOutWriter.close();

                fOut.close();

            } catch (IOException e) {

                e.printStackTrace();

            }

        }

        return "Operation successfully!";

    }
    public void openCDB() {

        Gson gson = new Gson();

        String fileCustomers = "Customers.json";

        try{

            FileInputStream fIn = new FileInputStream(fileCustomers);
            BufferedReader myReader = new BufferedReader(new InputStreamReader(fIn));
            String aDataRow = "";
            String aBuffer = "";

            while ((aDataRow = myReader.readLine()) != null){
                aBuffer += aDataRow ;
            }

            myReader.close();
            Type token = new TypeToken<Collection<Human>>() {}.getType();
            customers = gson.fromJson(aBuffer, token);

        } catch (IOException e){
            e.printStackTrace();
        }

        System.out.println("Operation: Open DBHumans successfully!");

    }
    public String createEDB() {

        Random random = new Random();
        Gson gson = new Gson();

        String fileEmployees = "Employees.json";

        for (int i = 0; i < 100; i++) {
            employee.setAge(random.nextInt(60) + 18);
            employee.setFirstName(FirstNames.values()[(int) random.nextInt(10)].toString());
            employee.setLastName(LastName.values()[(int) random.nextInt(10)].toString());
            employee.setDocumentId(i);
            employees.add(new Employee(employee.getFirstName(), employee.getLastName(), employee.getAge(), employee.getDocumentId(), 0, "", employee.getBalance(), employee.getAccountID()));

        }

        String sEmployee = gson.toJson(employees);

        FileOutputStream fOut;

        {

            try {

                fOut = new FileOutputStream(fileEmployees);

                OutputStreamWriter myOutWriter = new OutputStreamWriter(fOut);

                myOutWriter.append(sEmployee);

                myOutWriter.close();

                fOut.close();

            } catch (IOException e) {

                e.printStackTrace();

            }

        }

        return "Operation successfully!";
    }
}
