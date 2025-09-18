package factory;

public class FactoryGenerator {
    public static AbstractFactory getFactory(String brand) {
        if (brand.equalsIgnoreCase("Adidas")) {
            return new AdidasFactory();
        } else if (brand.equalsIgnoreCase("Nike")) {
            return new NikeFactory();
        }
        return null;
    }
}
