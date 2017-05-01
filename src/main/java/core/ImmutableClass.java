package core;

import java.util.Date;

public final class ImmutableClass {

    private final String firstField;
    private final String secondField;
    private Date mutableFiled;
    private final Date mutableDate;

    private ImmutableClass(String firstField, String secondField, Date mutableDate) {
        this.firstField = firstField;
        this.secondField = secondField;
        this.mutableDate = new Date(mutableDate.getTime());
    }

    public ImmutableClass createInstance(String firstField,String secondField,Date mutableFiled){

        return new ImmutableClass(firstField,secondField,mutableFiled);
    }

    public String getFirstField() {
        return firstField;
    }

    public String getSecondField() {
        return secondField;
    }

    public Date getMutableFiled() {
        return mutableFiled;
    }

    public Date getMutableDate() {
        return mutableDate;
    }
    
}
