package fr.domurado.file;

import fr.domurado.model.Lawn;
import fr.domurado.model.Mower;
import fr.domurado.model.Orientation;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Utility class to read the entry file
 */
public class FileReader {
    public static Lawn readFile(String fileName) {
        Lawn lawn = new Lawn();

        Path path = Paths.get(fileName);

        int nbLines = 1;

        try {
            Scanner scanner = new Scanner(path);
            while (scanner.hasNextLine()) {
                if (nbLines == 1) {
                    // reading the definition of the lawn
                    lawn.setLength(scanner.nextInt());
                    lawn.setHeight(scanner.nextInt());
                } else if (nbLines % 2 == 0) {
                    // reading the initial position & orientation of mower
                    int x = scanner.nextInt();
                    int y = scanner.nextInt();
                    Orientation orientation;
                    String orientationString = scanner.next();
                    switch (orientationString) {
                        case "N":
                            orientation = Orientation.N;
                            break;
                        case "E":
                            orientation = Orientation.E;
                            break;
                        case "W":
                            orientation = Orientation.W;
                            break;
                        case "S":
                            orientation = Orientation.S;
                            break;
                        default:
                            orientation = Orientation.N;
                            break;
                    }

                    scanner.nextLine();
                    nbLines++;
                    // reading the instructions of mower
                    char [] instructions = scanner.next().toCharArray();

                    Mower mower = new Mower(x, y, orientation, instructions);
                    lawn.getMowerList().add(mower);
                }
                nbLines++;
            }
        } catch (IOException e) {
            System.err.println("Error while opening file " + fileName);
            e.printStackTrace();
        }

        return lawn;
    }
}
