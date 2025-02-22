import java.util.HashMap;
import java.util.Map;

public class Room {
    private String name;
    private String description;
    private Map<String, Room> connections;
    private Map<String, Item> items;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
        this.connections = new HashMap<>();
        this.items = new HashMap<>();
    }

    public void connectRoom(String direction, Room room) {
        connections.put(direction, room);
    }

    public Room getConnectedRoom(String direction) {
        return connections.get(direction);
    }

    public void addItem(Item item) {
        items.put(item.getName().toLowerCase(), item);
    }

    public Item getItem(String itemName) {
        return items.get(itemName.toLowerCase());
    }

    public void removeItem(Item item) {
        items.remove(item.getName().toLowerCase());
    }

    public String describe() {
        StringBuilder desc = new StringBuilder();
        desc.append("Room: ").append(name).append("\n").append(description).append("\nItems here: ");
        if (items.isEmpty()) {
            desc.append("none");
        } else {
            desc.append(String.join(", ", items.keySet()));
        }
        return desc.toString();
    }
}
