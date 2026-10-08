package modelo;

import java.util.ArrayList;

public class HistorialClinico {

    private ArrayList<String> enfermedades;

    public HistorialClinico() {

        enfermedades = new ArrayList<>();
    }

    public void agregarEnfermedad(String enfermedad) {

        enfermedades.add(enfermedad);
    }
}