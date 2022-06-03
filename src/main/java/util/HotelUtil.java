package util;

import model.Hotel;

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

    public static List<Hotel> getSorted(List<Hotel> hotels, String name, String state) {
        return hotels.stream()
                .filter(hotel -> hotel.getName().toLowerCase().contains(name.toLowerCase()))
                .filter(hotel -> checkState(hotel.getAddress().getState(), state))
                .collect(Collectors.toList());
    }

    private static boolean checkState(String hotelState, String currentState) {
        return hotelState.equalsIgnoreCase(currentState) || hotelState.equalsIgnoreCase(abbreviatedNamesOfStates.get(currentState));
    }

    private HotelUtil() {
    }
}
