
package net.uglobal.swiftvalidator.swift.field;



/**
 * Field format : (qualifier)(date1)(date2)
 * 
 * AUTO GENERATED - DO NOT HAND MODIFY
 * Generated on Sun Dec 09 17:22:28 EST 2012
 * 
 */
public class Field69A
    extends net.uglobal.swiftvalidator.swift.field.Field
{


    public Field69A(String validateData, net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
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

    public String getDate2() {
        return getComponent3();
    }

    public String toString() {
        return (new StringBuilder()).append("[" ).append( "qualifier=" + getComponent1()).append( ", date1=" + getComponent2()).append( ", date2=" + getComponent3() ).append( "]").toString();
    }

}
