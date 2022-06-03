package to;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlType(propOrder = {"names", "prices", "addresses"})
@XmlRootElement(name = "Lists")
public class Report {

    private List<String> names;

    private List<String> prices;

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
    public List<String> getPrices() {
        return prices;
    }

    public void setPrices(List<String> prices) {
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
