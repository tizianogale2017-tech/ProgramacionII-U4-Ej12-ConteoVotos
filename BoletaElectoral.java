package Ejercicio12_ConteoVotos;

public abstract class BoletaElectoral {
    private final String nombreCandidato;
    private final String partidoPolitico;

    protected BoletaElectoral(String nombreCandidato, String partidoPolitico) {
        if (nombreCandidato == null || nombreCandidato.isBlank() || partidoPolitico == null || partidoPolitico.isBlank()) {
            throw new IllegalArgumentException("Candidato y partido son obligatorios");
        }
        this.nombreCandidato = nombreCandidato;
        this.partidoPolitico = partidoPolitico;
    }

    /** Devuelve la cantidad de sufragios válidos a partir de los votos emitidos. */
    public abstract int contarVoto(int cantidadEmitida);

    protected void validarCantidad(int cantidadEmitida) {
        if (cantidadEmitida < 0) {
            throw new IllegalArgumentException("La cantidad de votos no puede ser negativa");
        }
    }

    public String getNombreCandidato() { return nombreCandidato; }
    public String getPartidoPolitico() { return partidoPolitico; }
}
