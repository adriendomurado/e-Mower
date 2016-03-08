package fr.domurado.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a lawn
 */
public class Lawn {

    private int length;

    private int height;

    private List<Mower> mowerList;

    public Lawn() {
        mowerList = new ArrayList<>();
    }

    public Lawn(int length, int height) {
        this.length = length;
        this.height = height;
        mowerList = new ArrayList<>();
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public List<Mower> getMowerList() {
        return mowerList;
    }

    public void setMowerList(List<Mower> mowerList) {
        this.mowerList = mowerList;
    }
}
