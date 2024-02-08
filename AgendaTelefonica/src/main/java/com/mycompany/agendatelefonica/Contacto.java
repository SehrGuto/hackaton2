package com.mycompany.agendatelefonica;

import java.util.List;

public class Contacto {
    public String nombre;
    public int telefono; 

    public Contacto() {
    }

    public Contacto(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public void aniadirContacto(List<Contacto> listaContactos, Contacto nuevoContacto) {
        listaContactos.add(nuevoContacto);    
    }
    
    public static void existeContacto(){
        
    }
    
    public static void listarContactos(List<Contacto> listaContactos){
         if (listaContactos.isEmpty()) {
            System.out.println("No hay contactos en la lista.");
        } else {
            System.out.println("Lista de contactos:");
            for (Contacto contacto : listaContactos) {
                System.out.println("Nombre: " + contacto.getNombre() + ", Teléfono: " + contacto.getTelefono());
            }
        }        
    }
    
    public static Contacto buscaContactos(List<Contacto> listaContactos, String nombre){
        for (Contacto contacto : listaContactos) {
            if (contacto.getNombre().equalsIgnoreCase(nombre)) {
                return contacto; // Retorna el contacto si se encuentra
            }
        }
        //retorna null si no encuentra el contacto
        return null;
    }
    
    public static Boolean eliminarContacto(List<Contacto> listaContactos, String nombre){
        for (Contacto contacto : listaContactos) {
            if (contacto.getNombre().equalsIgnoreCase(nombre)) {
                return contacto; // Retorna el contacto si se encuentra
            } else {
                return null;
                }
        }
        if (eliminarContacto != null) {
            listaContactos.remove(contacto);
            return true;
        } else {
            return false;
        }
    }
    
    public static Boolean agendaLlena(List<Contacto> listaContactos, int tam){
        Boolean lleno = false;
        if (listaContactos.size() > tam){
            lleno = true;
        }
        return lleno;
    }
    
    public static void espacioLibre(){
        
    }
}


