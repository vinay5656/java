package complexDataStructure;


import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class ComplexDataStructure {

    public static String[] vehicles = { "ambulance", "helicopter", "lifeboat" };

    public static String[][] drivers = { 
        { "Fred", "Sue", "Pete" },
            { "Sue", "Richard", "Bob", "Fred" }, 
            { "Pete", "Mary", "Bob" }, };

    public static void main(String[] args) {

        Map<String, Set<String>> personnel = new HashMap<String, Set<String>>();

        for (int i = 0; i < vehicles.length; i++) {
            String vehicle = vehicles[i];
            //Taking Each list with respact to index
            String[] driversList = drivers[i];

            // Creating LinkedHashSet to retain the same order of list as we added
            Set<String> driverSet = new LinkedHashSet<String>();

            for (String driver : driversList) {
            	// Added the list of driver to set
                driverSet.add(driver);
            }

            // Creating the final data structure by adding vehicle as key or diverSet as value to map 
            personnel.put(vehicle, driverSet);
            // Using this data structure i can get which driver can drive what vehicle.
        }

        { // Brackets just to scope driversList variable so can use again later
            // Example usage
            Set<String> driversList = personnel.get("helicopter");

            for (String driver : driversList) {
                System.out.println(driver);
            }
        }

        // Iterate through whole thing
        for (String vehicle : personnel.keySet()) {
            System.out.print(vehicle);
            System.out.print(": ");
            Set<String> driversList = personnel.get(vehicle);

            for (String driver : driversList) {
                System.out.print(driver);
                System.out.print(" ");
            }
            
            System.out.println();
        }
    }

}

