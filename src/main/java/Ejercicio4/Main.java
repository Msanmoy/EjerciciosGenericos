package Ejercicio4;

import Ejercicio3.Matriz;

public class Main {
    public static void main(String[] args) {
        Matriz<Integer> matriz = new Matriz<>(4,2);
        matriz.set(1,1,1);
        matriz.set(1,2,2);
        matriz.set(2,1,3);
        matriz.set(2,2,4);
        matriz.set(3,1,5);
        matriz.set(3,2,6);
        matriz.set(4,1,7);
        matriz.set(4,2,8);

        System.out.println(matriz.toString());

        System.out.println(matriz.get(1,2));

    }
}
