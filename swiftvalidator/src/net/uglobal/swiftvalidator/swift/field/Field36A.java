
package net.uglobal.swiftvalidator.swift.field;



/**
 * Field format : (rate)
 * 
 * AUTO GENERATED - DO NOT HAND MODIFY
 * Generated on Sun Dec 09 17:22:28 EST 2012
 * 
 */
public class Field36A
    extends net.uglobal.swiftvalidator.swift.field.Field
{


    public Field36A(String validateData, net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
        super(validateData, xmlField);
    }

    @Override
    protected void parse() {
        addComponents(net.uglobal.swiftvalidator.swift.field.FieldComponentParseUtil.parse(validateData, getContentFormat()));
    }

    public String getRate() {
        return getComponent1();
    }

    public String toString() {
        return (new StringBuilder()).append("[" ).append( "rate=" + getComponent1() ).append( "]").toString();
    }

}
