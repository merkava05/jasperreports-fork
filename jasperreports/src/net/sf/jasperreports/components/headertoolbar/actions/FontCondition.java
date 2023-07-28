package net.sf.jasperreports.components.headertoolbar.actions;

import net.sf.jasperreports.engine.JRConstants;

import java.io.Serializable;

public class FontCondition implements Serializable {

    private static final long serialVersionUID = JRConstants.SERIAL_VERSION_UID;

    private Boolean conditionFontBold;
    private Boolean conditionFontItalic;
    private Boolean conditionFontUnderline;
    private String conditionFontColor;
    private String conditionFontBackColor;

    public Boolean isConditionFontBold() {
        return conditionFontBold;
    }

    public void setConditionFontBold(Boolean conditionFontBold) {
        this.conditionFontBold = conditionFontBold;
    }

    public Boolean isConditionFontItalic() {
        return conditionFontItalic;
    }

    public void setConditionFontItalic(Boolean conditionFontItalic) {
        this.conditionFontItalic = conditionFontItalic;
    }

    public Boolean isConditionFontUnderline() {
        return conditionFontUnderline;
    }

    public void setConditionFontUnderline(Boolean conditionFontUnderline) {
        this.conditionFontUnderline = conditionFontUnderline;
    }

    public String getConditionFontColor() {
        return conditionFontColor;
    }

    public void setConditionFontColor(String conditionFontColor) {
        this.conditionFontColor = conditionFontColor;
    }

    public String getConditionFontBackColor() {
        return conditionFontBackColor;
    }

    public void setConditionFontBackColor(String conditionFontBackColor) {
        this.conditionFontBackColor = conditionFontBackColor;
    }


}
