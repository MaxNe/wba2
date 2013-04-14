//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.04.14 um 05:36:16 PM CEST 
//


package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Titel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Untertitel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Zutat" type="{}Zutatentyp" maxOccurs="unbounded"/>
 *         &lt;element name="Zubereitung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{}Zeit"/>
 *         &lt;element ref="{}Schwierigkeit"/>
 *         &lt;element ref="{}Brennwert" minOccurs="0"/>
 *         &lt;element ref="{}Kommentar" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "titel",
    "untertitel",
    "zutat",
    "zubereitung",
    "zeit",
    "schwierigkeit",
    "brennwert",
    "kommentar"
})
@XmlRootElement(name = "Rezept")
public class Rezept {

    @XmlElement(name = "Titel", required = true)
    protected String titel;
    @XmlElement(name = "Untertitel")
    protected String untertitel;
    @XmlElement(name = "Zutat", required = true)
    protected List<Zutatentyp> zutat;
    @XmlElement(name = "Zubereitung")
    protected String zubereitung;
    @XmlElement(name = "Zeit", required = true)
    protected Zeit zeit;
    @XmlElement(name = "Schwierigkeit", required = true)
    protected Schwierigkeit schwierigkeit;
    @XmlElement(name = "Brennwert")
    protected Brennwert brennwert;
    @XmlElement(name = "Kommentar")
    protected List<Kommentar> kommentar;

    /**
     * Ruft den Wert der titel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitel() {
        return titel;
    }

    /**
     * Legt den Wert der titel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitel(String value) {
        this.titel = value;
    }

    /**
     * Ruft den Wert der untertitel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUntertitel() {
        return untertitel;
    }

    /**
     * Legt den Wert der untertitel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUntertitel(String value) {
        this.untertitel = value;
    }

    /**
     * Gets the value of the zutat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zutat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZutat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Zutatentyp }
     * 
     * 
     */
    public List<Zutatentyp> getZutat() {
        if (zutat == null) {
            zutat = new ArrayList<Zutatentyp>();
        }
        return this.zutat;
    }

    /**
     * Ruft den Wert der zubereitung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZubereitung() {
        return zubereitung;
    }

    /**
     * Legt den Wert der zubereitung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZubereitung(String value) {
        this.zubereitung = value;
    }

    /**
     * Ruft den Wert der zeit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Zeit }
     *     
     */
    public Zeit getZeit() {
        return zeit;
    }

    /**
     * Legt den Wert der zeit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Zeit }
     *     
     */
    public void setZeit(Zeit value) {
        this.zeit = value;
    }

    /**
     * Ruft den Wert der schwierigkeit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Schwierigkeit }
     *     
     */
    public Schwierigkeit getSchwierigkeit() {
        return schwierigkeit;
    }

    /**
     * Legt den Wert der schwierigkeit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Schwierigkeit }
     *     
     */
    public void setSchwierigkeit(Schwierigkeit value) {
        this.schwierigkeit = value;
    }

    /**
     * Ruft den Wert der brennwert-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Brennwert }
     *     
     */
    public Brennwert getBrennwert() {
        return brennwert;
    }

    /**
     * Legt den Wert der brennwert-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Brennwert }
     *     
     */
    public void setBrennwert(Brennwert value) {
        this.brennwert = value;
    }

    /**
     * Gets the value of the kommentar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kommentar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKommentar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Kommentar }
     * 
     * 
     */
    public List<Kommentar> getKommentar() {
        if (kommentar == null) {
            kommentar = new ArrayList<Kommentar>();
        }
        return this.kommentar;
    }

}
