public class Caminho {
    // Propriedades

    public Cidade origem;
    public Cidade destino;
    public int distancia;

    // Construtoras

    public Caminho() {
        this.origem = null;
        this.destino = null;
    }

    public Caminho(Cidade cidadeOrigem, Cidade cidadeDestino, int caminhoDistancia) {
        this.origem = cidadeOrigem;
        this.destino = cidadeDestino;
        this.distancia = caminhoDistancia;
    }

    // Métodos

    public void imprimir() {
        System.out.println("Possui caminho disponível para: " + this.destino.nome + "\nDistância: " + this.distancia);
    }
}
