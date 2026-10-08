package modelo;

public class Cita {

    private String fecha;
    private Paciente paciente;
    private Medico medico;

    public Cita(
            String fecha,
            Paciente paciente,
            Medico medico) {

        this.fecha = fecha;
        this.paciente = paciente;
        this.medico = medico;

    }

    public String mostrar() {

        return fecha
                + " | "
                + paciente.getNombre()
                + " | "
                + medico.getNombre();

    }

}