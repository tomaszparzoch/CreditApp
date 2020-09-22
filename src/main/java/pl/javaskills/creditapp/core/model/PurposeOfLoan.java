package pl.javaskills.creditapp.core.model;

public class PurposeOfLoan {
    private LoanType loanType;
    private double amount;
    private byte period;

    public PurposeOfLoan(LoanType loanType, double amount, byte period) {
        this.loanType = loanType;
        this.amount = amount;
        this.period = period;
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

    public byte getPeriod() {
        return period;
    }

    public void setPeriod(byte period) {
        this.period = period;
    }
}
