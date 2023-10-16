import java.util.ArrayList;
import java.util.List;

public class Cidade {
    // Propriedades

    public String nome;
    public List<Caminho> caminhos;

    // Construtoras

    public Cidade() {
        this.nome = " ";
        this.caminhos = new ArrayList<Caminho>();
    }

    public Cidade(String cidadeNome) {
        this.nome = cidadeNome;
        this.caminhos = new ArrayList<Caminho>();
    }

    // Métodos

    public void adicionarCaminho(Cidade destino, int caminhoDistancia) {
        Caminho caminho = new Caminho(this, destino, caminhoDistancia);
        caminhos.add(caminho);
    }
}
