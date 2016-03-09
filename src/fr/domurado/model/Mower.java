package fr.domurado.model;

/**
 * Represents a Mower
 */
public class Mower {

    private int x;

    private int y;

    private Orientation orientation;

    private char[] instructions;

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

    public void move(int boundaryX, int boundaryY) {
        for (char instruction : instructions) {
            switch (instruction) {
                case 'A':
                    goForward(boundaryX, boundaryY);
                    break;
                case 'G':
                    turnLeft();
                    break;
                case 'D':
                    turnRight();
                    break;
                default:
                    break;
            }
        }
    }

    private void turnRight() {
        switch (orientation) {
            case N:
                setOrientation(Orientation.E);
                break;
            case E:
                setOrientation(Orientation.S);
                break;
            case W:
                setOrientation(Orientation.N);
                break;
            case S:
                setOrientation(Orientation.W);
                break;
        }
    }

    private void turnLeft() {
        switch (orientation) {
            case N:
                setOrientation(Orientation.W);
                break;
            case E:
                setOrientation(Orientation.N);
                break;
            case W:
                setOrientation(Orientation.S);
                break;
            case S:
                setOrientation(Orientation.E);
                break;
        }
    }

    private void goForward(int boundaryX, int boundaryY) {
        switch (orientation) {
            case N:
                if (getY() + 1 > boundaryY) {
                    // we try to go out of the lawn
                    System.err.println("Move not executed, mower tried to go from (" + getX() + "," + getY() + ") to (" + getX() + "," + (getY() + 1) + "), which is out of bounds.");
                } else {
                    setY(getY() + 1);
                }
                break;
            case E:
                if (getX() + 1 > boundaryX) {
                    // we try to go out of the lawn
                    System.err.println("Move not executed, mower tried to go from (" + getX() + "," + getY() + ") to (" + (getX() + 1) + "," + getY() + "), which is out of bounds.");
                } else {
                    setX(getX() + 1);
                }
                break;
            case W:
                if (getX() - 1 < 0) {
                    // we try to go out of the lawn
                    System.err.println("Move not executed, mower tried to go from (" + getX() + "," + getY() + ") to (" + (getX() - 1) + "," + getY() + "), which is out of bounds.");
                } else {
                    setX(getX() - 1);
                }
                break;
            case S:
                if (getY() - 1 < 0) {
                    // we try to go out of the lawn
                    System.err.println("Move not executed, mower tried to go from (" + getX() + "," + getY() + ") to (" + getX() + "," + (getY() - 1) + "), which is out of bounds.");
                } else {
                    setY(getY() - 1);
                }
                break;
            default:
                System.err.println("Unknown orientation " + orientation + " ! Error in configuration file");
        }
    }

    @Override
    public String toString() {
        return "Mower{" +
                "x=" + x +
                ", y=" + y +
                ", orientation=" + orientation +
                '}';
    }
}
