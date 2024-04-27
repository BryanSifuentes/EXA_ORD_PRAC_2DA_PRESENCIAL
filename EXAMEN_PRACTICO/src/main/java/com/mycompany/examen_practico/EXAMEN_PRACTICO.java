/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen_practico;

import java.util.Scanner;

/**
 *
 * @author Alexs
 */
public class EXAMEN_PRACTICO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Elige la opcion que deses (piedra, papel o tijera): ");
            String jugadaUsuario = scanner.nextLine();

            if (!esValida(jugadaUsuario)) {
                System.out.println("Juego no valido. Por favor, elije piedra, papel o tijera.");
                continue;
            }
            String jugadaComputadora = generarJugadaComputadora();
            System.out.println("La computadora elige: " + jugadaComputadora);
            String resultado = determinarResultado(jugadaUsuario, jugadaComputadora);
            System.out.println(resultado);
            System.out.print("¿Deseas jugar de nuevo? (si/no): ");
            String jugarDeNuevo = scanner.nextLine().toLowerCase();
            if (!jugarDeNuevo.equals("si")) {
                break;
            }
        }
        System.out.println("¡Gracias por jugar!");
        scanner.close();
    }
    public static boolean esValida(String jugada) {
        return jugada.equals("piedra") || jugada.equals("papel") || jugada.equals("tijera");
    }
    public static String generarJugadaComputadora() {
        String[] opciones = {"piedra", "papel", "tijera"};
        return opciones[(int) (Math.random() * 3)];
    }
    public static String determinarResultado(String jugadaUsuario, String jugadaComputadora) {
        if (jugadaUsuario.equals(jugadaComputadora)) {
            return "¡Empate!";
        } else if ((jugadaUsuario.equals("piedra") && jugadaComputadora.equals("tijera")) ||
                   (jugadaUsuario.equals("papel") && jugadaComputadora.equals("piedra")) ||
                   (jugadaUsuario.equals("tijera") && jugadaComputadora.equals("papel"))) {
            return "¡has ganado!";
        } else {
            return "¡La computadora a gano!";
        }
    }
}

        
    

