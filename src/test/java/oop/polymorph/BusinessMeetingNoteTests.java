package oop.polymorph;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BusinessMeetingNoteTests {

    @Test
    public void presents_listOfAttendantsSet_emitsProperString() {
        Date validAt = new Date();
        String generalDescription = "This is a general reminder for a business meeting.";
        boolean isUrgent = true;
        String attendants = "Klaus Berger; Christian Schlichter; bernhard Fuchs;";
        GeneralStickyNote instanceUnderTest = new BusinessMeetingNote(
                validAt,
                generalDescription,
                isUrgent,
                attendants);

        String representation = instanceUnderTest.present();

        assertThat(representation).
                contains(validAt.toString()).
                contains(generalDescription).
                containsIgnoringCase("Urgency -> yes").
                contains(attendants);
    }
}
