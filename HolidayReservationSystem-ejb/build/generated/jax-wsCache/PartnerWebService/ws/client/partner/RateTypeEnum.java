
package ws.client.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rateTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="rateTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PUBLISHED"/&gt;
 *     &lt;enumeration value="NORMAL"/&gt;
 *     &lt;enumeration value="PEAK"/&gt;
 *     &lt;enumeration value="PROMOTION"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "rateTypeEnum")
@XmlEnum
public enum RateTypeEnum {

    PUBLISHED,
    NORMAL,
    PEAK,
    PROMOTION;

    public String value() {
        return name();
    }

    public static RateTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
