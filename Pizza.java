public abstract class Pizza {
    private String nome;
    private PizzaSize size;

    public Pizza(PizzaSize size) {
        this.size = size;
    }

    public String getNome() {
        return nome;
    }

    public PizzaSize getSize() {
        return size;
    }

    public void preparar() {

    }

    public void assar() {

    }

    public void cortar() {
        System.out.printf("Cortar a pizza em %d pedaços%n", size.getSize());
    }
}