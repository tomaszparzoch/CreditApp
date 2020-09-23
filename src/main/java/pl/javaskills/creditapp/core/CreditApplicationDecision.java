package pl.javaskills.creditapp.core;

import pl.javaskills.creditapp.core.model.*;

public class CreditApplicationDecision {

    public String decisionGenerator(DecisionType decision, LoanAplication loanAplication, double creditRating){
        String generatedDecision = null;

        switch (decision){
            case POSITIVE:
                generatedDecision = "Congratulations, " + loanAplication.getPerson().getPersonalData().getName() + " " +
                        loanAplication.getPerson().getPersonalData().getLastName()
                        + ", decision is positive";
                break;
            case CONTACT_REQUIRED:
                generatedDecision = "Sorry, " + loanAplication.getPerson().getPersonalData().getName() + " " +
                        loanAplication.getPerson().getPersonalData().getLastName()
                        + ", bank requires additional documents. Our Consultant will contact you.";
                break;
            case NEGATIVE_SCORING:
                generatedDecision = "Sorry, " + loanAplication.getPerson().getPersonalData().getName() + " " +
                        loanAplication.getPerson().getPersonalData().getLastName()
                        + ", decision is negative";
                break;
            case NEGATIVE_CREDIT_RATING:
                generatedDecision = "Sorry, " + loanAplication.getPerson().getPersonalData().getName() + " " +
                        loanAplication.getPerson().getPersonalData().getLastName()
                        + ", decision is negative. Bank can borrow only " + creditRating;
                break;
            }

        return generatedDecision;
        }

 }

