
package servicelocaldb.document.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per cure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="cure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="id_cure" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="id_medic" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="id_user" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element ref="{http://ws.document.servicelocaldb/}medic" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cure", propOrder = {
    "description",
    "duration",
    "idCure",
    "idMedic",
    "idUser",
    "medic"
})
public class Cure {

    protected String description;
    protected Long duration;
    @XmlElement(name = "id_cure")
    protected Long idCure;
    @XmlElement(name = "id_medic")
    protected Long idMedic;
    @XmlElement(name = "id_user")
    protected Long idUser;
    @XmlElement(namespace = "http://ws.document.servicelocaldb/")
    protected Medic medic;

    /**
     * Recupera il valore della proprietà description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Imposta il valore della proprietà description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Recupera il valore della proprietà duration.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDuration() {
        return duration;
    }

    /**
     * Imposta il valore della proprietà duration.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDuration(Long value) {
        this.duration = value;
    }

    /**
     * Recupera il valore della proprietà idCure.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdCure() {
        return idCure;
    }

    /**
     * Imposta il valore della proprietà idCure.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdCure(Long value) {
        this.idCure = value;
    }

    /**
     * Recupera il valore della proprietà idMedic.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdMedic() {
        return idMedic;
    }

    /**
     * Imposta il valore della proprietà idMedic.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdMedic(Long value) {
        this.idMedic = value;
    }

    /**
     * Recupera il valore della proprietà idUser.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdUser() {
        return idUser;
    }

    /**
     * Imposta il valore della proprietà idUser.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdUser(Long value) {
        this.idUser = value;
    }

    /**
     * Recupera il valore della proprietà medic.
     * 
     * @return
     *     possible object is
     *     {@link Medic }
     *     
     */
    public Medic getMedic() {
        return medic;
    }

    /**
     * Imposta il valore della proprietà medic.
     * 
     * @param value
     *     allowed object is
     *     {@link Medic }
     *     
     */
    public void setMedic(Medic value) {
        this.medic = value;
    }

}
