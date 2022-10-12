package com.trader.core.utils;

import com.trader.core.enums.DatePatternsEnum;
import com.trader.core.enums.DateTimeZonesEnum;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateFormatUtils {
    public static boolean validateStringToDateFormat(String stringDate,
                                                     DatePatternsEnum datePatternsEnum) {
        try {
            new SimpleDateFormat(datePatternsEnum.getPattern()).parse(stringDate);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static String parseDateToString(Date date) {
        return new SimpleDateFormat().format(date);
    }

    public static String parseDateToString(Date date,
                                           DatePatternsEnum datePatternsEnum) {
        return new SimpleDateFormat(datePatternsEnum.getPattern()).format(date);
    }

    public static String parseDateToString(Date date,
                                           DatePatternsEnum datePatternsEnum,
                                           DateTimeZonesEnum dateTimeZonesEnum) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(datePatternsEnum.getPattern());
        dateFormat.setTimeZone(TimeZone.getTimeZone(dateTimeZonesEnum.getZone()));
        return dateFormat.format(date);
    }

    public static Date parseStringToDate(String stringDate) throws ParseException {
        return new SimpleDateFormat().parse(stringDate);
    }

    public static Date parseStringToDate(String stringDate,
                                         DatePatternsEnum datePatternsEnum) throws ParseException {
        return new SimpleDateFormat(datePatternsEnum.getPattern()).parse(stringDate);
    }

    public static long getMilliSecondsFromDate(Date date) {
        return date.getTime();
    }

    public static boolean Date1GreaterThanDate2(Date date1,
                                                Date date2) {
        return date1.after(date2);
    }

    public static boolean Date1SmallerThanDate2(Date date1,
                                                Date date2) {
        return date1.before(date2);
    }

    public static boolean Date1GreaterOrEqualsThanDate2(Date date1,
                                                        Date date2) {
        return date1.after(date2) || date1.equals(date2);
    }

    public static boolean Date1SmallerOrEqualsThanDate2(Date date1,
                                                        Date date2) {
        return date1.before(date2) || date1.equals(date2);
    }

    public static boolean Date1EqualsDate2(Date date1,
                                           Date date2) {
        return date1.equals(date2);
    }
}
