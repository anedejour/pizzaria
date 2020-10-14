public enum PizzaSize {
    SPROUT(4), MEDIUM(6), BIG(8), GIANT(10);

    private int size;

    private PizzaSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}