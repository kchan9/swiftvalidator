
package net.uglobal.swiftvalidator.swift.field;



/**
 * Field format : (messageIndex)(total)
 * 
 * AUTO GENERATED - DO NOT HAND MODIFY
 * Generated on Sun Dec 09 17:22:28 EST 2012
 * 
 */
public class Field28D
    extends net.uglobal.swiftvalidator.swift.field.Field
{


    public Field28D(String validateData, net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
        super(validateData, xmlField);
    }

    @Override
    protected void parse() {
        addComponents(net.uglobal.swiftvalidator.swift.field.FieldComponentParseUtil.parse(validateData, getContentFormat()));
    }

    public String getMessageIndex() {
        return getComponent1();
    }

    public String getTotal() {
        return getComponent2();
    }

    public String toString() {
        return (new StringBuilder()).append("[" ).append( "messageIndex=" + getComponent1()).append( ", total=" + getComponent2() ).append( "]").toString();
    }

}
