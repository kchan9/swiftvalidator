
package net.uglobal.swiftvalidator.swift.field;



/**
 * Field format : (qualifier)(quantityTypeCode)(sign)(quantity)
 * 
 * AUTO GENERATED - DO NOT HAND MODIFY
 * Generated on Sun Dec 09 17:22:28 EST 2012
 * 
 */
public class Field36E
    extends net.uglobal.swiftvalidator.swift.field.Field
{


    public Field36E(String validateData, net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
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

    public String getSign() {
        return getComponent3();
    }

    public String getQuantity() {
        return getComponent4();
    }

    public String toString() {
        return (new StringBuilder()).append("[" ).append( "qualifier=" + getComponent1()).append( ", quantityTypeCode=" + getComponent2()).append( ", sign=" + getComponent3()).append( ", quantity=" + getComponent4() ).append( "]").toString();
    }

}
