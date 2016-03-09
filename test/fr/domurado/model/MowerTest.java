package fr.domurado.model;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MowerTest {

    private Mower mower;

    @Before
    public void setUp() throws Exception {
        mower = new Mower(1, 1, Orientation.N, new char[]{'A', 'G', 'A', 'G', 'A', 'A', 'G', 'A'});
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testMove() throws Exception {
        mower.move(2, 3);
        Assert.assertEquals(1, mower.getX());
        Assert.assertEquals(0, mower.getY());
        Assert.assertEquals(Orientation.E, mower.getOrientation());
    }

    @Test
    public void testMoveError() throws Exception {
        mower.move(1, 1);
        Assert.assertEquals(1, mower.getX());
        Assert.assertEquals(0, mower.getY());
        Assert.assertEquals(Orientation.E, mower.getOrientation());
    }
}