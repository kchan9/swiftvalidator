
package net.uglobal.swiftvalidator.swift.field;



/**
 * Field format : (partyIdentifier)(nameAndAddress)
 * 
 * AUTO GENERATED - DO NOT HAND MODIFY
 * Generated on Sun Dec 09 17:22:28 EST 2012
 * 
 */
public class Field84D
    extends net.uglobal.swiftvalidator.swift.field.Field
{


    public Field84D(String validateData, net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
        super(validateData, xmlField);
    }

    @Override
    protected void parse() {
        addComponents(net.uglobal.swiftvalidator.swift.field.FieldComponentParseUtil.parse(validateData, getContentFormat()));
    }

    public String getPartyIdentifier() {
        return getComponent1();
    }

    public String getNameAndAddress() {
        return getComponent2();
    }

    public String toString() {
        return (new StringBuilder()).append("[" ).append( "partyIdentifier=" + getComponent1()).append( ", nameAndAddress=" + getComponent2() ).append( "]").toString();
    }

}
