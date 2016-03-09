package fr.domurado.file;

import fr.domurado.model.Lawn;
import fr.domurado.model.Mower;
import fr.domurado.model.Orientation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FileReaderTest {

    @Test
    public void testReadFile() throws Exception {
        Lawn lawn = FileReader.readFile("test.txt");
        Assert.assertEquals(5, lawn.getLength());
        Assert.assertEquals(5, lawn.getWidth());
        Assert.assertEquals(2, lawn.getMowerList().size());

        Mower mower1 = lawn.getMowerList().get(0);
        Assert.assertEquals(1, mower1.getX());
        Assert.assertEquals(2, mower1.getY());
        Assert.assertEquals(Orientation.N, mower1.getOrientation());

        Mower mower2 = lawn.getMowerList().get(1);
        Assert.assertEquals(3, mower2.getX());
        Assert.assertEquals(3, mower2.getY());
        Assert.assertEquals(Orientation.E, mower2.getOrientation());
    }
}