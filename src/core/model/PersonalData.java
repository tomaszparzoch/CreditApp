package core.model;

public class PersonalData {
    private String name;
    private String lastName;
    private String mothersMaidenName;
    private double totalMonthlyIncomeInPln;
    private MaritialStatus maritialStatus;
    private Education education;
    private int numOfFamilyDependants;

    public PersonalData(String name, String lastName, String mothersMaidenName, double totalMonthlyIncomeInPln,
                        MaritialStatus maritialStatus, Education education, int numOfFamilyDependants) {
        this.name = name;
        this.lastName = lastName;
        this.mothersMaidenName = mothersMaidenName;
        this.totalMonthlyIncomeInPln = totalMonthlyIncomeInPln;
        this.maritialStatus = maritialStatus;
        this.education = education;
        this.numOfFamilyDependants = numOfFamilyDependants;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMothersMaidenName() {
        return mothersMaidenName;
    }

    public void setMothersMaidenName(String mothersMaidenName) {
        this.mothersMaidenName = mothersMaidenName;
    }

    public double getTotalMonthlyIncomeInPln() {
        return totalMonthlyIncomeInPln;
    }

    public void setTotalMonthlyIncomeInPln(double totalMonthlyIncomeInPln) {
        this.totalMonthlyIncomeInPln = totalMonthlyIncomeInPln;
    }

    public MaritialStatus getMaritialStatus() {
        return maritialStatus;
    }

    public void setMaritialStatus(MaritialStatus maritialStatus) {
        this.maritialStatus = maritialStatus;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public int getNumOfFamilyDependants() {
        return numOfFamilyDependants;
    }

    public void setNumOfFamilyDependants(int numOfFamilyDependants) {
        this.numOfFamilyDependants = numOfFamilyDependants;
    }
}