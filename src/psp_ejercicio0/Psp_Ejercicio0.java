/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psp_ejercicio0;

/**
 *
 * @author otorradomiguez
 */
public class Psp_Ejercicio0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ThreadFibonacci tb=new ThreadFibonacci("Fibonacci",50);
        tb.start();
        while(tb.isAlive()){
        }
        System.out.println("Mostrados los "+tb.iteraciones+" primeros numeros de Fibonacci");
    }
    
}
