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