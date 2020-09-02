package client;

import core.model.*;

import java.util.Scanner;

public class ConsoleReader {

    public LoanAplication readInputParameters(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.next();
        System.out.println("Enter your last name:");
        String lastName = sc.next();
        System.out.println("Enter your mother's maiden name:");
        String mothersMaidenName = sc.next();
        System.out.println("What is your marital status? (SINGLE, MARRIED, DIVORCED, WIDOWED, SEPARATED):");
        MaritialStatus maritialStatus = MaritialStatus.valueOf(sc.next());
        System.out.println("What is your education level? (NONE, PRIMARY, MIDDLE, SECONDARY, POST_SECONDARY, TERTIARY):");
        Education education = Education.valueOf(sc.next());
        System.out.println("Enter your email address:");
        String email = sc.next();
        System.out.println("Enter your phone number:");
        String phoneNumber = sc.next();
        System.out.println("Enter total monthly income in PLN:");
        double totalMonthlyIncomeInPln = sc.nextDouble();
        System.out.println("Enter number of family dependants (including applicant):");
        int numOfFamilyDependants = sc.nextInt();
        System.out.println("What is purpose of loan? (MORTGAGE, PERSONAL_LOAN):");
        LoanType loanType = LoanType.valueOf(sc.next());
        System.out.println("Enter loan amount:");
        double amount = sc.nextDouble();
        System.out.println("Enter loan period (in years):");
        byte period = sc.nextByte();


        PersonalData personalData = new PersonalData(name, lastName, mothersMaidenName, totalMonthlyIncomeInPln,
                maritialStatus, education, numOfFamilyDependants);
        ContactData contactData = new ContactData(email, phoneNumber);
        PurposeOfLoan purposeOfLoan = new PurposeOfLoan(loanType, amount, period);
        Person person = new Person(personalData, contactData);

        sc.close();
        return new LoanAplication(person, purposeOfLoan);
    }

}
