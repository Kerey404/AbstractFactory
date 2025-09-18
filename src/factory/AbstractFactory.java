package factory;

import adidas.AdidasProduct;
import nike.NikeProduct;

public interface AbstractFactory {
    AdidasProduct getAdidasProduct(String productType);
    NikeProduct getNikeProduct(String productType);
}
