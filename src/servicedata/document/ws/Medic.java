
package matteogabburo.document.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per medic complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="medic">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_medic" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="mail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "medic", propOrder = {
    "idMedic",
    "mail",
    "name",
    "telephone"
})
public class Medic {

    @XmlElement(name = "id_medic")
    protected Long idMedic;
    protected String mail;
    protected String name;
    protected String telephone;

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
     * Recupera il valore della proprietà mail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMail() {
        return mail;
    }

    /**
     * Imposta il valore della proprietà mail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMail(String value) {
        this.mail = value;
    }

    /**
     * Recupera il valore della proprietà name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Imposta il valore della proprietà name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Recupera il valore della proprietà telephone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * Imposta il valore della proprietà telephone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephone(String value) {
        this.telephone = value;
    }

}
