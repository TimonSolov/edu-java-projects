import by.myhomework.ObjectDescription;
import by.myhomework.SeparatorItem;
import by.myhomework.myRoom;

public class Main {
    public static void main(String[] args) {
//      Создать программу, которая описывает вашу комнату и три объекта в ней

        SeparatorItem separator = new SeparatorItem();
        myRoom.showTheRoom();

        separator.doSeparation();
        System.out.println("Brief info on my room:");
        ObjectDescription desk = new ObjectDescription("Office table", "wooden", "next to window");
        ObjectDescription chair = new ObjectDescription("Office chair", "plastic", "next to a table");
        ObjectDescription lamp = new ObjectDescription("Ceiling lamp", "glass", "the ceiling");
        ObjectDescription rug = new ObjectDescription("Woolen rug", "wool", "on the floor");

        separator.doSeparation();
        System.out.println("Description for the separate units:");
        desk.describeItemOnTheFloor();
        chair.describeItemOnTheFloor();
        lamp.describeItemOnTheCeiling();
        rug.describeItemUnderFeet();

        separator.doSeparation();
        System.out.println("What can you do on units:");
        chair.actionsOnChair();
        separator.doSeparation();
        lamp.actionsOnLamp();
        separator.doSeparation();
    }
}