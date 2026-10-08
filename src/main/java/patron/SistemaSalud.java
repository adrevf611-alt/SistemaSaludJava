package patron;

public class SistemaSalud {

    private static SistemaSalud instancia;

    private SistemaSalud() {

    }

    public static SistemaSalud getInstancia() {

        if(instancia == null){

            instancia =
                    new SistemaSalud();

        }

        return instancia;

    }
}