package Ejercicio1;

import java.util.LinkedList;

public class Pila<T> {
    private LinkedList<T> lista = new LinkedList<T>();

    public Pila(LinkedList<T> lista) {
        this.lista = lista;
    }

    public LinkedList<T> getLista() {
        return lista;
    }

    public void setLista() {
        this.lista = lista;
    }



    public boolean estaVacia() {
        return lista.isEmpty();
    }

    public T extraer() {
        if (lista != null) {
            T primero;
            primero = lista.removeFirst();
            return primero;
        }
        return null;
    }

    public T primero() {
        if (lista != null) {
            return lista.getFirst();
        } else return null;
    }

    public void aniadir(T elemento) {
        lista.addFirst(elemento);
    }

    @Override
    public String toString() {
        return "Pila{" +
                "lista=" + lista +
                '}';
    }

}
