import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner consola = new Scanner (System.in);
        while(true){
            System.out.println("***Aplicacion Calculadora***");
            System.out.println("""
                1. Suma
                2. Resta
                3. Multiplicación
                4. Division
                5. Salir
                """);

            System.out.println("operacion a realizar?: ");
            try {
                var operacion = Integer.parseInt(consola.nextLine());

                if (operacion >= 1 && operacion <= 4) {
                    System.out.println("Proporciona el primer operando: ");
                    var operando1 = Integer.parseInt(consola.nextLine());
                    System.out.println("Proporciona el segundo operando: ");
                    var operando2 = Integer.parseInt(consola.nextLine());

                    int resultado;
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
}