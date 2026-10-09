package test;

import patron.SistemaSalud;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertSame;

public class SistemaSaludTest {

    @Test
    public void testSingleton() {

        SistemaSalud s1 =
                SistemaSalud.getInstancia();

        SistemaSalud s2 =
                SistemaSalud.getInstancia();

        assertSame(s1, s2);
    }
}