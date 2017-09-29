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
public class ThreadFibonacci extends Thread{
    
    public int iteraciones;

    public ThreadFibonacci(String nombre, int n){
        super(nombre);
        iteraciones=n;
    }
    
    @Override
    public void run() {
        long a=1,b=1,c=0;
        System.out.println(1);
        System.out.println(1);
        for(int i=0;i<=iteraciones;i++){
            System.out.println(a+b);
            c=a+b;
            a=b;
            b=c;        
        }
    }
    
}
