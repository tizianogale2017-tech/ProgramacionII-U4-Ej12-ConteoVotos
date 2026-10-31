package Ejercicio12_ConteoVotos;

public class BoletaLegisladores extends BoletaElectoral {
    private static final double PORCENTAJE_PREFERENCIA_NULA = 0.03;

    public BoletaLegisladores(String candidato, String partido) {
        super(candidato, partido);
    }

    @Override
    public int contarVoto(int cantidadEmitida) {
        validarCantidad(cantidadEmitida);
        // Se descartan las preferencias inválidas (se estiman en un 3%).
        return cantidadEmitida - (int) Math.round(cantidadEmitida * PORCENTAJE_PREFERENCIA_NULA);
    }
}
