package solid.lsp;

public abstract class OrderAbstract {

    protected int price;
    protected int qnt;
    public OrderAbstract(int price, int qnt) {
        this.price = price;
        this.qnt = qnt;
    }
    public abstract int getAmount();
    @Override
    public String toString() {
        return String.format("Количество = %d, Цена = %d", qnt, price);
    }

}
