
package net.uglobal.swiftvalidator.swift.field;



/**
 * Field format : (bankCode1)(locationCode1)(referenceCode)(bankCode2)(locationCode2)
 * 
 * AUTO GENERATED - DO NOT HAND MODIFY
 * Generated on Sun Dec 09 17:22:28 EST 2012
 * 
 */
public class Field22C
    extends net.uglobal.swiftvalidator.swift.field.Field
{


    public Field22C(String validateData, net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
        super(validateData, xmlField);
    }

    @Override
    protected void parse() {
        addComponents(net.uglobal.swiftvalidator.swift.field.FieldComponentParseUtil.parse(validateData, getContentFormat()));
    }

    public String getBankCode1() {
        return getComponent1();
    }

    public String getLocationCode1() {
        return getComponent2();
    }

    public String getReferenceCode() {
        return getComponent3();
    }

    public String getBankCode2() {
        return getComponent4();
    }

    public String getLocationCode2() {
        return getComponent5();
    }

    public String toString() {
        return (new StringBuilder()).append("[" ).append( "bankCode1=" + getComponent1()).append( ", locationCode1=" + getComponent2()).append( ", referenceCode=" + getComponent3()).append( ", bankCode2=" + getComponent4()).append( ", locationCode2=" + getComponent5() ).append( "]").toString();
    }

}
