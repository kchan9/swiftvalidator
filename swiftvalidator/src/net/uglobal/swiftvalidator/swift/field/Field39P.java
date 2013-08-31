
package net.uglobal.swiftvalidator.swift.field;



/**
 * Field format : (type)(currency)(amount)
 * 
 * AUTO GENERATED - DO NOT HAND MODIFY
 * Generated on Sun Dec 09 17:22:28 EST 2012
 * 
 */
public class Field39P
    extends net.uglobal.swiftvalidator.swift.field.Field
{


    public Field39P(String validateData, net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
        super(validateData, xmlField);
    }

    @Override
    protected void parse() {
        addComponents(net.uglobal.swiftvalidator.swift.field.FieldComponentParseUtil.parse(validateData, getContentFormat()));
    }

    public String getType() {
        return getComponent1();
    }

    public String getCurrency() {
        return getComponent2();
    }

    public String getAmount() {
        return getComponent3();
    }

    public String toString() {
        return (new StringBuilder()).append("[" ).append( "type=" + getComponent1()).append( ", currency=" + getComponent2()).append( ", amount=" + getComponent3() ).append( "]").toString();
    }

}
