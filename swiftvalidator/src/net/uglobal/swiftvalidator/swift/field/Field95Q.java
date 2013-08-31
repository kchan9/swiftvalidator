
package net.uglobal.swiftvalidator.swift.field;



/**
 * Field format : (qualifier)(nameAndAddress)
 * 
 * AUTO GENERATED - DO NOT HAND MODIFY
 * Generated on Sun Dec 09 17:22:28 EST 2012
 * 
 */
public class Field95Q
    extends net.uglobal.swiftvalidator.swift.field.Field
{


    public Field95Q(String validateData, net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
        super(validateData, xmlField);
    }

    @Override
    protected void parse() {
        addComponents(net.uglobal.swiftvalidator.swift.field.FieldComponentParseUtil.parse(validateData, getContentFormat()));
    }

    public String getQualifier() {
        return getComponent1();
    }

    public String getNameAndAddress() {
        return getComponent2();
    }

    public String toString() {
        return (new StringBuilder()).append("[" ).append( "qualifier=" + getComponent1()).append( ", nameAndAddress=" + getComponent2() ).append( "]").toString();
    }

}
