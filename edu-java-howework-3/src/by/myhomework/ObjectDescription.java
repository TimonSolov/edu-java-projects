package by.myhomework;

public class ObjectDescription {
    String name;
    String madeOf;
    String location;

    public ObjectDescription(String name, String madeOf, String location) {
        this.name = name;
        this.madeOf = madeOf;
        this.location = location;
    }

    public void describeItemOnTheFloor() {
        System.out.println("- " + name + " (" + madeOf + "), is located in " + location + ".");
    }

    public void describeItemOnTheCeiling() {
        System.out.println("- " + name + " (" + madeOf + "), is hanging on " + location + ".");
    }

    public void describeItemUnderFeet() {
        System.out.println("- " + name + " (" + madeOf + "), is laying on " + location + ".");
    }


    public void actionsOnChair() {
        System.out.println("On chairs you can do the following: ");
        System.out.println("You can sit on it");
        System.out.println("You can place something on it");
        System.out.println("You can lift it");
        System.out.println("You can break it");

    }

    public void actionsOnLamp() {
        System.out.println("On a lamp you can do the following: ");
        System.out.println("You can switch it on");
        System.out.println("You can switch it off");
        System.out.println("You can break it");
        System.out.println("You can remove it");
        System.out.println("You can swap it");
    }

}

