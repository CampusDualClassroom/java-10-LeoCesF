package com.campusdual.classroom;

import java.util.Locale;

public class Exercise10 {

    //TODO ↓
    // Imprimir el color de las pelotas que salgan, hasta que salgan 2 de color azul
    // El mensaje a imprimir es → La bola es de color: COLOR_BOLA
    // COLOR_BOLA puede ser → rojo, azul, verde
    public static void main(String[] args) {
        int contadorAzul = 0;
        do {
            String colorBola = getBall();
            System.out.println("La bola es de color: " + colorBola);
            if (colorBola.toLowerCase() == "azul") {
                contadorAzul++;
            }
        }while (contadorAzul != 2);

    }

    //TODO ↓
    // Un método que devuelva una cadena de texto con el color de una pelota (en minúscula). Dicho color se escogerá de
    // manera aleatoria. Se empleará el método randomWithRange(int min, int max) para escoger un número aleatorio, que
    // lo asociaremos al valor de un color de la siguiente manera:
    // 1 → rojo
    // 2 → azul
    // 3 → verde
    public static String getBall() {
        String color = "";
        int random = randomWithRange(1, 3);
        switch (random) {
            case 1:
                color = "rojo";
                break;
            case 2:
                color = "azul";
                break;
            case 3:
                color = "verde";
                break;
        }
        return color.toLowerCase();
    }

    public static int randomWithRange(int min, int max) {
        return (int)(Math.random() * (max-min+1) + (min));
    }
}