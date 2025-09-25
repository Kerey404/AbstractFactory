import adapter.JSAdapter;
import factory.FactoryGenerator;
import factory.AbstractFactory;
import adidas.AdidasProduct;
import nike.NikeProduct;

public class Main {
    public static void main(String[] args) {
        String brand = JSAdapter.getBrandFromJS();
        System.out.println("Выбран бренд из JS: " + brand);

        AbstractFactory factory = FactoryGenerator.getFactory(brand);

        if (brand.equals("adidas")) {
            AdidasProduct shoes = factory.getAdidasProduct("Adidas shoes");
            shoes.makeAdidasProduct();
        } else if (brand.equals("nike")) {
            NikeProduct shoes = factory.getNikeProduct("Nike shoes");
            shoes.makeNikeProduct();
        }
    }
}
