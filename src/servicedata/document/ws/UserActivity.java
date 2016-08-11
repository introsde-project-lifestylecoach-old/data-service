
package matteogabburo.document.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per userActivity complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="userActivity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activities" type="{http://ws.document.matteogabburo/}activity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="id_activity" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="id_user" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="id_useractivity" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userActivity", propOrder = {
    "activities",
    "idActivity",
    "idUser",
    "idUseractivity"
})
public class UserActivity {

    @XmlElement(nillable = true)
    protected List<Activity> activities;
    @XmlElement(name = "id_activity")
    protected Long idActivity;
    @XmlElement(name = "id_user")
    protected Long idUser;
    @XmlElement(name = "id_useractivity")
    protected Long idUseractivity;

    /**
     * Gets the value of the activities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Activity }
     * 
     * 
     */
    public List<Activity> getActivities() {
        if (activities == null) {
            activities = new ArrayList<Activity>();
        }
        return this.activities;
    }

    /**
     * Recupera il valore della proprietà idActivity.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdActivity() {
        return idActivity;
    }

    /**
     * Imposta il valore della proprietà idActivity.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdActivity(Long value) {
        this.idActivity = value;
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
     * Recupera il valore della proprietà idUseractivity.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdUseractivity() {
        return idUseractivity;
    }

    /**
     * Imposta il valore della proprietà idUseractivity.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdUseractivity(Long value) {
        this.idUseractivity = value;
    }

}
