package fr.domurado;

import fr.domurado.file.FileReader;
import fr.domurado.model.Lawn;
import fr.domurado.model.Mower;

public class Main {

    public static void main(String[] args) {
        Lawn lawn = FileReader.readFile("test.txt");
        for (Mower mower : lawn.getMowerList()) {
            mower.move(lawn.getLength(), lawn.getWidth());
        }
    }
}
