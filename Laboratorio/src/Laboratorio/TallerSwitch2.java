/*
 */
package Laboratorio;

import java.util.Scanner;

/**
 *
 * @author dennisjimenez
 */
public class TallerSwitch2 {
    
    public static void main(String[] args) {

        String placa_vehiculo;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese su placa de vehículo: ");
        placa_vehiculo = entrada.nextLine();

        // chart.At(0) para ubicar la primera letra 
        
        char valor = placa_vehiculo.charAt(0);
        switch (valor) {
            
            // Case con la inical de las placas de cada provincia de la Costa
            
            case 'k':
            case 'K':
                System.out.printf("Esta placa %s  pertenece a provincia de"
                        + " Sucumbíos \n", placa_vehiculo.toUpperCase());
                break;

            case 'q':
            case 'Q':
                System.out.printf("Esta placa %s pertenece a la provincia de"
                        + " Orellana \n", placa_vehiculo.toUpperCase());
                break;

            case 'n':
            case 'N':
                System.out.printf("Esta placa %s pertenece a la provincia del"
                        + " Napo \n", placa_vehiculo.toUpperCase());
                break;

            case 's':
            case 'S':
                System.out.printf("Esta placa %s pertenece a la provincia de"
                        + " Santa Elena \n", placa_vehiculo.toUpperCase());
                break;

            case 'v':
            case 'V':
                System.out.printf("Esta placa %s pertenece a la provincia del"
                        + "Morona Santiago \n", placa_vehiculo.toUpperCase());

                break;
            case 'z':
            case 'Z':
                System.out.printf("Esta placa %s pertenece a la provincia de"
                        + " Zamora Chinchipe \n" 
                        , placa_vehiculo.toUpperCase());
                break;

            case 'r':
            case 'R':
                System.out.printf("Esta placa %s pertenece a la provincia"
                        + "de Los Ríos \n", placa_vehiculo.toUpperCase());
                break;
                
                 // Caso por defecto si no encuentra valor 

            default:
                System.out.printf("Esta placa %s no pertenece a la región"
                        + " Amazónica \n", placa_vehiculo.toUpperCase());
        }
    }
}


