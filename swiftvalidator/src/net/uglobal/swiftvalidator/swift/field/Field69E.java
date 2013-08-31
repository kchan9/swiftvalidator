
package net.uglobal.swiftvalidator.swift.field;



/**
 * Field format : (qualifier)(dateCode)(date)
 * 
 * AUTO GENERATED - DO NOT HAND MODIFY
 * Generated on Sun Dec 09 17:22:28 EST 2012
 * 
 */
public class Field69E
    extends net.uglobal.swiftvalidator.swift.field.Field
{


    public Field69E(String validateData, net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
        super(validateData, xmlField);
    }

    @Override
    protected void parse() {
        addComponents(net.uglobal.swiftvalidator.swift.field.FieldComponentParseUtil.parse(validateData, getContentFormat()));
    }

    public String getQualifier() {
        return getComponent1();
    }

    public String getDateCode() {
        return getComponent2();
    }

    public String getDate() {
        return getComponent3();
    }

    public String toString() {
        return (new StringBuilder()).append("[" ).append( "qualifier=" + getComponent1()).append( ", dateCode=" + getComponent2()).append( ", date=" + getComponent3() ).append( "]").toString();
    }

}
