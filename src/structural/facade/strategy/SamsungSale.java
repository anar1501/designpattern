package structural.facade.strategy;

import structural.facade.ShopKeeper;

public class SamsungSale implements ShopKeeperStrategy {
    ShopKeeper shopKeeper;

    @Override
    public void doOperation() {
        shopKeeper.samsungSale();
    }
}
