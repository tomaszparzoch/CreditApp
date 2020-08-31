package core;

import core.model.Person;
import core.model.PersonalData;

public class CreditApplicationService {

    public String getDecision(Person person){
        PersonScoringCalculator calculator = new PersonScoringCalculator();
        int score = calculator.calculate(person);
        return score >= 300?
                "Congratulations, " + person.getPersonalData().getName() + " " + person.getPersonalData().getLastName()
                        + ", decision is positive" :
                "Sorry, " + person.getPersonalData().getName() + " " + person.getPersonalData().getLastName()
                        + ", decision is negative";

    }
}
