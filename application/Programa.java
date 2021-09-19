package application;

import entities.Triangulo;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Instanciando objetos triângulo x e Y
        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();


        //Recebendo dados de entrada referente às medidas dos lados do triângulo
        System.out.println("Entre com as medidas do triângulo X: ");
        x.ladoA = teclado.nextDouble();
        x.ladoB = teclado.nextDouble();
        x.ladoC = teclado.nextDouble();

        System.out.println("Entre com as medidas do triângulo Y: ");
        y.ladoA = teclado.nextDouble();
        y.ladoB = teclado.nextDouble();
        y.ladoC = teclado.nextDouble();

        double p = (x.ladoA + x.ladoB + x.ladoC) / 2;
        double areaX = Math.sqrt(p * (p - x.ladoA) * (p - x.ladoB) * (p - x.ladoC));

        p = (y.ladoA + y.ladoB + y.ladoC) / 2;
        double areaY = Math.sqrt(p * (p - y.ladoA) * (p - y.ladoB) * (p - y.ladoC));

        System.out.printf("Área do triângulo X : %.2f%n", areaX);
        System.out.printf("Área do triângulo Y : %.2f%n", areaY);

        if (areaX > areaY){
            System.out.println("O triângulo X tem área maior");
        }else{
            System.out.println("O triângulo Y tem a área maior");
        }


    }
}
