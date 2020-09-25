package pl.javaskills.creditapp.core;

import pl.javaskills.creditapp.core.model.*;

public class CreditApplicationDecision {
    private final DecisionType decision;
    private final PersonalData personalData;
    private final double creditRating;

    public CreditApplicationDecision(DecisionType decision, PersonalData personalData, Double creditRating) {
        this.decision = decision;
        this.personalData = personalData;
        this.creditRating = creditRating;
    }

    public String getDecisionString(){
        String decisionString = null;

        switch (decision){
            case POSITIVE:
                decisionString = "Congratulations, " + personalData.getName() + " " +
                        personalData.getLastName() + ", decision is positive";
                break;
            case CONTACT_REQUIRED:
                decisionString = "Sorry, " + personalData.getName() + " " +
                        personalData.getLastName()
                        + ", bank requires additional documents. Our Consultant will contact you.";
                break;
            case NEGATIVE_SCORING:
                decisionString = "Sorry, " + personalData.getName() + " " +
                        personalData.getLastName() + ", decision is negative";
                break;
            case NEGATIVE_CREDIT_RATING:
                decisionString = "Sorry, " + personalData.getName() + " " +
                        personalData.getLastName()
                        + ", decision is negative. Bank can borrow only " + creditRating;
                break;
            }

        return decisionString;
        }

 }

