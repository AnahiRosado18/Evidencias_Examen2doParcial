/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_2do_parcial;

import java.util.ArrayList;
import java.util.Scanner;
import models.Seccion;

/**
 *
 * @author lunar
 */
public class Examen_2do_Parcial {

    static ArrayList<Seccion> votantesss=new ArrayList<>();
    static Scanner entradaDato=new Scanner(System.in);
    
    
    public static void llenar(){
        System.out.println("Registro de id: ");
        int id=entradaDato.nextInt();
        System.out.println("Registro de nombre: ");
        String nombre=entradaDato.next();
        System.out.println("Registro de latitud: ");
        double latitud= entradaDato.nextDouble();
        System.out.println("Registro de longitud: ");
        double longitud=entradaDato.nextDouble();
        System.out.println("Registro de municipio: ");
        int municipio =entradaDato.nextInt();
        System.out.println("Registro de distrito: ");
        int distrito=entradaDato.nextInt();
        System.out.println("Registro de listado: ");
        int listado =entradaDato.nextInt();
        System.out.println("Registro de votantes: ");
        int votantess =entradaDato.nextInt();
        votantesss.add(new Seccion(id,nombre,latitud,longitud,municipio,distrito,listado,votantess));
        System.out.println(votantesss.toString());
        porcentajeParticipaciónReal();
    }
    
    public static void porcentajeParticipaciónReal(){
        int votantess=votantesss.get(0).getVotantes();
        int listado= votantesss.get(0).getListado();
        double porcentaje = ((votantess/listado)*(100));
        System.out.println("Asistieron: "+porcentaje);
        faltantes(votantess,listado);
    }
    
    public static void faltantes(int votantess, int listado){
        int faltantes= (listado-votantess);
        System.out.println("Faltaron: "+faltantes);
        
        porAbstinencia(votantess,listado);
    }
    
    public static void porAbstinencia(int votantess, int listado){
        int operacion1= listado-votantess;
        double abstinencia = ((operacion1/listado)*100);
        System.out.println("Hubo una abstinencia de: "+abstinencia);
    }
    
    
   
    
    
    public static void main(String[] args) {
        llenar();
        
    }
    
}
