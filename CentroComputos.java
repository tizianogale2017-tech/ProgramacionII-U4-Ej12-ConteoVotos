package Ejercicio12_ConteoVotos;

import java.util.List;

public class CentroComputos {
    public int totalizar(List<BoletaElectoral> boletas, int[] votosEmitidos) {
        int total = 0;
        for (int i = 0; i < boletas.size(); i++) {
            BoletaElectoral b = boletas.get(i);
            int validos = b.contarVoto(votosEmitidos[i]);
            System.out.printf("%-20s %-18s emitidos: %6d | válidos: %6d%n",
                    b.getNombreCandidato(), b.getClass().getSimpleName(), votosEmitidos[i], validos);
            total += validos;
        }
        return total;
    }
}
