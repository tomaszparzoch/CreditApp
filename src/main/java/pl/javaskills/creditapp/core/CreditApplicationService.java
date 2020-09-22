package pl.javaskills.creditapp.core;

import pl.javaskills.creditapp.core.model.LoanAplication;

public class CreditApplicationService {

    public String getDecision(LoanAplication loanAplication){
        PersonScoringCalculator personScoringCalculator = new PersonScoringCalculator();
        int scoring = personScoringCalculator.scoring(loanAplication.getPerson());
        double creditRating = personScoringCalculator.creditRating(loanAplication);
        String decision = null;

        int scenario = -1;

        if (scoring < 300){
            scenario = 1;
        }else if( scoring <= 300 && scoring <=400){
            scenario = 2;
        }else if ( scoring > 400 && creditRating >= loanAplication.getPurposeOfLoan().getAmount() ) {
            scenario = 3;
        }else if ( scoring > 400 && creditRating < loanAplication.getPurposeOfLoan().getAmount() ){
            scenario = 4;
        }

        switch (scenario){
            case 1:
                decision = "Sorry, " + loanAplication.getPerson().getPersonalData().getName() + " " +
                        loanAplication.getPerson().getPersonalData().getLastName()
                        + ", decision is negative";
                break;
            case 2:
                decision = "Sorry, " + loanAplication.getPerson().getPersonalData().getName() + " " +
                        loanAplication.getPerson().getPersonalData().getLastName()
                        + ", bank requires additional documents. Our Consultant will contact you.";
                break;
            case 3:
                decision = "Congratulations, " + loanAplication.getPerson().getPersonalData().getName() + " " +
                        loanAplication.getPerson().getPersonalData().getLastName()
                        + ", decision is positive";
                break;
            case 4:
                decision = "Sorry, " + loanAplication.getPerson().getPersonalData().getName() + " " +
                        loanAplication.getPerson().getPersonalData().getLastName()
                        + ", decision is negative. Bank can borrow only " + creditRating;
                break;
        }


        return decision;

    }
}
