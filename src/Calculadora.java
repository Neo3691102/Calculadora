import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner consola = new Scanner (System.in);
        while(true){
            System.out.println("***Aplicacion Calculadora***");
            mostrarMenu();
            try {
                var operacion = Integer.parseInt(consola.nextLine());

                if (operacion >= 1 && operacion <= 4) {
                    ejecutarOperacion(operacion, consola);


                } else if (operacion == 5) {
                    System.out.println("Hasta pronto...");
                    break;
                } else {
                    System.out.println("Opcion erronea: " + operacion);
                }
                System.out.println();
            } catch (Exception e){
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
        }




    }

    private static void mostrarMenu(){
        System.out.println("""
                1. Suma
                2. Resta
                3. Multiplicación
                4. Division
                5. Salir
                """);

        System.out.println("operacion a realizar?: ");
    }

    private static void ejecutarOperacion(int operacion, Scanner consola) {
        System.out.println("Proporciona el primer operando: ");
        var operando1 = Double.parseDouble(consola.nextLine());
        System.out.println("Proporciona el segundo operando: ");
        var operando2 = Double.parseDouble(consola.nextLine());

        double resultado;
        switch (operacion) {
            case 1 -> {
                resultado = operando1 + operando2;
                System.out.println("Resultado: " + resultado);
            }

            case 2 -> {
                resultado = operando1 - operando2;
                System.out.println("Resultado: " + resultado);
            }

            case 3 -> {
                resultado = operando1 * operando2;
                System.out.println("Resultado: " + resultado);
            }

            case 4 -> {
                resultado = operando1 / operando2;
                System.out.println("Resultado: " + resultado);
            }

            default -> System.out.println("Opcion es erronea: " + operacion);
        }
    }
}