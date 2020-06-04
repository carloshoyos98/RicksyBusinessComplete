# Ricksy Business  

Este es proyecto es el examen de programación de febrero.
  

## Documentación


Este pequeño programa representa el sistema de reserva de taxis y compras de objetos para asistir a la fiesta de *Rick*.  

 ## Clases

 ### - CreditCard
  
Esta clase contiene a lógica con la que funciona las tarjetas de los invitados.
  
Propiedades:  
- credit: crédito de la tarjeta.  
- owner : dueño de la tarjeta.  
- number : número de la tarjeta.  
- SYMBOL : moneda.  

Sus métodos:  
  
- pay()

```java
    public boolean pay(double money) {
        if(credit() >= money) {
            this.credit -= money;
            return true;
        } else {
            return false;
        }

    }
```
Realiza el pago únicamente en caso de que el crédito de la tarjeta sea superior al dinero que toca pagar (el parámetro *money*)

- credit()

```java
    public double credit() {
        return this.credit;
    }
```
Devuelve el crédito disponible en la tarjeta.

- number()

```java
    public String number() {
        return this.number;
    }
```
Devuelve el número de la tarjeta.

********************************
### - CrystalExpender
  
Esta clase contiene a lógica con la que funciona la venta de cristales.
  
Propiedades:  
- stock: cantidad disponible.  
- itemCost : precio unitario de los cristales.  


Sus métodos:  
  
- dispatch()

```java
    public void dispatch(CreditCard client) {
        if(client.credit() >= this.itemCost){
            this.stock--;
            client.pay(this.itemCost);
        } else {
            //no hace nada
        }

    }
```
Se encarga de que se realice el pago si el crédito de la tarjeta del cliente (parámetro *client*)es mayor al *itemCost*.

- stock()

```java
    public int stock() {
        return this.stock;
    }
```
Devuelve la cantidad de cristales disponibles.

****************************************

 ### - UfosPark
  
Esta clase contiene a lógica con la que funciona las reservas de los taxis.
  
Propiedades:  
- fee: precio de los ufos.  
- flota : lista de ufos.  
- freeUfo : ufos libres.   

Sus métodos:  
  
- freeUfos()

```java
    private String freeUfos() {
        for (Map.Entry<String, String> ufos : this.flota.entrySet()) {
            if (ufos.getValue() == null) {
                freeUfo = ufos.getKey();
            }
        }
        return freeUfo;

    }
```
Devuelve el nombre del primer ufo disponible (sin ser reservado).

- reserveUfo()

```java
    private void reserveUfo(String ufo, CreditCard card) {
        if (this.flota.containsValue(card.number())) {
            //No hace nada

        } else {
            card.pay(this.fee);
            this.flota.replace(ufo, card.number());
        }


    }
```
Hace la reserva de ufos en caso de que haya disponibles.

- dispatch()

```java
    public void dispatch(CreditCard creditCard) {
        if(freeUfos() != null) {
            reserveUfo(freeUfo, creditCard);
            //freeUfo a null para repetir el proceso
            freeUfo = null;
        }
    }
```
Hace el pago de la tarjeta (parámetro *creditCard*), si tiene crédito suficiente.  

- getUfoOf()

```java
    public String getUfoOf(String tarjeta) {
        String ufo = null;
        for (Map.Entry<String, String> ufos : this.flota.entrySet()) {
            if (ufos.getValue() == tarjeta) {
                ufo = ufos.getKey();
            }
        }
        return ufo;
    }
```
Devuelve el nombre del ufo que perteneca a la tarjeta indicada (parámetro *tarjeta*).

***************************

### - Receptivo  
 Sin implementar todavía. Debería simular un paquete para la reserva y pago de todo en una sola acción.  

*******************************

### - GuestDispatcher

Interfaz para implementar los pagos.  

```java
public abstract void dispatch(CreditCard tarjeta);
```

