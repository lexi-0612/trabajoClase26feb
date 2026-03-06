package Main;

import java.util.Scanner;
import Banco.Cuenta;




public class Main {

    public static void main(String[] args) {
        //crea el objeto y entrada de teclado

        Scanner tecla = new Scanner(System.in);
        Cuenta saldo = new Cuenta();

        System.out.println(" Ingrese el valor de su cuenta");
        saldo.setsaldoInicial(tecla.nextInt());


        if (saldo.getsaldoInicial() >= 0) {

            System.out.println("El saldo ingresado es correcto" + "\n" + " La cuenta se ha creado con exito");

            while (true) {
                System.out.println("¿Que opcion desea realizar?" + "\n" + "1. Deposito" + "\n" + "2. Retiro" + "\n" + "3. Saldo Actual");
                int opcion = tecla.nextInt();

                if (opcion == 1) {

                    boolean stop = true;
                    while (stop) {
                        System.out.println("Ingrese el valor del deposito");
                        int monto = tecla.nextInt();


                        if (monto <= 0) {
                            System.out.println("El valor del deposito es incorrecto");

                        } else {
                            saldo.setsaldoInicial(saldo.getsaldoInicial() + monto);
                            System.out.println("El saldo actual es: " + saldo.toString());
                            stop = false;
                        }

                    }


                } else if (opcion == 2) {
                    boolean stop = true;
                    while (stop) {
                        System.out.println("Ingrese el valor del retiro");
                        int monto = tecla.nextInt();


                        if (monto <= 0) {
                            System.out.println("El valor del retiro es incorrecto");
                        } else if (monto > saldo.getsaldoInicial()) {
                            System.out.println("El saldo es insuficiente");

                        } else {
                            saldo.setsaldoInicial(saldo.getsaldoInicial() - monto);
                            System.out.println("El saldo actual es: " + saldo.toString());
                            stop = false;

                        }
                    }

                } else if (opcion == 3) {
                    System.out.println("El saldo actual es:" + saldo.toString());
                    System.exit(0);
                }

            }

        } else {
            System.out.println("El saldo no puede ser negativo");
        }


    }
}



