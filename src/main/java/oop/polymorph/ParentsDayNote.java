package oop.polymorph;

import java.util.Date;

public class ParentsDayNote extends GeneralStickyNote {
    private String nameOfChild;
    private String school;
    public ParentsDayNote(Date validAt,
                          String generalDescription,
                          boolean isUrgent,
                          String nameOfChild,
                          String school){
        super(validAt, generalDescription, isUrgent);
        this.nameOfChild = nameOfChild;
        this.school = school;
    }

    @Override
    public String present() {
        return super.present() + System.lineSeparator() +
                "School -> " + this.school + System.lineSeparator() +
                "Child -> " + this.nameOfChild;
    }
}
