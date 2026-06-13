package Padroes.Builder;

public class Computador {
    private String processador,memoriaRAM,armazenamento,placaDeVideo,sistemaOperacional;
    protected Computador(String processador, String memoriaRAM, String armazenamento, String placaDeVideo,
            String sistemaOperacional) {
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
        this.placaDeVideo = placaDeVideo;
        this.sistemaOperacional = sistemaOperacional;
    }
    @Override
    public String toString() {
        return "processador = " + processador + "\nmemoriaRAM = " + memoriaRAM + "\narmazenamento = " + armazenamento
                + "\nplacaDeVideo = " + placaDeVideo + "\nsistemaOperacional = " + sistemaOperacional;
    }

    

}
