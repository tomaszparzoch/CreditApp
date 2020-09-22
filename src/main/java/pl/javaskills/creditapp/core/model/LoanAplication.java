package pl.javaskills.creditapp.core.model;

public class LoanAplication {
    private Person person;
    private PurposeOfLoan purposeOfLoan;

    public LoanAplication(Person person, PurposeOfLoan purposeOfLoan) {
        this.person = person;
        this.purposeOfLoan = purposeOfLoan;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public PurposeOfLoan getPurposeOfLoan() {
        return purposeOfLoan;
    }

    public void setPurposeOfLoan(PurposeOfLoan purposeOfLoan) {
        this.purposeOfLoan = purposeOfLoan;
    }
}
