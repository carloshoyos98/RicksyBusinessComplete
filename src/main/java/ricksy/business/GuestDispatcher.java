package ricksy.business;

/**
 * Esta es la interfaz para el programa que deben usar
 * las otras clases para hacer el "pago" de los artículos
 */
public interface GuestDispatcher {
    /**
     * Método abstracto para ser implementado en otras clases
     * @param tarjeta Le pasamos al método una tarjeta de la que extraer las
     *                monedas
     */
    public abstract void dispatch(CreditCard tarjeta);
}
