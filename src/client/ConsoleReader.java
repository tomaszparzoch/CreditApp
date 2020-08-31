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
        System.out.println("Enter total monthly income in PLN:");
        double totalMonthlyIncomeInPln = sc.nextDouble();
        System.out.println("Are you married:");
        boolean married = sc.nextBoolean();
        System.out.println("Enter number of family dependants (including applicant):");
        int numOfFamilyDependants = sc.nextInt();

        sc.close();
        return new Person(name, lastName, mothersMaidenName, totalMonthlyIncomeInPln, married, numOfFamilyDependants);
    }

}
