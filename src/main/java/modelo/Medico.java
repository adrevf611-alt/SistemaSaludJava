package modelo;

public class Medico extends Persona {

    private String especialidad;

    public Medico(
            String dni,
            String nombre,
            String especialidad
    ) {

        super(dni, nombre);

        this.especialidad = especialidad;
    }

    @Override
    public String mostrarInformacion() {

        return "Medico: "
                + nombre
                + " - "
                + especialidad;

    }
}