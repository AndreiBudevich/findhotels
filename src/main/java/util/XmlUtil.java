package util;


import model.Hotel;
import model.Hotels;

import javax.xml.bind.*;
import java.io.File;
import java.util.List;

public class XmlUtil {

    public static List<Hotel> deserializeToXML(String path) {
        return JAXB.unmarshal(new File(path), Hotels.class).getHotels();
    }

    private XmlUtil() {
    }
}
