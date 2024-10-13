package Ejercicio2;

import java.util.Arrays;

public class PilaArray<T> {
     private T[] pila;
     Integer contador;

    public PilaArray() {
        pila = (T[]) new Object[10];
        contador = 0;
    }

    public T[] getPila() {
        return pila;
    }

    public void setPila(T[] pila) {
        this.pila = pila;
    }

    public Integer getContador() {
        return contador;
    }

    public void setContador(Integer contador) {
        this.contador = contador;
    }

    public boolean estaVacia() {
        return contador == null;
    }

    public T extraer(){
        if (estaVacia()) {
            return null;
        }
        T elemento = pila[contador - 1];
        pila[contador - 1] = null;
        contador--;
        return elemento;
    }

    public T primero(){
        if (estaVacia()) {
            return null;
        } else {
            return pila[contador - 1];
        }
    }

    public void aniadir(T elemento) {
        if (contador == pila.length) {
            pila = Arrays.copyOf(pila, pila.length * 2);
        }
        pila[contador++] = elemento;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(pila, 0, contador));
    }
}
