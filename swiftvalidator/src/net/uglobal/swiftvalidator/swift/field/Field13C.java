
package net.uglobal.swiftvalidator.swift.field;



/**
 * Field format : (code)(timeIndication)(sign)(timeOffset)
 * 
 * AUTO GENERATED - DO NOT HAND MODIFY
 * Generated on Sun Dec 09 17:22:28 EST 2012
 * 
 */
public class Field13C
    extends net.uglobal.swiftvalidator.swift.field.Field
{


    public Field13C(String validateData, net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
        super(validateData, xmlField);
    }

    @Override
    protected void parse() {
        addComponents(net.uglobal.swiftvalidator.swift.field.FieldComponentParseUtil.parse(validateData, getContentFormat()));
    }

    public String getCode() {
        return getComponent1();
    }

    public String getTimeIndication() {
        return getComponent2();
    }

    public String getSign() {
        return getComponent3();
    }

    public String getTimeOffset() {
        return getComponent4();
    }

    public String toString() {
        return (new StringBuilder()).append("[" ).append( "code=" + getComponent1()).append( ", timeIndication=" + getComponent2()).append( ", sign=" + getComponent3()).append( ", timeOffset=" + getComponent4() ).append( "]").toString();
    }

}
