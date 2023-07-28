package net.sf.jasperreports.components.headertoolbar.actions;

import net.sf.jasperreports.components.sort.FilterTypesEnum;

import java.util.Locale;
import java.util.TimeZone;

public class ComparisonConfig {
    private final Object compareTo;
    private final FilterTypesEnum conditionType;
    private final String conditionPattern;
    private final Locale locale;
    private final TimeZone timeZone;

    // You can also include other fields, like `conditionTypeOperator`, depending on your needs

    public ComparisonConfig(Object compareTo, FilterTypesEnum conditionType, String conditionPattern, Locale locale, TimeZone timeZone) {
        this.compareTo = compareTo;
        this.conditionType = conditionType;
        this.conditionPattern = conditionPattern;
        this.locale = locale;
        this.timeZone = timeZone;
    }

    public Object getCompareTo() {
        return compareTo;
    }

    public FilterTypesEnum getConditionType() {
        return conditionType;
    }

    public String getConditionPattern() {
        return conditionPattern;
    }

    public Locale getLocale() {
        return locale;
    }

    public TimeZone getTimeZone() {
        return timeZone;
    }
}
