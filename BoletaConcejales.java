package Ejercicio12_ConteoVotos;

public class BoletaConcejales extends BoletaElectoral {
    private static final double PORCENTAJE_TACHAS = 0.08;

    public BoletaConcejales(String candidato, String partido) {
        super(candidato, partido);
    }

    @Override
    public int contarVoto(int cantidadEmitida) {
        validarCantidad(cantidadEmitida);
        // Se anulan los votos con tachas (se estiman en un 8%).
        return cantidadEmitida - (int) Math.round(cantidadEmitida * PORCENTAJE_TACHAS);
    }
}
