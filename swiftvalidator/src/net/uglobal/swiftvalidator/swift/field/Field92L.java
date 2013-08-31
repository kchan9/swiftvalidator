
package net.uglobal.swiftvalidator.swift.field;



/**
 * Field format : (qualifier)(firstCurrencyCode)(amount1)(secondCurrencyCode)(amount2)
 * 
 * AUTO GENERATED - DO NOT HAND MODIFY
 * Generated on Sun Dec 09 17:22:28 EST 2012
 * 
 */
public class Field92L
    extends net.uglobal.swiftvalidator.swift.field.Field
{


    public Field92L(String validateData, net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
        super(validateData, xmlField);
    }

    @Override
    protected void parse() {
        addComponents(net.uglobal.swiftvalidator.swift.field.FieldComponentParseUtil.parse(validateData, getContentFormat()));
    }

    public String getQualifier() {
        return getComponent1();
    }

    public String getFirstCurrencyCode() {
        return getComponent2();
    }

    public String getAmount1() {
        return getComponent3();
    }

    public String getSecondCurrencyCode() {
        return getComponent4();
    }

    public String getAmount2() {
        return getComponent5();
    }

    public String toString() {
        return (new StringBuilder()).append("[" ).append( "qualifier=" + getComponent1()).append( ", firstCurrencyCode=" + getComponent2()).append( ", amount1=" + getComponent3()).append( ", secondCurrencyCode=" + getComponent4()).append( ", amount2=" + getComponent5() ).append( "]").toString();
    }

}
