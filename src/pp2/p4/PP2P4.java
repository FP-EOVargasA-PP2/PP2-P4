/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.p4;
import java.util.Scanner;
/**
 *
 * @author osiri
 */
public class PP2P4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracion
        float c;
        //Procedimiento
        c = pedir();
        mostrar (c);
    }
    public static float pedir (){
        float c;
        Scanner teclado = new Scanner (System.in);
        System.out.println("*****   Temperaturas   *****");
        System.out.println("Introduce la temperatura en grados celcius");
        c = teclado.nextFloat();
        return c;
    }
    public static void mostrar (float c){
        System.out.println("La conversion a grados Farenheid es "+(1.8*c+32));
    }
}
