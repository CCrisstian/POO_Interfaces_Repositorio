package org.CCristian.POO_Interfaces.Modelo;

import java.util.Objects;

public class Cliente {

/*---------------------ATRIBUTOS--------------------------*/
    private Integer id;
    private String nombre;
    private String apellido;
    private static int ultimoId;
/*---------------------ATRIBUTOS--------------------------*/


/*---------------------GETTER-SETTER--------------------------*/
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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
    public Cliente() {
        this.id = ++ultimoId;
    }

    public Cliente(String nombre, String apellido) {
        this();
        this.nombre = nombre;
        this.apellido = apellido;
    }
/*---------------------CONSTRUCTOR--------------------------*/


/*---------------------MÉTODOS--------------------------*/
    @Override
    public String toString() {
        return "\nId = " + id +
                "\nNombre = " + nombre +
                "\nApellido = " + apellido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(id, cliente.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

/*---------------------MÉTODOS--------------------------*/
}
