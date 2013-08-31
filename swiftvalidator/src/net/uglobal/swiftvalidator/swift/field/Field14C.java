
package net.uglobal.swiftvalidator.swift.field;



/**
 * Field format : (year)
 * 
 * AUTO GENERATED - DO NOT HAND MODIFY
 * Generated on Sun Dec 09 17:22:28 EST 2012
 * 
 */
public class Field14C
    extends net.uglobal.swiftvalidator.swift.field.Field
{


    public Field14C(String validateData, net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
        super(validateData, xmlField);
    }

    @Override
    protected void parse() {
        addComponents(net.uglobal.swiftvalidator.swift.field.FieldComponentParseUtil.parse(validateData, getContentFormat()));
    }

    public String getYear() {
        return getComponent1();
    }

    public String toString() {
        return (new StringBuilder()).append("[" ).append( "year=" + getComponent1() ).append( "]").toString();
    }

}
