package pl.javaskills.creditapp.core;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pl.javaskills.creditapp.core.model.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("testing scoring depending on person")
class PersonScoringCalculatorTest {
    private PersonScoringCalculator cut = new PersonScoringCalculator();

    @Test
    @DisplayName("should return 200 when: " +
            "TotalMonthlyIncomeInPln=5000" +
            "numOfDependants=2" +
            "education=PRIMARY" +
            "maritalStatus=MARRIED")
    public void Test1(){

        //given
        Person person = new Person(new PersonalData(null, null, null,
                5000, MaritialStatus.MARRIED, Education.PRIMARY, 2),
                new ContactData(null, null));
        //when
        int score = cut.scoring(person);
        //then
        assertEquals(200, score);

    }

    @Test
    @DisplayName("should return 500 when: " +
            "TotalMonthlyIncomeInPln=5500" +
            "numOfDependants=1" +
            "education=MIDDLE" +
            "maritalStatus=DIVORCED")
    public void Test2(){

        //given
        Person person = new Person(new PersonalData(null, null, null,
                5500, MaritialStatus.DIVORCED, Education.MIDDLE, 1),
                new ContactData(null, null));
        //when
        int score = cut.scoring(person);
        //then
        assertEquals(500, score);

    }
    @Test
    @DisplayName("should return 100 when: " +
            "TotalMonthlyIncomeInPln=9000" +
            "numOfDependants=3" +
            "education=NONE" +
            "maritalStatus=SINGLE")
    public void Test3(){

        //given
        Person person = new Person(new PersonalData(null, null, null,
                9000, MaritialStatus.SINGLE, Education.NONE, 3),
                new ContactData(null, null));
        //when
        int score = cut.scoring(person);
        //then
        assertEquals(100, score);

    }


}