
package net.uglobal.swiftvalidator.swift.field;



/**
 * Field format : (typeOfAgreement)(date)(version)
 * 
 * AUTO GENERATED - DO NOT HAND MODIFY
 * Generated on Sun Dec 09 17:22:28 EST 2012
 * 
 */
public class Field77H
    extends net.uglobal.swiftvalidator.swift.field.Field
{


    public Field77H(String validateData, net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
        super(validateData, xmlField);
    }

    @Override
    protected void parse() {
        addComponents(net.uglobal.swiftvalidator.swift.field.FieldComponentParseUtil.parse(validateData, getContentFormat()));
    }

    public String getTypeOfAgreement() {
        return getComponent1();
    }

    public String getDate() {
        return getComponent2();
    }

    public String getVersion() {
        return getComponent3();
    }

    public String toString() {
        return (new StringBuilder()).append("[" ).append( "typeOfAgreement=" + getComponent1()).append( ", date=" + getComponent2()).append( ", version=" + getComponent3() ).append( "]").toString();
    }

}
