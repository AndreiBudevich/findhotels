package to;

import util.PriceAdapter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.List;

@XmlType(propOrder = {"names", "prices", "addresses"})
@XmlRootElement(name = "Lists")
public class Report {

    private List<String> names;

    private List<Long> prices;

    private List<String> addresses;

    public Report() {
        this.names = new ArrayList<>();
        this.prices = new ArrayList<>();
        this.addresses = new ArrayList<>();
    }

    @XmlElementWrapper(name = "Names", nillable = true)
    @XmlElement(name = "Name")
    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    @XmlElementWrapper(name = "Prices", nillable = true)
    @XmlElement(name = "Price")
    @XmlJavaTypeAdapter(PriceAdapter.class)
    public List<Long> getPrices() {
        return prices;
    }

    public void setPrices(List<Long> prices) {
        this.prices = prices;
    }

    @XmlElementWrapper(name = "Addresses", nillable = true)
    @XmlElement(name = "Address")
    public List<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<String> addresses) {
        this.addresses = addresses;
    }
}
