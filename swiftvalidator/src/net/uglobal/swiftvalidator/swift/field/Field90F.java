
package net.uglobal.swiftvalidator.swift.field;



/**
 * Field format : (qualifier)(amountTypeCode)(currencyCode)(amount)(quantityTypeCode)(quantity)
 * 
 * AUTO GENERATED - DO NOT HAND MODIFY
 * Generated on Sun Dec 09 17:22:28 EST 2012
 * 
 */
public class Field90F
    extends net.uglobal.swiftvalidator.swift.field.Field
{


    public Field90F(String validateData, net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
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

    public String getAmount() {
        return getComponent4();
    }

    public String getQuantityTypeCode() {
        return getComponent5();
    }

    public String getQuantity() {
        return getComponent6();
    }

    public String toString() {
        return (new StringBuilder()).append("[" ).append( "qualifier=" + getComponent1()).append( ", amountTypeCode=" + getComponent2()).append( ", currencyCode=" + getComponent3()).append( ", amount=" + getComponent4()).append( ", quantityTypeCode=" + getComponent5()).append( ", quantity=" + getComponent6() ).append( "]").toString();
    }

}
