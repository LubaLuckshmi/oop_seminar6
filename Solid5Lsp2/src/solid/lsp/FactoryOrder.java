package solid.lsp;

public class FactoryOrder {

    private int count = 0;

    // Каждый 3-й заказ - бонусный
    public OrderAbstract create(int price, int qnt) {
        count++;
        if (count == 3){
            count = 0;
            return new OrderBonus(price, qnt);
        }
        return new Order(price, qnt);
    }
}
