package factory;

public class FactoryGenerator {
    public static AbstractFactory getFactory(String brand) {
        if (brand.equalsIgnoreCase("adidas")) {
            return new AdidasFactory();
        } else if (brand.equalsIgnoreCase("nike")) {
            return new NikeFactory();
        }
        return null;
    }
}
