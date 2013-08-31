
package net.uglobal.swiftvalidator.swift.field;



/**
 * Field format : (function)(subfunction)
 * 
 * AUTO GENERATED - DO NOT HAND MODIFY
 * Generated on Sun Dec 09 17:22:28 EST 2012
 * 
 */
public class Field23G
    extends net.uglobal.swiftvalidator.swift.field.Field
{


    public Field23G(String validateData, net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
        super(validateData, xmlField);
    }

    @Override
    protected void parse() {
        addComponents(net.uglobal.swiftvalidator.swift.field.FieldComponentParseUtil.parse(validateData, getContentFormat()));
    }

    public String getFunction() {
        return getComponent1();
    }

    public String getSubfunction() {
        return getComponent2();
    }

    public String toString() {
        return (new StringBuilder()).append("[" ).append( "function=" + getComponent1()).append( ", subfunction=" + getComponent2() ).append( "]").toString();
    }

}
