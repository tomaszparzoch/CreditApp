package core.model;

public class Person {
    private PersonalData personalData;
    private ContactData contactData;
    private PurposeOfLoan purposeOfLoan;

    public Person(PersonalData personalData, ContactData contactData, PurposeOfLoan purposeOfLoan) {
        this.personalData = personalData;
        this.contactData = contactData;
        this.purposeOfLoan = purposeOfLoan;
    }

    public PersonalData getPersonalData() {
        return personalData;
    }

    public void setPersonalData(PersonalData personalData) {
        this.personalData = personalData;
    }

    public ContactData getContactData() {
        return contactData;
    }

    public void setContactData(ContactData contactData) {
        this.contactData = contactData;
    }

    public PurposeOfLoan getPurposeOfLoan() {
        return purposeOfLoan;
    }

    public void setPurposeOfLoan(PurposeOfLoan purposeOfLoan) {
        this.purposeOfLoan = purposeOfLoan;
    }
}
