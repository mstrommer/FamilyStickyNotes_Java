package oop.polymorph;

import java.util.Date;

public class BusinessMeetingNote extends GeneralStickyNote{
    private String attendants;
    public BusinessMeetingNote(Date validAt,
                               String generalDescription,
                               boolean isUrgent,
                               String attendants){
        super(validAt, generalDescription, isUrgent);
        this.attendants = attendants;
    }

    @Override
    public String present() {
        return super.present() + System.lineSeparator() +
                "Attendants -> " + this.attendants;
    }
}
