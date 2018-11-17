
package ws.client.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="statusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AVAILABLE"/&gt;
 *     &lt;enumeration value="NOTAVAILABLE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "statusEnum")
@XmlEnum
public enum StatusEnum {

    AVAILABLE,
    NOTAVAILABLE;

    public String value() {
        return name();
    }

    public static StatusEnum fromValue(String v) {
        return valueOf(v);
    }

}
