
package servicelocaldb.document.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per health complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="health">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="calories_per_meal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="daily_steps" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="id_health" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="id_user" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="pression" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="pulse" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="sleep_hours" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="weigth" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "health", propOrder = {
    "caloriesPerMeal",
    "dailySteps",
    "height",
    "idHealth",
    "idUser",
    "pression",
    "pulse",
    "sleepHours",
    "weigth"
})
public class Health {

    @XmlElement(name = "calories_per_meal")
    protected Integer caloriesPerMeal;
    @XmlElement(name = "daily_steps")
    protected Integer dailySteps;
    protected Float height;
    @XmlElement(name = "id_health")
    protected Long idHealth;
    @XmlElement(name = "id_user")
    protected Long idUser;
    protected Float pression;
    protected Float pulse;
    @XmlElement(name = "sleep_hours")
    protected Float sleepHours;
    protected Float weigth;

    /**
     * Recupera il valore della proprietà caloriesPerMeal.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCaloriesPerMeal() {
        return caloriesPerMeal;
    }

    /**
     * Imposta il valore della proprietà caloriesPerMeal.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCaloriesPerMeal(Integer value) {
        this.caloriesPerMeal = value;
    }

    /**
     * Recupera il valore della proprietà dailySteps.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDailySteps() {
        return dailySteps;
    }

    /**
     * Imposta il valore della proprietà dailySteps.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDailySteps(Integer value) {
        this.dailySteps = value;
    }

    /**
     * Recupera il valore della proprietà height.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHeight() {
        return height;
    }

    /**
     * Imposta il valore della proprietà height.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHeight(Float value) {
        this.height = value;
    }

    /**
     * Recupera il valore della proprietà idHealth.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdHealth() {
        return idHealth;
    }

    /**
     * Imposta il valore della proprietà idHealth.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdHealth(Long value) {
        this.idHealth = value;
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
     * Recupera il valore della proprietà pression.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPression() {
        return pression;
    }

    /**
     * Imposta il valore della proprietà pression.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPression(Float value) {
        this.pression = value;
    }

    /**
     * Recupera il valore della proprietà pulse.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPulse() {
        return pulse;
    }

    /**
     * Imposta il valore della proprietà pulse.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPulse(Float value) {
        this.pulse = value;
    }

    /**
     * Recupera il valore della proprietà sleepHours.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSleepHours() {
        return sleepHours;
    }

    /**
     * Imposta il valore della proprietà sleepHours.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSleepHours(Float value) {
        this.sleepHours = value;
    }

    /**
     * Recupera il valore della proprietà weigth.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getWeigth() {
        return weigth;
    }

    /**
     * Imposta il valore della proprietà weigth.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setWeigth(Float value) {
        this.weigth = value;
    }

}
