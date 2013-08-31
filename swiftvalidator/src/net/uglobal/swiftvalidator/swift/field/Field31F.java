
package net.uglobal.swiftvalidator.swift.field;



/**
 * Field format : (date)(periodDate)(periodDetails)
 * 
 * AUTO GENERATED - DO NOT HAND MODIFY
 * Generated on Sun Dec 09 17:22:28 EST 2012
 * 
 */
public class Field31F
    extends net.uglobal.swiftvalidator.swift.field.Field
{


    public Field31F(String validateData, net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
        super(validateData, xmlField);
    }

    @Override
    protected void parse() {
        addComponents(net.uglobal.swiftvalidator.swift.field.FieldComponentParseUtil.parse(validateData, getContentFormat()));
    }

    public String getDate() {
        return getComponent1();
    }

    public String getPeriodDate() {
        return getComponent2();
    }

    public String getPeriodDetails() {
        return getComponent3();
    }

    public String toString() {
        return (new StringBuilder()).append("[" ).append( "date=" + getComponent1()).append( ", periodDate=" + getComponent2()).append( ", periodDetails=" + getComponent3() ).append( "]").toString();
    }

}
