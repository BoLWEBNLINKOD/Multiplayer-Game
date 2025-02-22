public class Main {
    public static void main(String[] args) {
        Room startRoom = new Room("Start Room", "A dimly lit stone chamber.");
        Room nextRoom = new Room("Hallway", "A long, narrow hallway.");
        startRoom.connectRoom("forward", nextRoom);

        Item sword = new Item("sword");
        startRoom.addItem(sword);

        Player player = new Player(startRoom);
        MUDController controller = new MUDController(player);
        controller.runGameLoop();
    }
}
