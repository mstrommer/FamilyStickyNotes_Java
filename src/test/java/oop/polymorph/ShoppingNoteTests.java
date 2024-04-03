package oop.polymorph;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ShoppingNoteTests {

    @Test
    public void present_shoppingListAndLimitSet_emitsStringRepresentation() {
        Date validAt = new Date();
        String generalDescription = "This is a general reminder for going shopping.";
        boolean isUrgent = true;
        String products = "Wurst, Käse, Mel, Butter";
        int limit = 100;
        GeneralStickyNote instanceUnderTest = new ShoppingNote(
                validAt,
                generalDescription,
                isUrgent,
                products,
                limit);

        String representation = instanceUnderTest.present();

        assertThat(representation).
                contains(validAt.toString()).
                contains(generalDescription).
                containsIgnoringCase("Urgency -> yes").
                contains(products).
                contains(String.valueOf(limit));
    }
}
