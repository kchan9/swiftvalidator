
package net.uglobal.swiftvalidator.swift.field;



/**
 * Field format : (partyIdentifier)(location)
 * 
 * AUTO GENERATED - DO NOT HAND MODIFY
 * Generated on Sun Dec 09 17:22:28 EST 2012
 * 
 */
public class Field57B
    extends net.uglobal.swiftvalidator.swift.field.Field
{


    public Field57B(String validateData, net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
        super(validateData, xmlField);
    }

    @Override
    protected void parse() {
        addComponents(net.uglobal.swiftvalidator.swift.field.FieldComponentParseUtil.parse(validateData, getContentFormat()));
    }

    public String getPartyIdentifier() {
        return getComponent1();
    }

    public String getLocation() {
        return getComponent2();
    }

    public String toString() {
        return (new StringBuilder()).append("[" ).append( "partyIdentifier=" + getComponent1()).append( ", location=" + getComponent2() ).append( "]").toString();
    }

}
