package com.techlab.articulo.menu;

import java.util.Scanner;

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
 */
public abstract class Menu {

    protected Scanner scanner;

    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

      //opciones del menu
    //cada opcion tiene asigando un numero
    // cada opcion tiene que tener un nombre
    protected String nombre;
    protected int numeroOpcion ;
    protected String mensaje;
    protected String texto;
    //la opcion menu tiene que tener un numero y nombre asociado
    public void cualidadesopcionMenu(String nombre, int numero, String mensaje,String leerTexto,String texto)
        this.nombre = nombre;
        this.numeroOpcion = numero;
        this.mensaje = mensaje;
        this.texto = texto;
    }
    
    public void accionarOpcionMenu( int numero){
    }
    //este metodo permite encapsular la logica de mandar un mensaje y que el usuario ingrese un numero
    public int leerEntero(String mensaje){
        System.out.println(mensaje);
        int entero = scanner.nextInt();
        return entero;
    }
    //este metodo permite encapsular la logica de mandar un mensaje y que el usuario ingrese un texto
    public String leerTexto(String mensaje){
      System.out.println(mensaje);
      String texto =scanner.nextLine();
      return texto;
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
