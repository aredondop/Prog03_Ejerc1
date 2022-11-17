/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aredondo.Fechas;

/**
 *
 * @author Ángel
 */
public class Fecha{
    //Definimos todo lo que toca
    public enum enumMes{ enero,febrero,marzo,abril,mayo,junio,julio,agosto,septiembre,octubre,noviembre,diciembre }
    private int dia, anio;
    private String mes;
    
    //Los constructores
    public Fecha (enumMes mes){
        this.dia = 1;
        this.mes = mes.toString();
        this.anio = 1980;
        //Se asume el día 1 del 1980
    }
    public Fecha ( int dia, enumMes mes, int anio){
        this.dia = dia;
        this.mes = mes.toString();
        this.anio = anio;  
    }
    
    //Setters y Getters
    public void setDia( int dia){ this.dia = dia; }
    public void setMes( enumMes mes){ this.mes = mes.toString(); }
    public void setAnio( int anio){ this.anio = anio; }
    
    public int getDia(){ return dia; }
    public String getMes(){ return mes; }
    public int getAnio(){ return anio; }
    
    //Funciones auxiliares
    public boolean isSummer(){  
        boolean isSummer;
        isSummer = ( (mes=="junio" && dia>= 21) || (mes=="septiembre" && dia<= 21) || mes=="julio" || mes=="agosto"  ) ? true:false;
        return isSummer;
    }
    
    //Inspiradas en las del Ejercicio 2
    public String getFechaLarga(){
        String fechaLarga = this.getDia() + " de " + this.getMes() +" de " + this.getAnio();
        return fechaLarga;
    }
    
    public String getVerano(){
       String Verano = ( this.isSummer() == true ) ? "Es verano":"No es verano";
       return Verano;
    }
    
    
}

