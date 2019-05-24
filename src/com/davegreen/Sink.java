package com.davegreen;

/**
 * Created by daveg on 16/06/2017.
 */
public class Sink
{
    private int taps;
    private boolean plug;
    private boolean basin;

    public Sink(int taps, boolean plug, boolean basin)
    {
        this.taps = taps;
        this.plug = plug;
        this.basin = basin;
    }

    public void dirtyDishes()
    {
        System.out.println("Sink class called. These dishes need washed!");
    }

    public int getTaps()
    {
        return taps;
    }

    public boolean isPlug()
    {
        return plug;
    }

    public boolean isBasin()
    {
        return basin;
    }
}
