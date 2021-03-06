import java.util.Map;
import java.util.HashMap;

public class Location {
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exists;

    public Location(int locationID, String description) {
        this.locationID = locationID;
        this.description = description;
        this.exists = new HashMap<>();
        this.exists.put("Q",0);
    }

    public void addExits(String direction, int location){
        exists.put(direction, location);

    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExists() {
        return exists;
    }
}
