
package net.uglobal.swiftvalidator.swift.field;



/**
 * Field format : (code)
 * 
 * AUTO GENRATED - DO NOT HAND MODIFY
 * Generated on Sun Sep 02 08:14:59 EDT 2012
 * 
 */
public class Field16S
    extends net.uglobal.swiftvalidator.swift.field.Field
{


    public Field16S(String validateData, net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
        super(validateData, xmlField);
    }

    @Override
    protected void parse() {
        addComponent(validateData);
    }

    public String getCode() {
        return getComponent1();
    }

    public String toString() {
        return (new StringBuilder()).append("[" ).append( "code=" + getComponent1() ).append( "]").toString();
    }

}
