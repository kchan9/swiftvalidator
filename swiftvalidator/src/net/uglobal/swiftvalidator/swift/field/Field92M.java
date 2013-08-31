
package net.uglobal.swiftvalidator.swift.field;



/**
 * Field format : (qualifier)(currencyCode)(amount)(quantity)
 * 
 * AUTO GENERATED - DO NOT HAND MODIFY
 * Generated on Sun Dec 09 17:22:28 EST 2012
 * 
 */
public class Field92M
    extends net.uglobal.swiftvalidator.swift.field.Field
{


    public Field92M(String validateData, net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
        super(validateData, xmlField);
    }

    @Override
    protected void parse() {
        addComponents(net.uglobal.swiftvalidator.swift.field.FieldComponentParseUtil.parse(validateData, getContentFormat()));
    }

    public String getQualifier() {
        return getComponent1();
    }

    public String getCurrencyCode() {
        return getComponent2();
    }

    public String getAmount() {
        return getComponent3();
    }

    public String getQuantity() {
        return getComponent4();
    }

    public String toString() {
        return (new StringBuilder()).append("[" ).append( "qualifier=" + getComponent1()).append( ", currencyCode=" + getComponent2()).append( ", amount=" + getComponent3()).append( ", quantity=" + getComponent4() ).append( "]").toString();
    }

}
