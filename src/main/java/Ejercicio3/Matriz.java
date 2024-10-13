package Ejercicio3;

public class Matriz<T> {

    private Object[][] matriz;
    private int filas;
    private int columnas;

    public Matriz(int numFilas, int numColumnas) {
        this.filas = numFilas + 1;
        this.columnas = numColumnas + 1;
        this.matriz = new Object[filas][columnas];
    }

    public void set(int fila, int columna, T elemento) {
        matriz[fila][columna] = elemento;
    }

    public T get(int fila, int columna) {
        return (T) matriz[fila][columna];
    }

    public int columnas(){
        return columnas;
    }
    public int filas(){
        return filas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] != null) {
                    sb.append(matriz[i][j]);
                } else {
                    sb.append("**");
                }
                if (j < columnas - 1) {
                    sb.append("\t");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

}
