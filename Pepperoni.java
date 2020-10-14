public class Pepperoni extends Pizza {
    private String nome;
    private PizzaSize size;
    private String[] tipo = { "Pepperoni", "Queijo", "Tomate", "Azeite" };

    public Pepperoni(PizzaSize size) {
        super(size);
        this.size = size;
    }

    public void preparar() {
        System.out.printf("Preparando pizza de Pepperoni: %n ");
        for (int i = 0; i < tipo.length; i++) {
            System.out.println(tipo[i]);
        }
    }

    public void assar() {
        System.out.println("A pizza demora 20 minutos pra assar.");
    }
}