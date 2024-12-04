package problem_one;

public class Furniture extends Product{
    private String material;
    private double shippingCost;
    public Furniture(String name, double price, String material, double shippingCost){
        super.setName(name);
        super.setPrice(price);
        this.material = material;
        this.shippingCost = shippingCost;
    }
    @Override
    public double getPrice(){
        return super.getPrice() + shippingCost;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "name='" + super.getName() + '\'' +
                ", price=" + super.getPrice() +
                ", material='" + material + '\'' +
                ", shippingCost=" + shippingCost +
                "} ";
    }
}
