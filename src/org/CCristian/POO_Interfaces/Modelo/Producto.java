package org.CCristian.POO_Interfaces.Modelo;

public class Producto extends BaseEntity{

/*---------------------ATRIBUTOS--------------------------*/
    private String descripcion;
    private Double precio;
/*---------------------ATRIBUTOS--------------------------*/


/*---------------------GETTER-SETTER--------------------------*/
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
/*---------------------GETTER-SETTER--------------------------*/


/*---------------------CONSTRUCTOR--------------------------*/
    public Producto(String descripcion, Double precio) {
        super(); /*Necesario para asignar un id*/
        this.descripcion = descripcion;
        this.precio = precio;
    }
/*---------------------CONSTRUCTOR--------------------------*/


/*---------------------MÉTODOS--------------------------*/
    @Override
    public String toString() {
          return "Descripción: '" + descripcion +"'"+
                "\nPrecio: $" + precio +
                "\nId: '" + id +"'";
    }
/*---------------------MÉTODOS--------------------------*/

}
