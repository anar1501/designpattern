package structural.facade.strategy;

import structural.facade.ShopKeeper;

public class IphoneSale implements ShopKeeperStrategy {
    ShopKeeper shopKeeper = new ShopKeeper();

    @Override
    public void doOperation() {
        shopKeeper.iphoneSale();
    }
}
