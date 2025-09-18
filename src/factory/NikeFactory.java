package factory;

import nike.NikeProduct;
import nike.NikeShoes;
import nike.NikeOutwear;
import adidas.AdidasProduct;

public class NikeFactory implements AbstractFactory {
    @Override
    public NikeProduct getNikeProduct(String productType) {
        if (productType.equalsIgnoreCase("Nike shoes")) {
            return new NikeShoes();
        } else if (productType.equalsIgnoreCase("Nike outwear")) {
            return new NikeOutwear();
        }
        return null;
    }

    @Override
    public AdidasProduct getAdidasProduct(String productType) {
        return null;
    }
}
