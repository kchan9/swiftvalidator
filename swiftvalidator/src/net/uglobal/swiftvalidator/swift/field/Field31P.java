
package net.uglobal.swiftvalidator.swift.field;



/**
 * Field format : (date)(place)
 * 
 * AUTO GENERATED - DO NOT HAND MODIFY
 * Generated on Sun Dec 09 17:22:28 EST 2012
 * 
 */
public class Field31P
    extends net.uglobal.swiftvalidator.swift.field.Field
{


    public Field31P(String validateData, net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
        super(validateData, xmlField);
    }

    @Override
    protected void parse() {
        addComponents(net.uglobal.swiftvalidator.swift.field.FieldComponentParseUtil.parse(validateData, getContentFormat()));
    }

    public String getDate() {
        return getComponent1();
    }

    public String getPlace() {
        return getComponent2();
    }

    public String toString() {
        return (new StringBuilder()).append("[" ).append( "date=" + getComponent1()).append( ", place=" + getComponent2() ).append( "]").toString();
    }

}
