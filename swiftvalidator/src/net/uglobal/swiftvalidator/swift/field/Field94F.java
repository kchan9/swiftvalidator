
package net.uglobal.swiftvalidator.swift.field;



/**
 * Field format : (qualifier)(placeCode)(identifierCode)
 * 
 * AUTO GENERATED - DO NOT HAND MODIFY
 * Generated on Sun Dec 09 17:22:28 EST 2012
 * 
 */
public class Field94F
    extends net.uglobal.swiftvalidator.swift.field.Field
{


    public Field94F(String validateData, net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
        super(validateData, xmlField);
    }

    @Override
    protected void parse() {
        addComponents(net.uglobal.swiftvalidator.swift.field.FieldComponentParseUtil.parse(validateData, getContentFormat()));
    }

    public String getQualifier() {
        return getComponent1();
    }

    public String getPlaceCode() {
        return getComponent2();
    }

    public String getIdentifierCode() {
        return getComponent3();
    }

    public String toString() {
        return (new StringBuilder()).append("[" ).append( "qualifier=" + getComponent1()).append( ", placeCode=" + getComponent2()).append( ", identifierCode=" + getComponent3() ).append( "]").toString();
    }

}
