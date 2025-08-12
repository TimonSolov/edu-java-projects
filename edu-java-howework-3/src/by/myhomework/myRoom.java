package by.myhomework;
import by.myhomework.ObjectDescription;
import org.w3c.dom.ls.LSOutput;

public class myRoom {
    String roomName = "My room";
    int length = 100;
    int width = 200;
    int height = 500;



    public static void showTheRoom(){
        ObjectDescription desk = new ObjectDescription("Office table", "wooden", "next to window");
        ObjectDescription chair = new ObjectDescription("Office chair", "plastic", "next to a table");
        ObjectDescription lamp = new ObjectDescription("Ceiling lamp", "glass", "the ceiling");
        ObjectDescription rug = new ObjectDescription("Woolen rug", "wool", "on the floor");
        System.out.println("My room has " + desk + " and " + chair + " and " + lamp + " and " + rug);
    }

}
