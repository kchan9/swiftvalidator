
package net.uglobal.swiftvalidator.swift.field;



/**
 * Field format : (qualifier)(quantity)(currencyCode)(amount)
 * 
 * AUTO GENERATED - DO NOT HAND MODIFY
 * Generated on Sun Dec 09 17:22:28 EST 2012
 * 
 */
public class Field92N
    extends net.uglobal.swiftvalidator.swift.field.Field
{


    public Field92N(String validateData, net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
        super(validateData, xmlField);
    }

    @Override
    protected void parse() {
        addComponents(net.uglobal.swiftvalidator.swift.field.FieldComponentParseUtil.parse(validateData, getContentFormat()));
    }

    public String getQualifier() {
        return getComponent1();
    }

    public String getQuantity() {
        return getComponent2();
    }

    public String getCurrencyCode() {
        return getComponent3();
    }

    public String getAmount() {
        return getComponent4();
    }

    public String toString() {
        return (new StringBuilder()).append("[" ).append( "qualifier=" + getComponent1()).append( ", quantity=" + getComponent2()).append( ", currencyCode=" + getComponent3()).append( ", amount=" + getComponent4() ).append( "]").toString();
    }

}
