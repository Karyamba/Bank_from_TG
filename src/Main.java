import classes.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Bank bank1 = new Bank("bank1");

//        bank1.openHDB();
//        bank1.createCDB();
//        bank1.createEDB();
        System.out.println("В какой отдел вы хотите попасть? \n Нажмите \n 1 для бухгалтерии \n 2 для персонала \n 3 для директора \n 4 для кредита  \n 5 для доната");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String answer = reader.readLine();

        // System.out.println(answer);

//        Scanner answer = new Scanner(System.in);
//        String number = answer.nextLine();

        switch (answer) {
            case "1" -> {
                System.out.println("Вы попали в отдел бухгалтерии");
                {
                    System.out.println("Что вы хотите сделать\n попить чай - 1 \n или сыграть в пасьянс? - 2 \n");
                    BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
                    String answer1 = reader.readLine();
                    switch (answer1) {
                        case "1" -> System.out.println("Теперь вы попили чаек");
                        case "2" -> System.out.println("Я хз как вы выйграли или нет");
                    }
                }
            }
            case "2" -> {
                System.out.println("Вы попали в отдел персонала");
                System.out.println("Что вы хотите сделать\n устроиться на работу - 1 \n или уволиться? - 2 \n");
                BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
                String answer1 = reader.readLine();
                switch (answer1) {
                    case "1" -> System.out.println("Вы приняты на работу");
                    case "2" -> System.out.println("Вы уволены, спасибо за внимание ");
                }
            }
            case "3" -> {
                System.out.println("Вы попали к директору");
                System.out.println("Что вы хотите сделать\n пожаловаться на условия труда - 1 \n или уволиться? - 2 \n");
                BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
                String answer1 = reader.readLine();
                switch (answer1) {
                    case "1" -> System.out.println("Вы уволены");
                    case "2" -> System.out.println("Вы уволены");
                }
            }

            case "4" -> {
                System.out.println("Вы попали в кредитный отдел");
                System.out.println("Что вы хотите сделать\n взять кредит? - 1 \n или погасить кредит? - 2 \n");
                BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
                String answer1 = reader.readLine();
                switch (answer1) {
                    case "1" -> System.out.println("Вы взяли кредит на сумму " + "сумма");
                    case "2" -> System.out.println("Вы погасили кредит на сумму " + "сумма");
                }
            }

            case "5" -> {
                System.out.println("Вы попали отдел пожертвований");
                System.out.println("Сколько вы хотите пожертвовать?");
                Scanner answer1 = new Scanner(System.in);
                int number = answer1.nextInt();
                System.out.println("Вы задонатили " + number);

            }
        }




        }

    //    String currentName = "Elena";

     //   bank1.humans.stream().filter(it -> it.getFirstName().equals(currentName)).count();

     //   bank1.humans.stream().filter(it -> it.getFirstName().equals(currentName)).forEach(it -> System.out.println(it.toString()));

    }
