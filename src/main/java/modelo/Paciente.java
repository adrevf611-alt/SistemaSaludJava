package modelo;

public class Paciente extends Persona {

    private HistorialClinico historial;

    public Paciente(String dni, String nombre) {

        super(dni, nombre);

        historial = new HistorialClinico();
    }

    public HistorialClinico getHistorial() {
        return historial;
    }

    @Override
    public String mostrarInformacion() {

        return "Paciente: " + nombre;
    }
}