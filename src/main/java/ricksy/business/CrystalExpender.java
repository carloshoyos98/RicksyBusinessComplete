package ricksy.business;

/**
 * Clase del expendedor dde cristales.
 */
public class CrystalExpender implements GuestDispatcher{
    /**
     * Cantidad de cristales disponibles.
     */
    private int stock = 0;
    /**
     * Precio de los cristales.
     */
    public double itemCost = 0.0d;

    /**
     * Constructor de la clase.
     * @param stock Cantidad de cristales.
     * @param itemCost Precio de los cristales.
     */
    public CrystalExpender(int stock, double itemCost) {
        this.stock = stock;
        this.itemCost = itemCost;
    }

    /**
     * @return Devuelve la cantidad de cristales.
     */
    public int stock() {
        return this.stock;
    }

    /**
     * Representación de la clase.
     * @return Representa el stock y el precio de las unidades.
     */
    @Override
    public String toString() {
        StringBuilder rep = new StringBuilder();
        rep.append("stock: " + this.stock + '\n');
        rep.append("cost: " + this.itemCost);
        return rep.toString();
    }

    /**
     * Método que hace el pago de la tarjeta y da los cristales a éste.
     * @param client Tarjeta del cliente.
     */
    public void dispatch(CreditCard client) {
        if(client.credit() >= this.itemCost){
            this.stock--;
            client.pay(this.itemCost);
        } else {
            //no hace nada
        }

    }
}
