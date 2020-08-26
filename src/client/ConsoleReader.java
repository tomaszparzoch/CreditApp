package client;

import core.Person;

import java.util.Scanner;

public class ConsoleReader {

    public Person readInputParameters(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.next();
        System.out.println("Enter your last name:");
        String lastName = sc.next();
        System.out.println("Enter your mother's maiden name:");
        String mothersMaidenName = sc.next();

        sc.close();
        return new Person(name, lastName, mothersMaidenName);
    }

}
