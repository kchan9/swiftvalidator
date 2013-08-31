
package net.uglobal.swiftvalidator.swift.field;



/**
 * Field format : (currency)(price)(period)
 * 
 * AUTO GENERATED - DO NOT HAND MODIFY
 * Generated on Sun Dec 09 17:22:28 EST 2012
 * 
 */
public class Field35U
    extends net.uglobal.swiftvalidator.swift.field.Field
{


    public Field35U(String validateData, net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
        super(validateData, xmlField);
    }

    @Override
    protected void parse() {
        addComponents(net.uglobal.swiftvalidator.swift.field.FieldComponentParseUtil.parse(validateData, getContentFormat()));
    }

    public String getCurrency() {
        return getComponent1();
    }

    public String getPrice() {
        return getComponent2();
    }

    public String getPeriod() {
        return getComponent3();
    }

    public String toString() {
        return (new StringBuilder()).append("[" ).append( "currency=" + getComponent1()).append( ", price=" + getComponent2()).append( ", period=" + getComponent3() ).append( "]").toString();
    }

}
