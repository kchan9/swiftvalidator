
package net.uglobal.swiftvalidator.swift.field;



/**
 * Field format : (date1)(date2)
 * 
 * AUTO GENERATED - DO NOT HAND MODIFY
 * Generated on Sun Dec 09 17:22:28 EST 2012
 * 
 */
public class Field67A
    extends net.uglobal.swiftvalidator.swift.field.Field
{


    public Field67A(String validateData, net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
        super(validateData, xmlField);
    }

    @Override
    protected void parse() {
        addComponents(net.uglobal.swiftvalidator.swift.field.FieldComponentParseUtil.parse(validateData, getContentFormat()));
    }

    public String getDate1() {
        return getComponent1();
    }

    public String getDate2() {
        return getComponent2();
    }

    public String toString() {
        return (new StringBuilder()).append("[" ).append( "date1=" + getComponent1()).append( ", date2=" + getComponent2() ).append( "]").toString();
    }

}
