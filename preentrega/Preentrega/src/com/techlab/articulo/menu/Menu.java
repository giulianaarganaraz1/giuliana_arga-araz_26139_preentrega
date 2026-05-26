package com.techlab.articulo.menu;

import java.util.Scanner;

import javax.tools.OptionChecker;

/**
 * CONSIGNA DE ESTA CLASE
 * ------------------------------------------------------------
 * Esta debe ser la clase base de todos los menús.
 *
 * Objetivo:
 * centralizar la lógica común para no repetir código.
 *
 * Esta clase debe:
 * - guardar un Scanner compartido
 * - declarar el método mostrarMenu()
 * - declarar el método ejecutar()
 *
 * Además, podés agregar métodos protegidos reutilizables, por ejemplo:
 * - leerEntero(String mensaje)
 * - leerDouble(String mensaje)
 * - leerTexto(String mensaje)
 * - leerSiNo(String mensaje)
 *
 * IMPORTANTE:
 * Esta clase debe ser abstracta, porque no tiene sentido crear un
 * "menú genérico" instanciable. Solo debe servir como base para:
 * - MenuArticulos
 * - MenuCategorias
 * 
 */
public abstract class Menu {

    protected Scanner scanner;

    public Menu(Scanner scanner) {
        this.scanner = scanner;

    }



      //opciones del menu
    //cada opcion tiene asigando un numero
    // cada opcion tiene que tener un nombre
    //public class opcionMenu {

       // protected String nombre;
       // protected int codigoOpcion;
       // protected Runnable accion;
        

        //public opcionMenu(String nombre,int codigoOpcion,Runnable accion){
       //     this.nombre = nombre;
       //     this.codigoOpcion = codigoOpcion;
       //     this.accion=accion;
      //  }

       // public void ejecutar() {
       // accion.run(); // ejecuta lo que le pase el hijo

   // }

   
};
        
        
        

    

    //la opcion menu tiene que tener un numero y nombre asociado



    public int leerEntero(String mensaje){
        System.out.println(mensaje);
        int entero = scanner.nextInt();
        return entero;
    }

    public String leerTexto(String mensaje){
      System.out.println(mensaje);
      String texto =scanner.nextLine();
      return texto;

    }

    public double leerDouble(String mensaje){
        System.out.println(mensaje);
        double decimal= scanner.nextDouble();
        return decimal;
    }

    // TODO:
    // Declarar método abstracto para mostrar el menú.
    public abstract void mostrarMenu();

    // TODO:
    // Declarar método abstracto para ejecutar el menú.
    public abstract void ejecutar();

    // TODO:
    // Agregar métodos auxiliares de lectura segura si querés reutilizar lógica.
}
