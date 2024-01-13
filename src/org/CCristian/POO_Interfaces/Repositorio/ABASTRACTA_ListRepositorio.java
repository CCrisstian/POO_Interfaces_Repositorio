package org.CCristian.POO_Interfaces.Repositorio;

import org.CCristian.POO_Interfaces.Modelo.BaseEntity;

import java.util.ArrayList;

import java.util.List;

public abstract class ABASTRACTA_ListRepositorio<T extends BaseEntity> implements ORDENABLE_PAGINABLE_CRUD_Repositorio<T> {

/*---------------------ATRIBUTOS--------------------------*/
    protected List<T> dataSource;
/*---------------------ATRIBUTOS--------------------------*/


/*---------------------CONSTRUCTOR--------------------------*/
    public ABASTRACTA_ListRepositorio() {
        this.dataSource = new ArrayList<>();
    }
/*---------------------CONSTRUCTOR--------------------------*/


/*---------------------MÉTODOS--------------------------*/
    @Override
    public List<T> listar() {
        return dataSource;
    }

    @Override
    public T BuscarPorId(Integer id) {
        T resultado = null;
        for (T cli : dataSource){
            if (cli.getId()!=null && cli.getId().equals(id)){
                resultado = cli;
                break;
            }
        }
        return resultado;
    }

    @Override
    public void Crear(T t) {
        this.dataSource.add(t);
    }



    @Override
    public void Eliminar(Integer id) {
        this.dataSource.remove(this.BuscarPorId(id));
    }



    @Override
    public List<T> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }



    @Override
    public String total() {
        return "Cantidad de elementos de la lista: "+ this.dataSource.size();
    }

/*---------------------MÉTODOS--------------------------*/

}

/*En Java, el método sort se utiliza para ordenar elementos en un arreglo o una lista en un orden específico.
Este método es parte de la clase Arrays para arreglos y de la interfaz List para listas.*/

/*En Java, la interfaz Comparator se utiliza para proporcionar una forma de ordenar elementos de una
colección. Es una interfaz funcional que contiene un único método llamado compare. Esta interfaz es parte del paquete
java.util y se utiliza principalmente junto con el método sort de las colecciones (como listas) para definir un orden personalizado.

El método 'compare' toma dos objetos (o1 y o2) y devuelve un valor entero que indica cómo deben ordenarse entre sí. La convención es la siguiente:

Si compare devuelve un valor negativo, significa que o1 debe ir antes que o2 en el orden.
Si devuelve cero, significa que o1 y o2 son iguales en términos de orden.
Si devuelve un valor positivo, significa que o1 debe ir después de o2 en el orden.*/