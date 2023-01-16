
package com.mycompany.ejercicios_tema8;
/*
Crear clase Persona.
Crear variables las privadas edad, nombre y telefono de la clase Persona.
Crear gets y sets de cada propiedad.
Crear un objeto persona en el main.
Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.
*/
public class Main {
    public static void main (String[] args){
        Persona persona_1 = new Persona();
        persona_1.setEdad(25);
        persona_1.setNombre("Jorge");
        persona_1.setTelefono("223 4 12 3456");
        
        System.out.println("Edad: "+ persona_1.getEdad()+ ", Nombre: "+ persona_1.getNombre()+ ", Telefono: " + persona_1.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }    
}
