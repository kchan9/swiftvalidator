
package net.uglobal.swiftvalidator.swift.field;



/**
 * Field format : (identificationOfSecurity)(descriptionOfSecurity)
 * 
 * AUTO GENERATED - DO NOT HAND MODIFY
 * Generated on Sun Dec 09 17:22:28 EST 2012
 * 
 */
public class Field35B
    extends net.uglobal.swiftvalidator.swift.field.Field
{


    public Field35B(String validateData, net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
        super(validateData, xmlField);
    }

    @Override
    protected void parse() {
        addComponents(net.uglobal.swiftvalidator.swift.field.FieldComponentParseUtil.parse(validateData, getContentFormat()));
    }

    public String getIdentificationOfSecurity() {
        return getComponent1();
    }

    public String getDescriptionOfSecurity() {
        return getComponent2();
    }

    public String toString() {
        return (new StringBuilder()).append("[" ).append( "identificationOfSecurity=" + getComponent1()).append( ", descriptionOfSecurity=" + getComponent2() ).append( "]").toString();
    }

}
