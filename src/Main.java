import client.ConsoleReader;
import core.CreditApplicationService;
import core.model.Person;


public class Main {
    public static void main(String[] args) {

        ConsoleReader consoleReader = new ConsoleReader();
        Person person = consoleReader.readInputParameters();
        CreditApplicationService creditApplicationService = new CreditApplicationService();
        System.out.println(creditApplicationService.getDecision(person));




    }
}
