package Padroes.Builder;

public final class ComputadorBuilder {

    private String processador, memoriaRAM, armazenamento;
    private String placaDeVideo = "N/A";
    private String sistemaOperacional = "N/A";

    public ComputadorBuilder setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
        return this;
    }

    public ComputadorBuilder setPlacaDeVideo(String placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
        return this;
    }

    public ComputadorBuilder setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
        return this;
    }

    public ComputadorBuilder setMemoriaRAM(String memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
        return this;
    }

    public ComputadorBuilder setProcessador(String processador) {
        this.processador = processador;
        return this;
    }

    public Computador build() {
        return new Computador(processador, memoriaRAM, armazenamento, placaDeVideo, sistemaOperacional);
    }
}
