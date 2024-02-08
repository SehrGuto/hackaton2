package com.mycompany.agendatelefonica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class AgendaTelefonica {

    public static void main(String[] args) {
        
        //creando un scaner para poder leer datos del teclado
        Scanner scan = new Scanner (System.in);
        
        //creando variable para recibir la decision inicial del usuario de querer crear la lista telefonica o no
        
        
        System.out.println("Deseas crear una lista telefonica? (S/N)");
        String crear = scan.next();
        
        //verificando la opcion del usuario
        if(crear.toLowerCase().equals("s")){
            System.out.println("Tenemos dos opciones: ");
            System.out.println("1. Lista estándar de 10 contactos");
            System.out.println("2. Lista personalizada");
            System.out.println("3. Salir");
            System.out.println("Por favor elige una opción: ");
            int opt1 = scan.nextInt();
            boolean salir = false;
            //analizando la opción ingresada para crear los dos tipos de listas
            switch (opt1) {
                case 1:
                    //creando lista telefonica estandar de 10 contactos
                    System.out.println("creando lista de 10 contactos");
                    
                    List<Contacto> listaContactos = new ArrayList();
                    while (!salir) {
                        //creamos el menu de opciones para el usuario despues que 
                        //la lista telefonica ya esté creada
                        System.out.println("**************************************");
                        System.out.println("1. Añadir contacto");
                        System.out.println("2. Listar contactos");
                        System.out.println("3. Buscar contacto");
                        System.out.println("4. Eliminar contacto");
                        System.out.println("5. Verificar espacios libres");
                        System.out.println("6. Salir");
                        System.out.println("**************************************");
                        System.out.println("Por favor elige una opción de 1 a 5");
                        int opt2 = scan.nextInt();
                        switch (opt2){
                            case 1:
                                if (!Contacto.agendaLlena(listaContactos, 10)){
                                //funcion para añadir contacto
                                System.out.println("Ingrese el nombre del contacto:");
                                String nombre = scan.next();
                                System.out.println("Ingrese el número de teléfono:");
                                int telefono = scan.nextInt();
                                Contacto nuevoContacto = new Contacto(nombre, telefono);
                                nuevoContacto.aniadirContacto(listaContactos, nuevoContacto);
                                // Verificar si el contacto se añadió correctamente
                                System.out.println("Contacto añadido correctamente.");
                                }else{
                                System.out.println("La lista está llena, por favor elimine un contacto");
                                }
                                break;
                            case 2:
                                //funcion para listar todos los contactos agregados
                                Contacto.listarContactos(listaContactos);
                                break;
                            case 3:
                                //funcion para buscar un contacto
                                System.out.println("Por favor ingrese el nombre buscado:");
                                String nombreABuscar = scan.next(); 
                                Contacto encontrado = Contacto.buscaContactos(listaContactos, nombreABuscar);
                                if (encontrado != null) {
                                System.out.println("Contacto encontrado:");
                                System.out.println("Nombre: " + encontrado.getNombre() + ", Teléfono: " + encontrado.getTelefono());
                                } else {
                                System.out.println("No se encontró ningún contacto con el nombre: " + nombreABuscar);
                                }
                                break;
                            case 4:
                                //funcion para eliminar un contacto
                                System.out.println("Por favor ingrese el nombre del contacto a eliminar: ");
                                String nombreAEliminar = scan.next();
                                boolean eliminado = Contacto.eliminarContacto(listaContactos, nombreAEliminar);
                                if (eliminado) {
                                    System.out.println("Se ha eliminado el contacto exitosamente!!!");
                                } else {
                                    System.out.println("No se encontro el contacto que se introdujo en la busqueda...");
                                }
                                break;
                            case 5:
                                //funcion para verificar la cantidad de espacios libres
                                System.out.println("El total de espacios libres es de: " + Contacto.espacioLibre(listaContactos, 10));
                                
                                break;
                            case 6:
                                //salir
                                salir = true;
                                System.out.println("Saliendo del sistema");
                                break;
                            default:
                                System.out.println("opción invalida - Intenta nuevamente");
                        }
                    }
                    break;
                case 2:
                    //creando lista personalizada con el tamaño indicado por el usuario
                    System.out.println("De que tamaño deseas tu lista telefónica?");
                    int tam = scan.nextInt();
                    System.out.println("Elegiste una lista para " + tam + " contactos"); 
                    List<Contacto> listaContactos2 = new ArrayList();
                    
                    while (!salir) {
                        //creamos el menu de opciones para el usuario despues que 
                        //la lista telefonica ya esté creada
                        System.out.println("**************************************");
                        System.out.println("1. Añadir contacto");
                        System.out.println("2. Listar contactos");
                        System.out.println("3. Buscar contacto");
                        System.out.println("4. Eliminar contacto");
                        System.out.println("5. Verificar espacios libres");
                        System.out.println("6. Salir");
                        System.out.println("**************************************");
                        System.out.println("Por favor elige una opción de 1 a 5");
                        int opt2 = scan.nextInt();
                        switch (opt2){
                            case 1:
                                //funcion para añadir contacto
                                 if (!Contacto.agendaLlena(listaContactos2, tam)){
                                //funcion para añadir contacto
                                System.out.println("Ingrese el nombre del contacto:");
                                String nombre = scan.next();
                                System.out.println("Ingrese el número de teléfono:");
                                int telefono = scan.nextInt();
                                Contacto nuevoContacto = new Contacto(nombre, telefono);
                                nuevoContacto.aniadirContacto(listaContactos2, nuevoContacto);
                                // Verificar si el contacto se añadió correctamente
                                System.out.println("Contacto añadido correctamente.");
                                }else{
                                System.out.println("La lista está llena, por favor elimine un contacto");
                                }
                                break;
                            case 2:
                                //funcion para listar todos los contactos agregados
                                Contacto.listarContactos(listaContactos2);
                                break;
                            case 3:
                                //funcion para buscar un contacto
                                System.out.println("Por favor ingrese el nombre buscado:");
                                String nombreABuscar = scan.next(); 
                                Contacto encontrado = Contacto.buscaContactos(listaContactos2, nombreABuscar);
                                if (encontrado != null) {
                                System.out.println("Contacto encontrado:");
                                System.out.println("Nombre: " + encontrado.getNombre() + ", Teléfono: " + encontrado.getTelefono());
                                } else {
                                System.out.println("No se encontró ningún contacto con el nombre: " + nombreABuscar);
                                }
                                break;
                            case 4:
                                //funcion para eliminar un contacto
                                System.out.println("Por favor ingrese el nombre del contacto a eliminar: ");
                                String nombreAEliminar = scan.next();
                                boolean eliminado = Contacto.eliminarContacto(listaContactos2, nombreAEliminar);
                                if (eliminado) {
                                    System.out.println("Se ha eliminado el contacto exitosamente!!!");
                                } else {
                                    System.out.println("No se encontro el contacto que se introdujo en la busqueda...");
                                }
                                break;
                            case 5:
                                //funcion para verificar la cantidad de espacios libres
                                System.out.println("El total de espacios libres es de: " + Contacto.espacioLibre(listaContactos2, tam));
                                break;
                            case 6:
                                //salir
                                salir = true;
                                System.out.println("Saliendo del sistema");
                                break;
                            default:
                                System.out.println("opción invalida - Intenta nuevamente");
                        }
                    }
                    break;
                case 3:
                    //salir
                    System.out.println("Saliendo, gracias por nada");
                    break;
                default:
                    //opcion invalida
                    System.out.println("Opción invalida - cerrando aplicación"); 
            }
        }else{
            System.out.println("saliendo del sistema");
        }       
    }
}
