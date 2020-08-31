package core;

public class CreditApplicationService {

    public String getDecision(Person person){
        PersonScoringCalculator calculator = new PersonScoringCalculator();
        int score = calculator.calculate(person);
        return score >= 300?
                "Congratulations, " + person.getName() + " " + person.getLastName() + ", decision is positive" :
                "Sorry, " + person.getName() + " " + person.getLastName() + ", decision is negative";

    }
}
