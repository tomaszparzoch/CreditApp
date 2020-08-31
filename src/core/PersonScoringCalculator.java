package core;

import core.model.Education;
import core.model.MaritialStatus;
import core.model.Person;
import core.model.PersonalData;

public class PersonScoringCalculator {

    public int calculate(Person person) {

        double monthlyIncomeForFamilyMember = person.getPersonalData().getTotalMonthlyIncomeInPln()
                / person.getPersonalData().getNumOfFamilyDependants();
        int score = (int)(monthlyIncomeForFamilyMember / 1000) * 100;

        score = score + person.getPersonalData().getEducation().getScore();
        score = score + person.getPersonalData().getMaritialStatus().getScore();

        return score;
    }

}
