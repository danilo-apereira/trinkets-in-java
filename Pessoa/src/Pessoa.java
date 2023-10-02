public class Pessoa {
    // Propriedades

    private String nome;
    private int idade;
    Pessoa mae;
    Pessoa pai;

    // Construtoras

    public Pessoa() {
        this.nome = null;
        this.idade = 0;
        this.mae = null;
        this.pai = null;
    }

    public Pessoa(String nomePessoa, int idadePessoa) {
        this.nome = nomePessoa;
        this.idade = idadePessoa;
    }

    // Métodos

    public void setMae(Pessoa pessoa) {
        if (pessoa == null) {
            System.out.println("Você especificou uma pessoa nula.");
        } else {
            this.mae = pessoa;
        }
    }

    public void setPai(Pessoa pessoa) {
        if (pessoa == null) {
            System.out.println("Você especificou uma pessoa nula.");
        } else {
            this.pai = pessoa;
        }
    }

    public Pessoa getMae() {
        return this.mae;
    }

    public Pessoa getPai() {
        return this.pai;
    }

    public void imprimir() {
        System.out.println("Informações de " + this.nome);
        System.out.println("Idade: " + this.idade + " ano(s)");

        if (this.mae != null) {
            System.out.println("Mãe: " + this.mae.nome);
        }

        if (this.pai != null) {
            System.out.println("Pai: " + this.pai.nome);
        }

        if (this.mae.mae != null) {
            System.out.println("Avó materno: " + this.mae.mae.nome);
        }

        if (this.mae.pai != null) {
            System.out.println("Avô materno: " + this.mae.pai.nome);
        }

        if (this.pai.mae != null) {
            System.out.println("Avó paterno: " + this.pai.mae.nome);
        }

        if (this.pai.pai != null) {
            System.out.println("Avô paterno: " + this.pai.pai.nome);
        }
    }
}
