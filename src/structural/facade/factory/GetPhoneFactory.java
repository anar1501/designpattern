package structural.facade.factory;

import structural.facade.enums.PhoneType;
import structural.facade.strategy.BlackBerrySale;
import structural.facade.strategy.IphoneSale;
import structural.facade.strategy.SamsungSale;
import structural.facade.strategy.ShopKeeperStrategy;

public class GetPhoneFactory {
    IphoneSale iphone;
    SamsungSale samsung;
    BlackBerrySale blackberry;

    public ShopKeeperStrategy getPhone(PhoneType phoneType) {
        return switch (phoneType) {
            case IPHONE -> new IphoneSale();
            case SAMSUNG -> new SamsungSale();
            case BLACKBERRY -> new BlackBerrySale();
        };
    }
}
