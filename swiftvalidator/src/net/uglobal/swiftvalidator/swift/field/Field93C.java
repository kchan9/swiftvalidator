
package net.uglobal.swiftvalidator.swift.field;



/**
 * Field format : (qualifier)(quantityTypeCode)(balanceTypeCode)(sign)(balance)
 * 
 * AUTO GENERATED - DO NOT HAND MODIFY
 * Generated on Sun Dec 09 17:22:28 EST 2012
 * 
 */
public class Field93C
    extends net.uglobal.swiftvalidator.swift.field.Field
{


    public Field93C(String validateData, net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
        super(validateData, xmlField);
    }

    @Override
    protected void parse() {
        addComponents(net.uglobal.swiftvalidator.swift.field.FieldComponentParseUtil.parse(validateData, getContentFormat()));
    }

    public String getQualifier() {
        return getComponent1();
    }

    public String getQuantityTypeCode() {
        return getComponent2();
    }

    public String getBalanceTypeCode() {
        return getComponent3();
    }

    public String getSign() {
        return getComponent4();
    }

    public String getBalance() {
        return getComponent5();
    }

    public String toString() {
        return (new StringBuilder()).append("[" ).append( "qualifier=" + getComponent1()).append( ", quantityTypeCode=" + getComponent2()).append( ", balanceTypeCode=" + getComponent3()).append( ", sign=" + getComponent4()).append( ", balance=" + getComponent5() ).append( "]").toString();
    }

}
