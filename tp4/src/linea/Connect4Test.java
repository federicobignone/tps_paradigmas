package linea;

import org.junit.Test;

import static org.junit.Assert.*;

public class Connect4Test {

    @Test
    public void test1() {
        Linea game = new Linea(1, 1, 'A');


        assertFalse(game.finished());
    }

    @Test
    public void test2() {
        Linea game = new Linea(1, 1, 'A');
        game.playRedkAt(1);
        assertTrue(game.finished());
    }



}