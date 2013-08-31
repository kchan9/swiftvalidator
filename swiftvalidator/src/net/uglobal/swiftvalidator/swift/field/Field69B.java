
package net.uglobal.swiftvalidator.swift.field;



/**
 * Field format : (qualifier)(date1)(time1)(date2)(time2)
 * 
 * AUTO GENERATED - DO NOT HAND MODIFY
 * Generated on Sun Dec 09 17:22:28 EST 2012
 * 
 */
public class Field69B
    extends net.uglobal.swiftvalidator.swift.field.Field
{


    public Field69B(String validateData, net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
        super(validateData, xmlField);
    }

    @Override
    protected void parse() {
        addComponents(net.uglobal.swiftvalidator.swift.field.FieldComponentParseUtil.parse(validateData, getContentFormat()));
    }

    public String getQualifier() {
        return getComponent1();
    }

    public String getDate1() {
        return getComponent2();
    }

    public String getTime1() {
        return getComponent3();
    }

    public String getDate2() {
        return getComponent4();
    }

    public String getTime2() {
        return getComponent5();
    }

    public String toString() {
        return (new StringBuilder()).append("[" ).append( "qualifier=" + getComponent1()).append( ", date1=" + getComponent2()).append( ", time1=" + getComponent3()).append( ", date2=" + getComponent4()).append( ", time2=" + getComponent5() ).append( "]").toString();
    }

}
