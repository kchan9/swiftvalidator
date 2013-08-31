
package net.uglobal.swiftvalidator.swift.field;



/**
 * Field format : (entryNumber)(pageNumber)
 * 
 * AUTO GENERATED - DO NOT HAND MODIFY
 * Generated on Sun Dec 09 17:22:28 EST 2012
 * 
 */
public class Field28C
    extends net.uglobal.swiftvalidator.swift.field.Field
{


    public Field28C(String validateData, net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
        super(validateData, xmlField);
    }

    @Override
    protected void parse() {
        addComponents(net.uglobal.swiftvalidator.swift.field.FieldComponentParseUtil.parse(validateData, getContentFormat()));
    }

    public String getEntryNumber() {
        return getComponent1();
    }

    public String getPageNumber() {
        return getComponent2();
    }

    public String toString() {
        return (new StringBuilder()).append("[" ).append( "entryNumber=" + getComponent1()).append( ", pageNumber=" + getComponent2() ).append( "]").toString();
    }

}
