
package net.uglobal.swiftvalidator.swift.field;



/**
 * Field format : (relatedReference)
 * 
 * AUTO GENERATED - DO NOT HAND MODIFY
 * Generated on Sun Dec 09 17:22:28 EST 2012
 * 
 */
public class Field21
    extends net.uglobal.swiftvalidator.swift.field.Field
{


    public Field21(String validateData, net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
        super(validateData, xmlField);
    }

    @Override
    protected void parse() {
        addComponents(net.uglobal.swiftvalidator.swift.field.FieldComponentParseUtil.parse(validateData, getContentFormat()));
    }

    public String getRelatedReference() {
        return getComponent1();
    }

    public String toString() {
        return (new StringBuilder()).append("[" ).append( "relatedReference=" + getComponent1() ).append( "]").toString();
    }

}
