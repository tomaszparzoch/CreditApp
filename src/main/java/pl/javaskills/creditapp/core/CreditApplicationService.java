package pl.javaskills.creditapp.core;

import pl.javaskills.creditapp.core.model.*;

public class CreditApplicationService {

    public String getDecision(LoanAplication loanAplication){
        PersonScoringCalculator personScoringCalculator = new PersonScoringCalculator();
        CreditApplicationDecision creditApplicationDecision = new CreditApplicationDecision();
        int scoring = personScoringCalculator.scoring(loanAplication.getPerson());
        double creditRating = personScoringCalculator.creditRating(loanAplication);


        DecisionType decisionType = null;

        if (scoring < 300){
            decisionType = DecisionType.NEGATIVE_SCORING;
        }else if( scoring >= 300 && scoring <=400){
            decisionType = DecisionType.CONTACT_REQUIRED;
        }else if ( scoring > 400 && creditRating >= loanAplication.getPurposeOfLoan().getAmount() ) {
            decisionType = DecisionType.POSITIVE;
        }else if ( scoring > 400 && creditRating < loanAplication.getPurposeOfLoan().getAmount() ){
            decisionType = DecisionType.NEGATIVE_CREDIT_RATING;
        }


        return creditApplicationDecision.decisionGenerator(decisionType, loanAplication, creditRating);

    }
}
