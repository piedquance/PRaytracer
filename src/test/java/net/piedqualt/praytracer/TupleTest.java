package net.piedqualt.praytracer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class TupleTest {
    Tuple a = new Tuple(1,2,3,4);


    @Test
    void add() {
        assertEquals(a.add(a),2);
    }

    @Test
    void sub() {
    }

    @Test
    void neg() {
    }

    @Test
    void mul() {
    }

    @Test
    void div() {
    }
}