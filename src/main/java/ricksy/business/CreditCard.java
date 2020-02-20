package ricksy.business;

public class CreditCard {
    String owner = "";
    String number = "";
    double credit =  3000.0d;
    public final String SYMBOL = "EZI";

    public CreditCard(String owner, String number) {
        this.owner = owner;
        this.number = number;
    }

    @Override
    public String toString() {
        StringBuilder rep = new StringBuilder();
        rep.append("owner: " + this.owner + '\n');
        rep.append("number: " + this.number + '\n');
        rep.append("credit: " + this.credit + this.SYMBOL);
        return rep.toString();
    }

}
