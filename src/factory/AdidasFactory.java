package factory;

import adidas.AdidasProduct;
import adidas.AdidasShoes;
import adidas.AdidiasOutwear;
import nike.NikeProduct;

public class AdidasFactory implements AbstractFactory {
    @Override
    public AdidasProduct getAdidasProduct(String productType) {
        if (productType.equalsIgnoreCase("Adidas shoes")) {
            return new AdidasShoes();
        } else if (productType.equalsIgnoreCase("Adidas outwear")) {
            return new AdidiasOutwear();
        }
        return null;
    }

    @Override
    public NikeProduct getNikeProduct(String productType) {
        return null;
    }
}
