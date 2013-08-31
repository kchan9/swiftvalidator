
package net.uglobal.swiftvalidator.swift.field;



/**
 * Field format : (pageNumber)(continationIndicator)
 * 
 * AUTO GENERATED - DO NOT HAND MODIFY
 * Generated on Sun Dec 09 17:22:28 EST 2012
 * 
 */
public class Field28E
    extends net.uglobal.swiftvalidator.swift.field.Field
{


    public Field28E(String validateData, net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
        super(validateData, xmlField);
    }

    @Override
    protected void parse() {
        addComponents(net.uglobal.swiftvalidator.swift.field.FieldComponentParseUtil.parse(validateData, getContentFormat()));
    }

    public String getPageNumber() {
        return getComponent1();
    }

    public String getContinationIndicator() {
        return getComponent2();
    }

    public String toString() {
        return (new StringBuilder()).append("[" ).append( "pageNumber=" + getComponent1()).append( ", continationIndicator=" + getComponent2() ).append( "]").toString();
    }

}
