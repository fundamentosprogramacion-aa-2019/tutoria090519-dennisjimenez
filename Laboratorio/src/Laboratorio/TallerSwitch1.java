/*
 */
package Laboratorio;

import java.util.Scanner;

/**
 *
 * @author dennisjimenez
 */
public class TallerSwitch1 {

    // Método main 
    public static void main(String[] args) {
    
    // Variable
        String placa_vehiculo;
    // Entrada por pantalla 
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese su placa de vehículo: ");
        placa_vehiculo = entrada.nextLine();
        
        // chart.At(0) para ubicar la primera letra 
        char valor = placa_vehiculo.charAt(0);
        switch (valor) {
            
        // Case con la inical de las placas de cada provincia de la Costa
            case 'e':
            case 'E':
                System.out.printf("Esta placa %s  pertenece a provincia de"
                        + " Esmeraldas\n", placa_vehiculo.toUpperCase());
                break;

            case 'm':
            case 'M':
                System.out.printf("Esta placa %s pertenece a la provincia de"
                        + " Manabí\n", placa_vehiculo.toUpperCase());
                break;

            case 'g':
            case 'G':
                System.out.printf("Esta placa %s pertenece a la provincia del"
                        + " Guayas\n", placa_vehiculo.toUpperCase());
                break;

            case 'y':
            case 'Y':
                System.out.printf("Esta placa %s pertenece a la provincia de"
                        + " Santa Elena\n", placa_vehiculo.toUpperCase());
                break;

            case 'o':
            case 'O':
                System.out.printf("Esta placa %s pertenece a la provincia del"
                        + "Oro \n", placa_vehiculo.toUpperCase());

                break;
            case 'j':
            case 'J':
                System.out.printf("Esta placa %s pertenece a la provincia de"
                        + " Santo Domingo de los Tsáchilas\n" 
                        , placa_vehiculo.toUpperCase());
                break;

            case 'r':
            case 'R':
                System.out.printf("Esta placa %s pertenece a la provincia"
                        + "de los Ríos \n", placa_vehiculo.toUpperCase());
                break;
                
            // Caso por defecto si no encuentra valor 
                
            default:
                System.out.printf("Esta placa %s no pertenece a la región"
                        + " Costa\n", placa_vehiculo.toUpperCase());
        }
    }
}
