package pl.javaskills.creditapp;

import pl.javaskills.creditapp.client.ConsoleReader;
import pl.javaskills.creditapp.core.CreditApplicationService;
import pl.javaskills.creditapp.core.model.LoanAplication;


public class Main {
    public static void main(String[] args) {

        ConsoleReader consoleReader = new ConsoleReader();
        LoanAplication loanAplication = consoleReader.readInputParameters();
        CreditApplicationService creditApplicationService = new CreditApplicationService();
        System.out.println(creditApplicationService.getDecision(loanAplication));




    }
}
