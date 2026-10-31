package Ejercicio12_ConteoVotos;

public class BoletaIntendente extends BoletaElectoral {
    public BoletaIntendente(String candidato, String partido) {
        super(candidato, partido);
    }

    @Override
    public int contarVoto(int cantidadEmitida) {
        validarCantidad(cantidadEmitida);
        // Cargo uninominal: todo voto emitido para la boleta es válido.
        return cantidadEmitida;
    }
}
