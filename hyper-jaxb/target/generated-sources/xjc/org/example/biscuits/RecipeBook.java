
package org.example.biscuits;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.Equals;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCode;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.JAXBEqualsStrategy;
import org.jvnet.basicjaxb.lang.JAXBHashCodeStrategy;
import org.jvnet.basicjaxb.lang.JAXBToStringStrategy;
import org.jvnet.basicjaxb.lang.ToString;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.DefaultRootObjectLocator;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="recipe" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="ingredients" maxOccurs="unbounded">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             <element name="amount" type="{http://example.org/biscuits}IngredientAmount"/>
 *                             <element name="allergens" type="{http://example.org/biscuits}AllergenList" minOccurs="0"/>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="sweetener" type="{http://example.org/biscuits}SweetenerChoice" minOccurs="0"/>
 *                   <element name="steps" type="{http://example.org/biscuits}RecipeStep" maxOccurs="unbounded"/>
 *                   <element name="tray" type="{http://example.org/biscuits}TrayType"/>
 *                   <element ref="{http://example.org/biscuits}biscuit"/>
 *                   <element name="recipeNotes" type="{http://example.org/biscuits}Notes" minOccurs="0"/>
 *                   <element name="biscuitNotes" type="{http://example.org/biscuits}Notes" minOccurs="0"/>
 *                 </sequence>
 *                 <attGroup ref="{http://example.org/biscuits}BakeMetadata"/>
 *                 <attribute name="difficulty" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "recipe"
})
@XmlRootElement(name = "recipeBook")
@Entity(name = "RecipeBook")
@Table(name = "RECIPE_BOOK")
@Inheritance(strategy = InheritanceType.JOINED)
public class RecipeBook implements Serializable, Equals, HashCode, ToString
{

    private static final long serialVersionUID = 20250909L;
    @XmlElement(required = true)
    protected List<Recipe> recipe;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the recipe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recipe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecipe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Recipe }
     * 
     * 
     */
    @OneToMany(targetEntity = Recipe.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "RECIPE_RECIPE_BOOK_HJID")
    public List<Recipe> getRecipe() {
        if (recipe == null) {
            recipe = new ArrayList<>();
        }
        return this.recipe;
    }

    /**
     * 
     * 
     */
    public void setRecipe(List<Recipe> recipe) {
        this.recipe = recipe;
    }

    @Transient
    public boolean isSetRecipe() {
        return ((this.recipe!= null)&&(!this.recipe.isEmpty()));
    }

    public void unsetRecipe() {
        this.recipe = null;
    }

    /**
     * Gets the value of the hjid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Id
    @Column(name = "HJID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getHjid() {
        return hjid;
    }

    /**
     * Sets the value of the hjid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHjid(Long value) {
        this.hjid = value;
    }

    @Override
    public boolean equals(Object object) {
        ObjectLocator thisLocator = null;
        ObjectLocator thatLocator = null;
        final EqualsStrategy strategy = JAXBEqualsStrategy.getInstance();
        if (strategy.isDebugEnabled()) {
            thisLocator = new DefaultRootObjectLocator(this);
            thatLocator = new DefaultRootObjectLocator(object);
        }
        return equals(thisLocator, thatLocator, object, strategy);
    }

    @Override
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final RecipeBook that = ((RecipeBook) object);
        {
            boolean lhsFieldIsSet = this.isSetRecipe();
            boolean rhsFieldIsSet = that.isSetRecipe();
            List<Recipe> lhsField;
            lhsField = (this.isSetRecipe()?this.getRecipe():null);
            List<Recipe> rhsField;
            rhsField = (that.isSetRecipe()?that.getRecipe():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "recipe", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "recipe", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        ObjectLocator theLocator = null;
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.getInstance();
        if (strategy.isDebugEnabled()) {
            theLocator = new DefaultRootObjectLocator(this);
        }
        return this.hashCode(theLocator, strategy);
    }

    @Override
    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            boolean theFieldIsSet = this.isSetRecipe();
            List<Recipe> theField;
            theField = (this.isSetRecipe()?this.getRecipe():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "recipe", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public String toString() {
        ObjectLocator theLocator = null;
        final ToStringStrategy strategy = JAXBToStringStrategy.getInstance();
        if (strategy.isTraceEnabled()) {
            theLocator = new DefaultRootObjectLocator(this);
        }
        final StringBuilder buffer = new StringBuilder();
        append(theLocator, buffer, strategy);
        return buffer.toString();
    }

    @Override
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            boolean theFieldIsSet = this.isSetRecipe();
            List<Recipe> theField;
            theField = (this.isSetRecipe()?this.getRecipe():null);
            strategy.appendField(locator, this, "recipe", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
