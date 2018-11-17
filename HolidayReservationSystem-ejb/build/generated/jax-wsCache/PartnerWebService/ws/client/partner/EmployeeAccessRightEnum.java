
package ws.client.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for employeeAccessRightEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="employeeAccessRightEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SYSTEMADMINISTRATOR"/&gt;
 *     &lt;enumeration value="OPERATIONMANAGER"/&gt;
 *     &lt;enumeration value="SALESMANAGER"/&gt;
 *     &lt;enumeration value="GUESTRELATIONOFFICER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "employeeAccessRightEnum")
@XmlEnum
public enum EmployeeAccessRightEnum {

    SYSTEMADMINISTRATOR,
    OPERATIONMANAGER,
    SALESMANAGER,
    GUESTRELATIONOFFICER;

    public String value() {
        return name();
    }

    public static EmployeeAccessRightEnum fromValue(String v) {
        return valueOf(v);
    }

}
