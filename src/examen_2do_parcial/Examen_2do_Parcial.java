/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_2do_parcial;

import java.util.ArrayList;
import models.Seccion;

/**
 *
 * @author lunar
 */
public class Examen_2do_Parcial {

    static ArrayList<Seccion> votantesss=new ArrayList<>();
    
    public static void llenar(){
        System.out.println("Registro: ");
        votantesss.add(new Seccion(1,"01",13.12864,90.87235,1,1,3400,450));
        System.out.println(votantesss.toString());
    }
    
    public static void porcentajeParticipaciónReal(int votantes, int listado ){
        double porcentaje = ((votantes/listado)*100);
        System.out.println("Asistieron: "+porcentaje);
    }
    
    public static void faltantes(int votantes, int listado){
        int faltantess= (listado-votantes);
        System.out.println("Faltaron: "+faltantess);
        int abstinencia = ((faltantess/listado)*100);
        System.out.println("Hubo una abstinencia de: "+abstinencia);
        
    }
    
    
   
    
    
    public static void main(String[] args) {
        llenar();
        porcentajeParticipaciónReal(450,3400);
        faltantes(450,3400);
    }
    
}
