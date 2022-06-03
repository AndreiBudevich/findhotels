package util;

import model.Hotel;
import to.Report;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HotelUtil {

    private static final Map<String, String> abbreviatedNamesOfStates;

    static {
        abbreviatedNamesOfStates = new HashMap<>();
        abbreviatedNamesOfStates.put("New York", "NY");
    }

    private HotelUtil() {
    }

    public static Report get (List<Hotel> hotels) {
        Report report = new Report();
        hotels.forEach(hotel -> {
            report.getNames().add(hotel.getName());
            report.getPrices().add(hotel.getPrice());
            report.getAddresses().add(hotel.getAddress().getAddressLine());
        });
        return report;
    }

    public static List<Hotel> getSorted(List<Hotel> hotels, String name, String state) {
        return hotels.stream()
                .filter(hotel -> hotel.getName().toLowerCase().contains(name.toLowerCase()))
                .filter(hotel -> checkState(hotel.getAddress().getState(), state))
                .collect(Collectors.toList());
    }

    private static boolean checkState(String hotelState, String currentState) {
        return hotelState.equalsIgnoreCase(currentState) || hotelState.equalsIgnoreCase(abbreviatedNamesOfStates.get(currentState));
    }
}
