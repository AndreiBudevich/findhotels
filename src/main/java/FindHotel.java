import model.Hotel;
import model.Hotels;
import to.Report;
import util.HotelUtil;
import util.XmlUtil;

import java.util.List;

public class FindHotel {
    public static void main(String[] args) {
        String path = args[0];

        List<Hotel> allHotels = XmlUtil.deserializeToXML(path, Hotels.class).getHotels();

        List<Hotel> sortedHotels = HotelUtil.getSorted(allHotels, "Hilton", "New York");

        Report report = HotelUtil.get(sortedHotels);

        String reportSerialize = XmlUtil.serializeToXML(report, Report.class);

        System.out.println(reportSerialize);
    }
}
