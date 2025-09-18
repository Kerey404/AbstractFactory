import adidas.AdidasProduct;
import factory.AbstractFactory;
import factory.FactoryGenerator;
import nike.NikeProduct;

public class Main {
    public static void main(String[] args) {
        AbstractFactory adidasFactory = FactoryGenerator.getFactory("Adidas");
        AdidasProduct adidasProduct = adidasFactory.getAdidasProduct("Adidas shoes");
        adidasProduct.makeAdidasProduct();

        AbstractFactory nikeFactory = FactoryGenerator.getFactory("Nike");
        NikeProduct nikeProduct = nikeFactory.getNikeProduct("Nike shoes");
        nikeProduct.makeNikeProduct();
    }
}