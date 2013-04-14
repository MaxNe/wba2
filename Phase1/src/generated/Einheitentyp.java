//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.04.14 um 05:36:16 PM CEST 
//


package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Einheitentyp.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="Einheitentyp">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Gramm"/>
 *     &lt;enumeration value="Kilogramm"/>
 *     &lt;enumeration value="Teeloeffel"/>
 *     &lt;enumeration value="Essloeffel"/>
 *     &lt;enumeration value="Tasse"/>
 *     &lt;enumeration value="Milliliter"/>
 *     &lt;enumeration value="Liter"/>
 *     &lt;enumeration value="Zeniliter"/>
 *     &lt;enumeration value="Packung"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Einheitentyp")
@XmlEnum
public enum Einheitentyp {

    @XmlEnumValue("Gramm")
    GRAMM("Gramm"),
    @XmlEnumValue("Kilogramm")
    KILOGRAMM("Kilogramm"),
    @XmlEnumValue("Teeloeffel")
    TEELOEFFEL("Teeloeffel"),
    @XmlEnumValue("Essloeffel")
    ESSLOEFFEL("Essloeffel"),
    @XmlEnumValue("Tasse")
    TASSE("Tasse"),
    @XmlEnumValue("Milliliter")
    MILLILITER("Milliliter"),
    @XmlEnumValue("Liter")
    LITER("Liter"),
    @XmlEnumValue("Zeniliter")
    ZENILITER("Zeniliter"),
    @XmlEnumValue("Packung")
    PACKUNG("Packung");
    private final String value;

    Einheitentyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Einheitentyp fromValue(String v) {
        for (Einheitentyp c: Einheitentyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
