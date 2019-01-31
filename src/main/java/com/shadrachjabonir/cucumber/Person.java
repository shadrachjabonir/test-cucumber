package com.shadrachjabonir.cucumber;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Person {
    public Integer age(String dob){
        Integer result = 0;
        try {
            Calendar curent = Calendar.getInstance();
            Calendar cal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy", Locale.ENGLISH);
            cal.setTime(sdf.parse(dob));
            result = curent.get(Calendar.YEAR) -  cal.get(Calendar.YEAR);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return result;
    }
}
