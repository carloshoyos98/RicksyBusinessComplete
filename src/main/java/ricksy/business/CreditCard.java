package ricksy.business;

/**
 * Clase de la tarjeta de cŕedito, con la que se pagan los artículos.
 */
public class CreditCard {
    /**
     * Dueño tarjeta. Es el nombre del dueño de la tarjeta
     */
    String owner = "";
    /**
     * Número de la tarjeta.
     */
    private String number = "";
    /**
     * Cŕedito de la tarjeta. Es el saldo de la tarjeta del cliente.
     */
    private double credit =  3000.0d;
    /**
     * Moneda con la que se paga.
     */
    public final String SYMBOL = "EZI";

    /**
     * Constructor de la tarjeta
     * @param owner Nombre de dueño de la tarjeta.
     * @param number Número de la tarjeta.
     */
    public CreditCard(String owner, String number) {
        this.owner = owner;
        this.number = number;
    }

    /**
     * @return Devuelve el número de la tarjeta.
     */
    public String number() {
        return this.number;
    }

    /**
     * @return Devuelve el cŕedito de la tarjeta.
     */
    public double credit() {
        return this.credit;
    }

    /**
     * Representación de la tarjeta.
     * @return Devuelve los datos de la tarjeta.
     */
    @Override
    public String toString() {
        StringBuilder rep = new StringBuilder();
        rep.append("owner: " + this.owner + '\n');
        rep.append("number: " + this.number + '\n');
        rep.append("credit: " + this.credit + this.SYMBOL);
        return rep.toString();
    }

    /**
     * Método para hacer los pagos de la tarjeta.
     * @param money Es la cantidad a pagar.
     * @return True si se realiza el pago, en caso contrario devuelve False.
     */
    public boolean pay(double money) {
        if(credit() >= money) {
            this.credit -= money;
            return true;
        } else {
            return false;
        }

    }

}
