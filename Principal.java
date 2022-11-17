/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aredondo.Fechas;

/**
 *
 * @author Ángel
 */
public class Principal {
    
    
    public static void main(String[] args) {
        //Empezamos con el ejercicio. Fecha 1
        Fecha objFecha1 = new Fecha(Fecha.enumMes.febrero);
        System.out.println("Primera fecha, inicializada con el primer constructor");
        
        objFecha1.setDia(20); //Añadimos el día
        objFecha1.setAnio(2000); //Añadimos el año
        
        System.out.println("La fecha es: " + objFecha1.getFechaLarga() );
        System.out.println(objFecha1.getVerano() + "\r");
        
        //Seguimos. Fecha 2
        Fecha objFecha2 = new Fecha(15, Fecha.enumMes.julio, 2015);
        System.out.println("Segunda fecha, inicializada con el segundo constructor");
        System.out.println("La fecha 2 contiene el anio "+ objFecha2.getAnio() );
        System.out.println("La fecha es: " + objFecha2.getFechaLarga() );
        System.out.println(objFecha2.getVerano() );
    }

}
