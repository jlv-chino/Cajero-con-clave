package ejercicios2;

import java.util.Scanner;

public class CajeroConClave {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcion, saldo = 5000, dinero, intentos = 0, continuar = 0;
        String clave;
        boolean salir = false;

        do {

            System.out.print("Ingrese su clave: ");
            clave = entrada.next();

            if (clave.equals("12345")) {

                intentos = 0;

                while (!salir) {

                    System.out.println("Opciones: ");
                    System.out.println("1: Depositar");
                    System.out.println("2: Extraer");
                    System.out.println("3: Consultar Saldo");
                    System.out.println("4: Salir");

                    System.out.println("Elija opción: ");
                    opcion = entrada.nextInt();

                    switch (opcion) {

                        case 1:
                            System.out.println("Ingrese importe a depositar: ");
                            dinero = entrada.nextInt();
                            saldo += dinero;
                            break;

                        case 2:
                            System.out.println("Ingrese importe a extraer: ");
                            dinero = entrada.nextInt();
                            if (dinero > saldo) {
                                System.out.println("No hay saldo suficiente!!!");
                            } else {
                                saldo -= dinero;
                            }
                            break;

                        case 3:
                            break;

                        case 4:
                            System.out.println("Salida del sistema!!!");
                            salir = true;
                            continuar = 1;
                            break;

                        default:
                            System.out.println("Opción incorrecta!!!");
                            break;

                    }

                    if (opcion > 0 && opcion < 4) {

                        System.out.println("Saldo actual: $" + saldo);
                        System.out.println(" ");

                    }

                }

            } else {

                System.out.println("La clave es incorrecta!!!");
                intentos++;

            }

            if (intentos == 3) {
                System.out.println("Ha sobrepasado la cantidad de intentos fallidos");
                break;
            }

        } while (continuar == 0);

    }

}
