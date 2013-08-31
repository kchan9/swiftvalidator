
package net.uglobal.swiftvalidator.swift.field;



/**
 * Field format : (qualifier)(amountTypeCode)(currencyCode)(price)
 * 
 * AUTO GENERATED - DO NOT HAND MODIFY
 * Generated on Sun Dec 09 17:22:28 EST 2012
 * 
 */
public class Field90B
    extends net.uglobal.swiftvalidator.swift.field.Field
{


    public Field90B(String validateData, net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
        super(validateData, xmlField);
    }

    @Override
    protected void parse() {
        addComponents(net.uglobal.swiftvalidator.swift.field.FieldComponentParseUtil.parse(validateData, getContentFormat()));
    }

    public String getQualifier() {
        return getComponent1();
    }

    public String getAmountTypeCode() {
        return getComponent2();
    }

    public String getCurrencyCode() {
        return getComponent3();
    }

    public String getPrice() {
        return getComponent4();
    }

    public String toString() {
        return (new StringBuilder()).append("[" ).append( "qualifier=" + getComponent1()).append( ", amountTypeCode=" + getComponent2()).append( ", currencyCode=" + getComponent3()).append( ", price=" + getComponent4() ).append( "]").toString();
    }

}
