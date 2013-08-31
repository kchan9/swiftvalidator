
package net.uglobal.swiftvalidator.swift.field;



/**
 * Field format : (qualifier)(amountTypeCode)(currencyCode1)(amount1)(currencyCode2)(amount2)
 * 
 * AUTO GENERATED - DO NOT HAND MODIFY
 * Generated on Sun Dec 09 17:22:28 EST 2012
 * 
 */
public class Field90J
    extends net.uglobal.swiftvalidator.swift.field.Field
{


    public Field90J(String validateData, net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
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

    public String getCurrencyCode1() {
        return getComponent3();
    }

    public String getAmount1() {
        return getComponent4();
    }

    public String getCurrencyCode2() {
        return getComponent5();
    }

    public String getAmount2() {
        return getComponent6();
    }

    public String toString() {
        return (new StringBuilder()).append("[" ).append( "qualifier=" + getComponent1()).append( ", amountTypeCode=" + getComponent2()).append( ", currencyCode1=" + getComponent3()).append( ", amount1=" + getComponent4()).append( ", currencyCode2=" + getComponent5()).append( ", amount2=" + getComponent6() ).append( "]").toString();
    }

}
