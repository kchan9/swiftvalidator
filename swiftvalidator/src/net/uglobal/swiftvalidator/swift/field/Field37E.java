
package net.uglobal.swiftvalidator.swift.field;



/**
 * Field format : (rate)(endDate)(period)(number)(information)
 * 
 * AUTO GENERATED - DO NOT HAND MODIFY
 * Generated on Sun Dec 09 17:22:28 EST 2012
 * 
 */
public class Field37E
    extends net.uglobal.swiftvalidator.swift.field.Field
{


    public Field37E(String validateData, net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
        super(validateData, xmlField);
    }

    @Override
    protected void parse() {
        addComponents(net.uglobal.swiftvalidator.swift.field.FieldComponentParseUtil.parse(validateData, getContentFormat()));
    }

    public String getRate() {
        return getComponent1();
    }

    public String getEndDate() {
        return getComponent2();
    }

    public String getPeriod() {
        return getComponent3();
    }

    public String getNumber() {
        return getComponent4();
    }

    public String getInformation() {
        return getComponent5();
    }

    public String toString() {
        return (new StringBuilder()).append("[" ).append( "rate=" + getComponent1()).append( ", endDate=" + getComponent2()).append( ", period=" + getComponent3()).append( ", number=" + getComponent4()).append( ", information=" + getComponent5() ).append( "]").toString();
    }

}
