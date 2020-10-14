public class Mussarela extends Pizza {
    private String nome;
    private PizzaSize size;
    private String[] tipo = { "Muçarela", "Tomate", "Azeite" };

    public Mussarela(PizzaSize size) {
        super(size);

        this.size = size;
    }

    public void preparar() {
        System.out.printf("Preparando pizza de Mussarela %n");
        for (int i = 0; i < tipo.length; i++) {
            System.out.println(tipo[i]);
        }
    }

    public void assar() {
        System.out.println("A pizza demora 2 minutos pra assar.");
    }
}