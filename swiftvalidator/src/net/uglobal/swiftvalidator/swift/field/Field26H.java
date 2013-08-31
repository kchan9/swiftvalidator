
package net.uglobal.swiftvalidator.swift.field;



/**
 * Field format : (collateralType)
 * 
 * AUTO GENERATED - DO NOT HAND MODIFY
 * Generated on Sun Dec 09 17:22:28 EST 2012
 * 
 */
public class Field26H
    extends net.uglobal.swiftvalidator.swift.field.Field
{


    public Field26H(String validateData, net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
        super(validateData, xmlField);
    }

    @Override
    protected void parse() {
        addComponents(net.uglobal.swiftvalidator.swift.field.FieldComponentParseUtil.parse(validateData, getContentFormat()));
    }

    public String getCollateralType() {
        return getComponent1();
    }

    public String toString() {
        return (new StringBuilder()).append("[" ).append( "collateralType=" + getComponent1() ).append( "]").toString();
    }

}
