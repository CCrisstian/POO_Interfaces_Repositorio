package org.CCristian.POO_Interfaces.Modelo;

import java.util.Objects;

public class Cliente extends BaseEntity{

/*---------------------ATRIBUTOS--------------------------*/
    private String nombre;
    private String apellido;
/*---------------------ATRIBUTOS--------------------------*/


/*---------------------GETTER-SETTER--------------------------*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
/*---------------------GETTER-SETTER--------------------------*/


/*---------------------CONSTRUCTOR--------------------------*/
    public Cliente(String nombre, String apellido) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
    }
/*---------------------CONSTRUCTOR--------------------------*/


/*---------------------MÉTODOS--------------------------*/
    @Override
    public String toString() {
        return "-----------------------------------------------------\n"+
                "Id: " + id +
                "\tNombre: '" + nombre + "'" +
                "\tApellido: '" + apellido + "'";
    }
/*---------------------MÉTODOS--------------------------*/
}
