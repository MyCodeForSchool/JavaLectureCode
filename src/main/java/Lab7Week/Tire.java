package Lab7Week;

public class Tire implements Comparable<Tire> {

    private String name;
    private double price;
    private int warranty;

    public Tire(String tireName, double tirePrice, int tireWarranty) {
        name = tireName;
        price = tirePrice;
        warranty = tireWarranty;
    }


    public double pricePerThouMiles () {
        double pricePerThou = price / warranty * 1000;
        return pricePerThou;
    }

    public double costForSet() {
        return price * 4;
    }

    @Override
    public String toString(){
        Double pricePerThou = pricePerThouMiles();
//        double costPerSet = costForSet();
//        return ("This tire is called " + name) ;
        return String.format("%s costs $%.2f per tire.  Cost per 1000" +
                " miles is $%.2f.", name, price, pricePerThou);
    }

    @Override
    public int compareTo(Tire anotherTire) {
    //    return Double.compare(pricePerThouMiles(), anotherTire.pricePerThouMiles());
        return this.name.compareTo(anotherTire.name);
    }

}
