public class Programa {
    public static void main(String[] args) throws Exception {
        Mapa mapa = new Mapa();

        mapa.add("Gramado");
        mapa.add("Caxias do Sul");
        mapa.add("Novo Hamburgo");
        mapa.add("Porto Alegre");
        mapa.add("Canoas");

        mapa.adicionarCaminho("Gramado", "Caxias do Sul", 67);
        mapa.adicionarCaminho("Gramado", "Novo Hamburgo", 62);

        mapa.adicionarCaminho("Caxias do Sul", "Novo Hamburgo", 78);

        mapa.adicionarCaminho("Novo Hamburgo", "Canoas", 27);

        mapa.adicionarCaminho("Canoas", "Porto Alegre", 19);

        mapa.imprimir();
    }
}
