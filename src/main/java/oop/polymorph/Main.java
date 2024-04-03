package oop.polymorph;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        GeneralStickyNote[] notes = new GeneralStickyNote[]
                {
                        new ParentsDayNote(
                                new Date(2024, 11, 21),
                                "This is a general reminder for parents day at school.",
                                true,
                                "Heinrich;",
                                "Grammar school London east"),
                        new ParentsDayNote(
                                new Date(2024, 11, 22),
                                "This is a general reminder for parents day at school.",
                                true,
                                "Beate;",
                                "Grammar school London north"),
                        new BusinessMeetingNote(
                                new Date(2024, 1, 29),
                                "Budget planning for Q1.",
                                false,
                                "Simon Hooper; Nichael Dust; Dagobert Duck;"),
                        new BusinessMeetingNote(
                                new Date(2024, 6, 29),
                                "Jop interview",
                                false,
                                "Greg Mac Worthy;"),
                        new ShoppingNote(
                                new Date(2024, 3, 29),
                                "By food for birthday party",
                                true,
                                "Sausages, 10 Egs, Butter, Milk;",
                                45)
                };

        for (GeneralStickyNote note: notes) {
            System.out.println("*************************************");
            System.out.println(note.present());
        }
    }
}