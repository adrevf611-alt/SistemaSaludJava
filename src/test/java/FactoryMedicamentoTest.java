package test;

import modelo.Medicamento;
import patron.FactoryMedicamento;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactoryMedicamentoTest {

    @Test
    public void testFactoryMedicamento() {

        Medicamento medicamento =
                FactoryMedicamento.crearMedicamento(
                        "M001",
                        "Paracetamol",
                        100
                );

        assertEquals(
                "M001",
                medicamento.getCodigo()
        );
    }
}