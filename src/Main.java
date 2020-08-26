import client.ConsoleReader;
import core.Person;

public class Main {
    public static void main(String[] args) {

        ConsoleReader consoleReader = new ConsoleReader();
        Person person = consoleReader.readInputParameters();

        System.out.println("Hello, " + person.getName() + " " + person.getLastName() + "!");


    }
}
