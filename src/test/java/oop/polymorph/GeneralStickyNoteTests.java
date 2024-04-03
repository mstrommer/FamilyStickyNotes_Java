package oop.polymorph;

import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GeneralStickyNoteTests {

    @Test
    public void present_propertiesSetIsUrgent_emitsStringRepresentation() {
        Date validAt = new Date();
        String generalDescription = "This is a general reminder for cleaning up the floor.";
        boolean isUrgent = true;
        GeneralStickyNote instanceUnderTest = new GeneralStickyNote(
                validAt,
                generalDescription,
                isUrgent);

        String representation = instanceUnderTest.present();

        assertThat(representation).
                contains(validAt.toString()).
                contains(generalDescription).
                containsIgnoringCase("Urgency -> yes");
    }

    @Test
    public void present_propertiesSetIsNotUrgent_emitsStringRepresentation() {
        Date validAt = new Date();
        String generalDescription = "This is a general reminder for cleaning up the floor.";
        boolean isUrgent = false;
        GeneralStickyNote instanceUnderTest = new GeneralStickyNote(
                validAt,
                generalDescription,
                isUrgent);

        String representation = instanceUnderTest.present();

        assertThat(representation).
                contains(validAt.toString()).
                contains(generalDescription).
                containsIgnoringCase("Urgency -> none");
    }
}
