package core;

import core.model.*;

public class PersonScoringCalculator {

    public int scoring(Person person) {


        int score = (int)(monthlyIncomeForFamilyMember(person) / 1000) * 100;

        score = score + person.getPersonalData().getEducation().getScore();
        score = score + person.getPersonalData().getMaritialStatus().getScore();

        return score;
    }

    public double creditRating(LoanAplication loanAplication){

        double creditRating =-1;
        LoanType loanType = loanAplication.getPurposeOfLoan().getLoanType();

        switch(loanType){
            case MORTGAGE:
                creditRating = Constants.MORTGAGE_LOAN_RATE * monthlyIncomeForFamilyMember(loanAplication.getPerson()) *
                        12 * loanAplication.getPurposeOfLoan().getPeriod();
                break;
            case PERSONAL_LOAN:
                creditRating = Constants.PERSONAL_LOAN_LOAN_RATE * monthlyIncomeForFamilyMember(loanAplication.getPerson()) *
                        12 * loanAplication.getPurposeOfLoan().getPeriod();
                break;
        }

        return creditRating;


    }

    private double monthlyIncomeForFamilyMember(Person person){
        double monthlyIncomeForFamilyMember = person.getPersonalData().getTotalMonthlyIncomeInPln()
                / person.getPersonalData().getNumOfFamilyDependants();
        return monthlyIncomeForFamilyMember;
    }

}
