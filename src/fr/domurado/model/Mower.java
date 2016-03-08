package fr.domurado.model;

import java.util.List;

/**
 * Represents a Mower
 */
public class Mower {

    private int x;

    private int y;

    private Orientation orientation;

    private char[] instructions;

    public Mower() {
    }

    public Mower(int x, int y, Orientation orientation, char[] instructions) {
        this.x = x;
        this.y = y;
        this.orientation = orientation;
        this.instructions = instructions;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

    public char[] getInstructions() {
        return instructions;
    }

    public void setInstructions(char[] instructions) {
        this.instructions = instructions;
    }
}
