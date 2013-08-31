
package net.uglobal.swiftvalidator.swift.field;



/**
 * Field format : (qualifier)(firstCurrencyCode)(secondCurrencyCode)(rate)
 * 
 * AUTO GENERATED - DO NOT HAND MODIFY
 * Generated on Sun Dec 09 17:22:28 EST 2012
 * 
 */
public class Field92B
    extends net.uglobal.swiftvalidator.swift.field.Field
{


    public Field92B(String validateData, net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
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

    public String getSecondCurrencyCode() {
        return getComponent3();
    }

    public String getRate() {
        return getComponent4();
    }

    public String toString() {
        return (new StringBuilder()).append("[" ).append( "qualifier=" + getComponent1()).append( ", firstCurrencyCode=" + getComponent2()).append( ", secondCurrencyCode=" + getComponent3()).append( ", rate=" + getComponent4() ).append( "]").toString();
    }

}
