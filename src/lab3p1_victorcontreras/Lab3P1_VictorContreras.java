/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_victorcontreras;
import java.util.Scanner;
/**
 *
 * @author victo
 */
public class Lab3P1_VictorContreras {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        do {
        System.out.println(" Bienvenido ");
        System.out.println(" 1. Potencia ");
        System.out.println(" 2. Sumatoria");
        System.out.println(" 3. Time Clock");
        System.out.println(" 4. Salir");
        opcion = leer.nextInt();
        
        switch (opcion) {
            
            case 1:
                System.out.println(" Ingrese la base: ");
                int base = leer.nextInt();
                System.out.println("Ingrese el exponente: ");
                int expo = leer.nextInt();
                int respuesta =1 * base;
                if (expo == 0) {
                    respuesta = 1;
                    System.out.println(respuesta);
                    break;
                }
                for (int i = 1; i < expo; i++) {
                    respuesta *= base;
                }
                System.out.println(respuesta);
                if (expo == 0) {
                    respuesta = 1;
                    System.out.println(respuesta);
                }
                break;
            case 2:
                System.out.println("Sumatoria");
                System.out.println(" Ingrese un numero limite: ");
                double num = leer.nextInt();
                if (num < 0) {
                    System.out.println(" Ingrese un numero positivo");   
                    System.out.println(" Ingrese un numero limite: ");
                    num = leer.nextInt();
                }
                double funcion = 0;
                double n =0;
                   for (int i = 0; i < num; i++) {
                   double arriba = Math.pow(-1, n);
                   double abajo = 2*(n)+1;
                   funcion += 4*((arriba)/(abajo)); 
                   n++;
                   }
                   System.out.println("Resultado: "+ funcion);
                
                break;
                
            case 3:
                System.out.println(" Ingrese un tamaño impar");
                int impar = leer.nextInt();
                if (impar %2 == 0) {
                    System.out.println("Debe ser un numero impar");
                    System.out.println(" Ingrese numero impar:");
                    impar = leer.nextInt();
                }
                for (int i = 0; i < impar/2 +1; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j < impar -2 * i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                for (int i = impar/2 -1; i >=0; i--) {
                    for (int j = 0; j < i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j < impar - 2 * i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            }
        }while(opcion != 4);
        
    }
    
}
