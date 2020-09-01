package core;

import core.model.Person;
import core.model.PersonalData;

public class CreditApplicationService {

    public String getDecision(Person person){
        PersonScoringCalculator calculator = new PersonScoringCalculator();
        int score = calculator.calculate(person);
        if (score > 400){
            return "Congratulations, " + person.getPersonalData().getName() + " " + person.getPersonalData().getLastName()
                    + ", decision is positive";
        }else if (score >= 300){
            return "Sorry, " + person.getPersonalData().getName() + " " + person.getPersonalData().getLastName()
                    + ", bank requires additional documents. Our Consultant will contact you.";
        }else {
            return "Sorry, " + person.getPersonalData().getName() + " " + person.getPersonalData().getLastName()
                    + ", decision is negative";
        }

    }
}
