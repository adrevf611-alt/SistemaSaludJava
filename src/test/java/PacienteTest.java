package test;

import modelo.Paciente;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PacienteTest {

    @Test
    public void testCrearPaciente() {

        Paciente paciente = new Paciente(
                "12345678",
                "Juan"
        );

        assertEquals(
                "Juan",
                paciente.getNombre()
        );
    }
}