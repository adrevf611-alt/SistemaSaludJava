package patron;

import modelo.Medicamento;

public class FactoryMedicamento {

    public static Medicamento crearMedicamento(
            String codigo,
            String nombre,
            int stock) {

        return new Medicamento(
                codigo,
                nombre,
                stock
        );

    }

}