package org.CCristian.GenericsCLASS;

public class Animal {

/*-------------------ATRIBUTOS-----------------------*/
    private String nombre;
    private String tipo;
/*-------------------ATRIBUTOS-----------------------*/


/*-------------------CONSTRUCTOR-----------------------*/
    public Animal(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }
/*-------------------CONSTRUCTOR-----------------------*/


/*-------------------GETTER-----------------------*/
    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }
/*-------------------GETTER-----------------------*/
}
