package oop.polymorph;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ParentsDayNoteTests {

    @Test
    public void presents_nameOfChildAndSchoolSet_emitsProperString() {
        Date validAt = new Date();
        String generalDescription = "This is a general reminder for parents day at school.";
        boolean isUrgent = true;
        String nameOfChild = "Heinrich;";
        String school = "Grammar school London east";
        GeneralStickyNote instanceUnderTest = new ParentsDayNote(
                validAt,
                generalDescription,
                isUrgent,
                nameOfChild,
                school);

        String representation = instanceUnderTest.present();

        assertThat(representation).
                contains(validAt.toString()).
                contains(generalDescription).
                containsIgnoringCase("Urgency -> yes").
                contains(nameOfChild).
                contains(school);
    }
}
