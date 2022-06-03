import model.Hotel;
import util.HotelUtil;
import util.XmlUtil;

import java.util.List;

public class FindHotel {
    public static void main(String[] args){
        String path = args[0];

        List<Hotel> allHotels = XmlUtil.deserializeToXML(path);

        List<Hotel> sortedHotels =  HotelUtil.getSorted(allHotels, "Hilton", "New York");
    }
}
