package oop.polymorph;

import java.util.Date;

public class ShoppingNote extends GeneralStickyNote {

    private String products;
    private int limit;

    public ShoppingNote(Date validAt,
                        String generalDescription,
                        boolean isUrgent,
                        String products,
                        int limit){
        super(validAt,generalDescription,isUrgent);
        this.products = products;
        this.limit = limit;
    }

    @Override
    public String present() {
        return super.present() + System.lineSeparator() +
                "Products -> " + this.products + System.lineSeparator() +
                "Limit -> " + this.limit;
    }
}
