package structural.facade.strategy;

import structural.facade.ShopKeeper;

public class BlackBerrySale implements ShopKeeperStrategy {
    ShopKeeper shopKeeper;

    @Override
    public void doOperation() {
        shopKeeper.blackberrySale();
    }
}
