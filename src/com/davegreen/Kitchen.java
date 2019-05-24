package com.davegreen;

/**
 * Created by daveg on 16/06/2017.
 */
public class Kitchen
{
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;

    private Sink sink;
    private DiningTable diningTable;

    public Kitchen(Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Sink sink, DiningTable diningTable)
    {
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.sink = sink;
        this.diningTable = diningTable;
    }

    public void washDishes()
    {
        sink.dirtyDishes();
        System.out.println("Kitchen class called. washing dishes");
    }

    public DiningTable getDiningTable()
    {
        return this.diningTable;
    }
}
