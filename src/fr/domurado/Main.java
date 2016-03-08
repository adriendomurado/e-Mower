package fr.domurado;

import fr.domurado.file.FileReader;
import fr.domurado.model.Lawn;

public class Main {

    public static void main(String[] args) {
        Lawn lawn = FileReader.readFile("test.txt");
    }
}
