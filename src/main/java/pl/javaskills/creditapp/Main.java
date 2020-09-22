package pl.javaskills.creditapp;

import client.ConsoleReader;
import core.CreditApplicationService;
import core.model.LoanAplication;


public class Main {
    public static void main(String[] args) {

        ConsoleReader consoleReader = new ConsoleReader();
        LoanAplication loanAplication = consoleReader.readInputParameters();
        CreditApplicationService creditApplicationService = new CreditApplicationService();
        System.out.println(creditApplicationService.getDecision(loanAplication));




    }
}
