package com.davegreen;

public class Main
{

    public static void main(String[] args)
    {
        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");

        Ceiling ceiling = new Ceiling(8, "White");

        Sink sink = new Sink(2, true, true);

        DiningTable diningTable = new DiningTable(6, false);

        Kitchen kitchen = new Kitchen(wall1, wall2, wall3, wall4, ceiling, sink, diningTable);

        kitchen.washDishes();

        kitchen.getDiningTable().isTableCleared();

    }
}
