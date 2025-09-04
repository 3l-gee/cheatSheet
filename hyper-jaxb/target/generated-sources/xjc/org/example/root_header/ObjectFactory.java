
package org.example.root_header;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example.root_header package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _Name_QNAME = new QName("http://example.org/root_header", "name");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example.root_header
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ROOT }
     * 
     * @return
     *     the new instance of {@link ROOT }
     */
    public ROOT createROOT() {
        return new ROOT();
    }

    /**
     * Create an instance of {@link HeaderType }
     * 
     * @return
     *     the new instance of {@link HeaderType }
     */
    public HeaderType createHeaderType() {
        return new HeaderType();
    }

    /**
     * Create an instance of {@link DataBlock }
     * 
     * @return
     *     the new instance of {@link DataBlock }
     */
    public DataBlock createDataBlock() {
        return new DataBlock();
    }

    /**
     * Create an instance of {@link AcquisitionType }
     * 
     * @return
     *     the new instance of {@link AcquisitionType }
     */
    public AcquisitionType createAcquisitionType() {
        return new AcquisitionType();
    }

    /**
     * Create an instance of {@link DumpType }
     * 
     * @return
     *     the new instance of {@link DumpType }
     */
    public DumpType createDumpType() {
        return new DumpType();
    }

    /**
     * Create an instance of {@link ListOfAcquisitions }
     * 
     * @return
     *     the new instance of {@link ListOfAcquisitions }
     */
    public ListOfAcquisitions createListOfAcquisitions() {
        return new ListOfAcquisitions();
    }

    /**
     * Create an instance of {@link ListOfDumps }
     * 
     * @return
     *     the new instance of {@link ListOfDumps }
     */
    public ListOfDumps createListOfDumps() {
        return new ListOfDumps();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.org/root_header", name = "name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<>(_Name_QNAME, String.class, null, value);
    }

}
