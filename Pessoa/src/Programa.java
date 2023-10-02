public class Programa {
    public static void main(String[] args) throws Exception {
        // Criando uma pessoa principal e seus respectivos pais
        Pessoa pessoa1 = new Pessoa("Danilo", 23);
        Pessoa pessoa2 = new Pessoa("Maria", 51);
        Pessoa pessoa3 = new Pessoa("João", 60);

        // Criando os pais da mãe da pessoa principal
        Pessoa pessoa4 = new Pessoa("Ana", 70);
        Pessoa pessoa5 = new Pessoa("Jorge", 75);

        // Criando os pais do pai da pessoa principal
        Pessoa pessoa6 = new Pessoa("Amora", 72);
        Pessoa pessoa7 = new Pessoa("Mário", 78);

        // Setando os pais da pessoa principal
        pessoa1.setMae(pessoa2);
        pessoa1.setPai(pessoa3);

        // Setando os pais da mãe e avós materno da pessoa principal
        pessoa2.setMae(pessoa4);
        pessoa2.setPai(pessoa5);

        // Setando os pais do pai e avós paterno da pessoa principal
        pessoa3.setMae(pessoa6);
        pessoa3.setPai(pessoa7);

        pessoa1.imprimir();
    }
}
