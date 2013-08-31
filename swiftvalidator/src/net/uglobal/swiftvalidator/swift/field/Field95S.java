
package net.uglobal.swiftvalidator.swift.field;



/**
 * Field format : (qualifier)(dataSourceScheme)(typeOfID)(countryCode)(alternateID)
 * 
 * AUTO GENERATED - DO NOT HAND MODIFY
 * Generated on Sun Dec 09 17:22:28 EST 2012
 * 
 */
public class Field95S
    extends net.uglobal.swiftvalidator.swift.field.Field
{


    public Field95S(String validateData, net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
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

    public String getTypeOfID() {
        return getComponent3();
    }

    public String getCountryCode() {
        return getComponent4();
    }

    public String getAlternateID() {
        return getComponent5();
    }

    public String toString() {
        return (new StringBuilder()).append("[" ).append( "qualifier=" + getComponent1()).append( ", dataSourceScheme=" + getComponent2()).append( ", typeOfID=" + getComponent3()).append( ", countryCode=" + getComponent4()).append( ", alternateID=" + getComponent5() ).append( "]").toString();
    }

}
