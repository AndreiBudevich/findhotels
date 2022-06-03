package util;


import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.StringWriter;

public class XmlUtil {

    private static final StringWriter writer = new StringWriter();

    private XmlUtil() {
    }

    public static <T> T deserializeToXML(String path, Class<T> clazz) {
        return JAXB.unmarshal(new File(path), clazz);
    }

    public static <T> String serializeToXML(T object, Class<T> clazz) {
        try {
            JAXBContext context = JAXBContext.newInstance(clazz);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(object, writer);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return writer.toString();
    }
}
