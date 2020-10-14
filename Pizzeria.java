public class Pizzeria {
    public static void main(String[] args) {
        Pepperoni pepperoni = new Pepperoni(PizzaSize.SPROUT);
        Margherita margherita = new Margherita(PizzaSize.MEDIUM);
        Mussarela mussarela = new Mussarela(PizzaSize.BIG);
        Portuguesa portuguesa = new Portuguesa(PizzaSize.GIANT);

        pepperoni.preparar();
        pepperoni.assar();
        pepperoni.cortar();

        System.out.println();

        margherita.preparar();
        margherita.assar();
        margherita.cortar();

        System.out.println();

        mussarela.preparar();
        mussarela.assar();
        mussarela.cortar();

        System.out.println();

        portuguesa.preparar();
        portuguesa.assar();
        portuguesa.cortar();
    }
}