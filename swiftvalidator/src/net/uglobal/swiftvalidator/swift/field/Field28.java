
package net.uglobal.swiftvalidator.swift.field;



/**
 * Field format : (pageNumber)(indicator)
 * 
 * AUTO GENERATED - DO NOT HAND MODIFY
 * Generated on Sun Dec 09 17:22:28 EST 2012
 * 
 */
public class Field28
    extends net.uglobal.swiftvalidator.swift.field.Field
{


    public Field28(String validateData, net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
        super(validateData, xmlField);
    }

    @Override
    protected void parse() {
        addComponents(net.uglobal.swiftvalidator.swift.field.FieldComponentParseUtil.parse(validateData, getContentFormat()));
    }

    public String getPageNumber() {
        return getComponent1();
    }

    public String getIndicator() {
        return getComponent2();
    }

    public String toString() {
        return (new StringBuilder()).append("[" ).append( "pageNumber=" + getComponent1()).append( ", indicator=" + getComponent2() ).append( "]").toString();
    }

}
