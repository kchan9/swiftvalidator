
package net.uglobal.swiftvalidator.swift.field;



/**
 * Field format : (qualifier)(dataSourceScheme)(rateTypeCode)(currencyCode)(amount)(rateStatus)
 * 
 * AUTO GENERATED - DO NOT HAND MODIFY
 * Generated on Sun Dec 09 17:22:28 EST 2012
 * 
 */
public class Field92J
    extends net.uglobal.swiftvalidator.swift.field.Field
{


    public Field92J(String validateData, net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
        super(validateData, xmlField);
    }

    @Override
    protected void parse() {
        addComponents(net.uglobal.swiftvalidator.swift.field.FieldComponentParseUtil.parse(validateData, getContentFormat()));
    }

    public String getQualifier() {
        return getComponent1();
    }

    public String getDataSourceScheme() {
        return getComponent2();
    }

    public String getRateTypeCode() {
        return getComponent3();
    }

    public String getCurrencyCode() {
        return getComponent4();
    }

    public String getAmount() {
        return getComponent5();
    }

    public String getRateStatus() {
        return getComponent6();
    }

    public String toString() {
        return (new StringBuilder()).append("[" ).append( "qualifier=" + getComponent1()).append( ", dataSourceScheme=" + getComponent2()).append( ", rateTypeCode=" + getComponent3()).append( ", currencyCode=" + getComponent4()).append( ", amount=" + getComponent5()).append( ", rateStatus=" + getComponent6() ).append( "]").toString();
    }

}
