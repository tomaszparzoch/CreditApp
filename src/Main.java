import client.ConsoleReader;
import core.CreditApplicationService;
import core.Person;

public class Main {
    public static void main(String[] args) {

        ConsoleReader consoleReader = new ConsoleReader();
        Person person = consoleReader.readInputParameters();
        CreditApplicationService creditApplicationService = new CreditApplicationService();
        System.out.println(creditApplicationService.getDecision(person));

        System.out.println("Hello, " + person.getName() + " " + person.getLastName() + "!");


    }
}
