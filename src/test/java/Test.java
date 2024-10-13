import Ejercicio7.Operable;

public class Test {
    public static void main(String[] args) {
        Operable<Integer> cuentas = new Operable<>() {
            @Override
            public Integer sumar(Integer valor) {
                return valor + valor;
            }

            @Override
            public Integer restar(Integer valor) {
                return valor - valor;
            }

            @Override
            public Integer multiplicar(Integer valor) {
                return valor * valor;
            }

            @Override
            public Integer dividir(Integer valor) {
                if (valor == 0) {
                    return 0;
                } else {
                    return valor / valor;
                }
            }
        };

        Integer numero = 10;

        System.out.println("Suma: " + cuentas.sumar(numero));
        System.out.println("Resta: " + cuentas.restar(numero));
        System.out.println("Multiplicación: " + cuentas.multiplicar(numero));
        System.out.println("División: " + cuentas.dividir(numero));
    }
}
