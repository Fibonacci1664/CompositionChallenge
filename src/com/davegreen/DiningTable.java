package com.davegreen;

import java.util.Set;

/**
 * Created by daveg on 16/06/2017.
 */
public class DiningTable
{
    private int chairs;
    private boolean tableCleared;

    public DiningTable(int chairs, boolean tableCleared)
    {
        this.chairs = chairs;
        this.tableCleared = tableCleared;
    }

    public int getChairs()
    {
        return chairs;
    }

    public void isTableCleared()
    {
        System.out.println("Dining table class called. The table has not been cleared yet!");
    }
}
