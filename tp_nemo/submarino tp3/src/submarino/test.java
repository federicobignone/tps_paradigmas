package submarino;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class test {
    @Test
    public void test01PosicionInicial() {
        nemo submarino = new nemo();
        assertEquals("(0, 0, 0)", submarino.posicionActual());
        assertEquals("NORTE", submarino.direccionActual());
    }

    @Test
    public void test02QuedateEnElLugar() {
        nemo submarino = new nemo();
        submarino.Comando("");
        assertEquals("(0, 0, 0)", submarino.posicionActual());
        assertEquals("NORTE", submarino.direccionActual());
    }

    @Test
    public void test03Desender() {
        nemo submarino = new nemo();
        submarino.Comando('d');
        assertEquals("(0, 0, -1)", submarino.posicionActual());
        assertEquals("NORTE", submarino.direccionActual());
    }

    @Test
    public void test04Aesender() {
        nemo submarino = new nemo();
        submarino.Comando('u');
        assertEquals("(0, 0, 0)", submarino.posicionActual());
        assertEquals("NORTE", submarino.direccionActual());
    }
    @Test
    public void test05MoverNorte() {
        nemo submarino = new nemo();
        submarino.Comando('f');
        assertEquals("(0, 1, 0)", submarino.posicionActual());
        assertEquals("NORTE", submarino.direccionActual());
    }
    @Test
    public void test06MoverSur() {
        nemo submarino = new nemo();
        submarino.Comando('l');
        submarino.Comando('l');
        submarino.Comando('f');
        assertEquals("(0, -1, 0)", submarino.posicionActual());
        assertEquals("SUR", submarino.direccionActual());
    }
    @Test
    public void test07MoverEste() {
        nemo submarino = new nemo();
        submarino.Comando('r');
        submarino.Comando('f');
        assertEquals("(1, 0, 0)", submarino.posicionActual());
        assertEquals("ESTE", submarino.direccionActual());
    }
    @Test
    public void test08MoverOeste() {
        nemo submarino = new nemo();
        submarino.Comando('l');
        submarino.Comando('f');
        assertEquals("(-1, 0, 0)", submarino.posicionActual());
        assertEquals("OESTE", submarino.direccionActual());
    }
    @Test
    public void test09liberarICBM() {
        nemo submarino = new nemo();
        assertEquals( submarino.Comando('m'), "Nemo libera la cápsula");

    }
    @Test
    public void test10liberarICBMExplota() {
        nemo submarino = new nemo();
        submarino.Comando('d');
        submarino.Comando('d');
        assertEquals("(0, 0, -2)", submarino.posicionActual());
        try {
            submarino.Comando('m');
        } catch (Exception e) {
            assertEquals("Nemo explota", e.getMessage());
        }

    }
}

