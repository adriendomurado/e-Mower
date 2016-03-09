package fr.domurado.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a lawn
 */
public class Lawn {

    private int length;

    private int width;

    private List<Mower> mowerList;

    public Lawn() {
        mowerList = new ArrayList<>();
    }

    public Lawn(int length, int width) {
        this.length = length;
        this.width = width;
        mowerList = new ArrayList<>();
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public List<Mower> getMowerList() {
        return mowerList;
    }

    public void setMowerList(List<Mower> mowerList) {
        this.mowerList = mowerList;
    }
}
