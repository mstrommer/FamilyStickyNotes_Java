package oop.polymorph;

import java.util.Date;

public class GeneralStickyNote {
    private Date validAt;
    private String generalDescription;
    private boolean isUrgent;
    public GeneralStickyNote(Date validAt, String generalDescription, boolean isUrgent) {
        this.validAt = validAt;
        this.generalDescription = generalDescription;
        this.isUrgent = isUrgent;
    }

    public String present() {
        return String.format(
         "Note \r\nWhat -> %s \r\nDate -> %s \r\nUrgency -> %s",
         this.generalDescription, this.validAt, this.isUrgent ? "yes" : "none");
    }
}
