import java.util.ArrayList;
import java.util.List;

public class Mapa {
    // Propriedades

    public List<Cidade> cidades;

    // Construtoras

    public Mapa() {
        cidades = new ArrayList<Cidade>();
    }

    // Métodos

    public void add(String cidadeNome) {
        Cidade cidade = new Cidade(cidadeNome);
        cidades.add(cidade);
    }

    public void add(Cidade cidade) {
        cidades.add(cidade);
    }

    public void adicionarCaminho(String cidadeOrigem, String cidadeDestino, int caminhoDistancia) {
        Cidade co = buscar(cidadeOrigem);
        Cidade cd = buscar(cidadeDestino);
        co.adicionarCaminho(cd, caminhoDistancia);
        cd.adicionarCaminho(co, caminhoDistancia);
    }

    public Cidade buscar(String busca) {
        Cidade retorno = null;

        for (Cidade cidade : cidades) {
            if (cidade.nome.equals(busca)) {
                retorno = cidade;
                break;
            }
        }

        return retorno;
    }

    public void imprimir() {
        for (Cidade cidade : cidades) {
            System.out.println(cidade.nome + ":");
            for (Caminho caminho : cidade.caminhos) {
                caminho.imprimir();
            }
            System.out.println(" ");
        }
    }
}
