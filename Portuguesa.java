public class Portuguesa extends Pizza {
    private String nome;
    private PizzaSize size;
    private String[] tipo = { "Muçarela", "Tomate", "Ovo", "Presunto", "Cebola", "Azeitona", "PimentãO", "Azeite" };

    public Portuguesa(PizzaSize size) {
        super(size);

        this.size = size;
    }

    public void preparar() {
        System.out.printf("Preparando pizza Portuguesa: %n");
        for (int i = 0; i < tipo.length; i++) {
            System.out.println(tipo[i]);
        }
    }

    public void assar() {
        System.out.println("A pizza demora 10 minutos pra assar.");
    }
}