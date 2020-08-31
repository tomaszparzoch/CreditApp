package core;

public class PersonScoringCalculator {

    public int calculate(Person person) {

        double monthlyIncomeForFamilyMember = person.getTotalMonthlyIncomeInPln() / person.getNumOfFamilyDependants();
        int score = (int)(monthlyIncomeForFamilyMember / 1000) * 100;
        if (person.isMarried())
            score += 100;

        return score;
    }

}
