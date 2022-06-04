package util;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class PriceAdapter extends XmlAdapter<String, Long> {

    @Override
    public Long unmarshal(String s) {
        return Long.parseLong(s.replace(" USD per night", ""));
    }

    @Override
    public String marshal(Long l) {
        return l.toString() +
                " USD per night";
    }
}
