package Ejercicio6;

import java.util.ArrayList;

public class ListaOrdenada<E extends Comparable<E>> {
    private ArrayList<E> lista;
    public ListaOrdenada() {
        lista = new ArrayList<>();
    }
    public void add(E elemento) {
        if (lista.isEmpty()) {
            lista.add(elemento);
        } else {
            int i = 0;
            while (i < lista.size() && lista.get(i).compareTo(elemento) < 0) {
                i++;
            }
            lista.add(i, elemento);
        }
    }

    public E get(int index) {
        if (index < 0 || index >= lista.size()) {
            throw new IndexOutOfBoundsException();
        }
        return lista.get(index);
    }

    public int size() {
        return lista.size();
    }

    public boolean isEmpty(){
        return lista.isEmpty();
    }

    public boolean remove(E elemento) {
        return lista.remove(elemento);
    }

    public int indexOf(E elemento) {
        return lista.indexOf(elemento);
    }

    @Override
    public String toString() {
        return lista.toString();
    }
}
