package ricksy.business;

public class CreditCard {
    String owner = "";
    private String number = "";
    private double credit =  3000.0d;
    public final String SYMBOL = "EZI";

    public CreditCard(String owner, String number) {
        this.owner = owner;
        this.number = number;
    }

    public String number() {
        return this.number;
    }

    public double credit() {
        return this.credit;
    }

    @Override
    public String toString() {
        StringBuilder rep = new StringBuilder();
        rep.append("owner: " + this.owner + '\n');
        rep.append("number: " + this.number + '\n');
        rep.append("credit: " + this.credit + this.SYMBOL);
        return rep.toString();
    }

    public boolean pay(double money) {
        try {
            this.credit -= money;
            return true;
        } catch (Exception fail) {
            return false;
        }

    }

}
