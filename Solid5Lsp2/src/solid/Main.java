package solid;

import solid.lsp.FactoryOrder;
import solid.lsp.Order;
import solid.lsp.OrderAbstract;

public class Main {
    public static void main(String[] args) {
        FactoryOrder creator = new FactoryOrder();
        OrderCalculator calculator = new solid.OrderCalculator();
        calculator.add(creator.create(3, 2));
        calculator.add(creator.create(1, 3));
        calculator.add(creator.create(2, 2));

        for (OrderAbstract order : calculator) {
            System.out.println(order);
        }

        System.out.printf("Сумма заказа %d", calculator.calcAmount());
    }
}
