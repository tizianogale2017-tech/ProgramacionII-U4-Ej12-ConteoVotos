package Ejercicio12_ConteoVotos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<BoletaElectoral> boletas = new ArrayList<>();
        boletas.add(new BoletaIntendente("Carla Díaz", "Frente Unido"));
        boletas.add(new BoletaConcejales("Pablo Ríos", "Alianza Local"));
        boletas.add(new BoletaLegisladores("Rosa Molina", "Partido Verde"));
        int[] emitidos = {12000, 9500, 7300};

        int totalValidos = new CentroComputos().totalizar(boletas, emitidos);
        System.out.println("TOTAL DE SUFRAGIOS VALIDOS: " + totalValidos);
    }
}
