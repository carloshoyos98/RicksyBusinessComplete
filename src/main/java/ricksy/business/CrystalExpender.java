package ricksy.business;

public class CrystalExpender {
    private int stock = 0;
    public double itemCost = 0.0d;

    public CrystalExpender(int stock, double itemCost) {
        this.stock = stock;
        this.itemCost = itemCost;
    }

    public int stock() {
        return this.stock;
    }

    @Override
    public String toString() {
        StringBuilder rep = new StringBuilder();
        rep.append("stock: " + this.stock + '\n');
        rep.append("cost: " + this.itemCost);
        return rep.toString();
    }
}
