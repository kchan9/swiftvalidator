
package net.uglobal.swiftvalidator.swift.field;



/**
 * Field format : (qualifier)(percentageTypeCode)(price)
 * 
 * AUTO GENERATED - DO NOT HAND MODIFY
 * Generated on Sun Dec 09 17:22:28 EST 2012
 * 
 */
public class Field90A
    extends net.uglobal.swiftvalidator.swift.field.Field
{


    public Field90A(String validateData, net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
        super(validateData, xmlField);
    }

    @Override
    protected void parse() {
        addComponents(net.uglobal.swiftvalidator.swift.field.FieldComponentParseUtil.parse(validateData, getContentFormat()));
    }

    public String getQualifier() {
        return getComponent1();
    }

    public String getPercentageTypeCode() {
        return getComponent2();
    }

    public String getPrice() {
        return getComponent3();
    }

    public String toString() {
        return (new StringBuilder()).append("[" ).append( "qualifier=" + getComponent1()).append( ", percentageTypeCode=" + getComponent2()).append( ", price=" + getComponent3() ).append( "]").toString();
    }

}
