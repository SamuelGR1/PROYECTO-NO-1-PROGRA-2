/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1;

import java.text.DecimalFormat;
import java.util.ArrayList;

import java.util.List;
import java.util.Random;

/**
 *
 * @author DELL
 */
public class Lista {
    


public static void main (String[]args){
     
     
        
        
         List<ClsVendedores> misEmp = new ArrayList();  // crear un Arreglo de lista donde setarán almacenados los datos
      
        ClsVendedores ven = new ClsVendedores();
   
        
        ven.setNombre("JOSUE");
        ven.setEnero(ran());
        ven.setFebrero(ran());
        ven.setMarzo(ran());
        misEmp.add(ven);
        
        ven=new ClsVendedores();
        ven.setNombre("EDUARDO");
        ven.setEnero(ran());
        ven.setFebrero(ran());
        ven.setMarzo(ran());
        misEmp.add(ven);
 
        
        ven = new ClsVendedores();
        ven.setNombre("ANAHI");
        ven.setEnero(ran());
        ven.setFebrero(ran());
        ven.setMarzo(ran());
        misEmp.add(ven);
        
        
        ven = new ClsVendedores();
        ven.setNombre("JENNI");
        ven.setEnero(ran());
        ven.setFebrero(ran());
        ven.setMarzo(ran());
        misEmp.add(ven);
        
        ven = new ClsVendedores();
        ven.setNombre("JAIME");
        ven.setEnero(ran());
        ven.setFebrero(ran());
        ven.setMarzo(ran());
        misEmp.add(ven);
        
        ven = new ClsVendedores();
        ven.setNombre("SAMUEL");
        ven.setEnero(ran());
        ven.setFebrero(ran());
        ven.setMarzo(ran());
        misEmp.add(ven);
        
        
        ven = new ClsVendedores();
        ven.setNombre("ANDREW");
        ven.setEnero(ran());
        ven.setFebrero(ran());
        ven.setMarzo(ran());
        misEmp.add(ven);
        
        ven = new ClsVendedores();
        ven.setNombre("RULDIN");
        ven.setEnero(ran());
        ven.setFebrero(ran());
        ven.setMarzo(ran());
        misEmp.add(ven);
        
          
          double sumaEnero = 0;
          double Totalventas=0;
          double sumaFebrero =0;
          double sumaMarzo=0;
          double tv=0;
          double com=0;
          double comi=0;
          double isr=0;
          double Total_vc=0;
          double Liquidacion=0;
       
        for (ClsVendedores v : misEmp){
           System.out.print("Nombre :"+v.getNombre()+"\t\t");        
           System.out.print("Enero : "+v.getEnero()+"\t\t");
           System.out.print("Febrero : "+v.getFebrero()+"\t\t");
           System.out.print("Marzo: "+v.getMarzo()+"\t\t");
        

           sumaEnero = sumaEnero +v.getEnero();
           sumaFebrero = sumaFebrero +v.getFebrero();
           sumaMarzo = sumaMarzo +v.getMarzo();
           
           tv=v.getEnero()+v.getFebrero()+v.getMarzo();
           com=tv*0.25;
           Total_vc=com+tv;
           isr=Total_vc *0.05;
           Liquidacion=Total_vc-isr;
           
           System.out.print("Total_vts: "+(tv)+"\t\t");
           System.out.print("com: "+(com)+"\t\t");
           System.out.print("Total_VC: "+(tv+com)+"\t\t");
           System.out.print("isr: "+(isr)+"\t\t");
           System.out.println("Liq: "+(Liquidacion)+"\t\t");
  
            }

        System.out.println("suma de Enero: "+d.format  (sumaEnero )+"\t\t");
           System.out.println("suma de Febrero : "+d.format  (sumaFebrero )+"\t\t");
           System.out.println("suma de Marzo: "+d.format  (sumaMarzo)+"\t\t");

        Totalventas=sumaEnero+sumaFebrero+sumaMarzo;
       System.out.println("TOTAL DE VENTAS: "+ (sumaEnero+sumaFebrero+sumaMarzo));
                           
        
    }



 public static int ran (){
         int random=0;
         int num = (int) (Math.random()*1000+1);
         return num;
    }
       private static  DecimalFormat d = new DecimalFormat("###.##");




}
