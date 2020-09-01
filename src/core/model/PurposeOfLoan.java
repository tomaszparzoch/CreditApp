package core.model;

public class PurposeOfLoan {
    private LoanType loanType;
    private double amount;

    public PurposeOfLoan(LoanType loanType, double amount) {
        this.loanType = loanType;
        this.amount = amount;
    }

    public LoanType getLoanType() {
        return loanType;
    }

    public void setLoanType(LoanType loanType) {
        this.loanType = loanType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
