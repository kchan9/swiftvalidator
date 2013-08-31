
package net.uglobal.swiftvalidator.swift.field;



/**
 * Field format : (qualifier)(dataSourceScheme)(dateCode)(time)
 * 
 * AUTO GENERATED - DO NOT HAND MODIFY
 * Generated on Sun Dec 09 17:22:28 EST 2012
 * 
 */
public class Field98F
    extends net.uglobal.swiftvalidator.swift.field.Field
{


    public Field98F(String validateData, net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
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

    public String getDateCode() {
        return getComponent3();
    }

    public String getTime() {
        return getComponent4();
    }

    public String toString() {
        return (new StringBuilder()).append("[" ).append( "qualifier=" + getComponent1()).append( ", dataSourceScheme=" + getComponent2()).append( ", dateCode=" + getComponent3()).append( ", time=" + getComponent4() ).append( "]").toString();
    }

}
