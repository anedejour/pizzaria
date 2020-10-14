public class Margherita extends Pizza {
    private String nome;
    private PizzaSize size;
    private String[] tipo = { "Muçarela", "Tomate", "Manjericão", "Azeite" };

    public Margherita(PizzaSize size) {
        super(size);

        this.size = size;
    }

    public void preparar() {
        System.out.printf("Preparando pizza de Margerita: %n");
        for (int i = 0; i < tipo.length; i++) {
            System.out.println(tipo[i]);
        }
    }

    public void assar() {
        System.out.println("A pizza demora 5 minutos pra assar.");
    }
}