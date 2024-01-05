package org.CCristian.POO_Interfaces.Repositorio;

import org.CCristian.POO_Interfaces.Modelo.Cliente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClienteListRepositorio implements CRUD_Repositorio,
                                            ORDENABLE_Repositorio,
                                            PAGINABLE_Repositorio
{

/*---------------------ATRIBUTOS--------------------------*/
    private List<Cliente> dataSource;
/*---------------------ATRIBUTOS--------------------------*/


/*---------------------CONSTRUCTOR--------------------------*/
    public ClienteListRepositorio() {
        this.dataSource = new ArrayList<>();
    }
/*---------------------CONSTRUCTOR--------------------------*/

/*---------------------MÉTODOS--------------------------*/
    @Override
    public List<Cliente> listar() {
        return dataSource;
    }

    @Override
    public Cliente BuscarPorId(Integer id) {
        Cliente resultado = null;
        for (Cliente cli : dataSource){
            if (cli.getId()!=null && cli.getId().equals(id)){
                resultado = cli;
                break;
            }
        }
        return resultado;
    }

    @Override
    public void Crear(Cliente cliente) {
        this.dataSource.add(cliente);
    }

    @Override
    public void Editar(Cliente cliente) {
        Cliente c = this.BuscarPorId(cliente.getId());
        c.setNombre(cliente.getNombre());
        c.setApellido(cliente.getApellido());
    }

    @Override
    public void Eliminar(Integer id) {
        Cliente c = this.BuscarPorId(id);
        dataSource.remove(c);
    }

    @Override
    public List<Cliente> listar(String campo, Direccion dir) {
        dataSource.sort((A, B) ->
                {
                    int resultado = 0;
                    if (dir == Direccion.ASC) {
                        switch (campo) {
                            case "id" -> resultado = A.getId().compareTo(B.getId());
                            case "nombre" -> resultado = A.getNombre().compareTo(B.getNombre());
                            case "apellido" -> resultado = A.getApellido().compareTo(B.getApellido());
                        }
                    } else if (dir == Direccion.DESC) {
                        switch (campo) {
                            case "id" -> resultado = B.getId().compareTo(A.getId());
                            case "nombre" -> resultado = B.getNombre().compareTo(A.getNombre());
                            case "apellido" -> resultado = B.getApellido().compareTo(A.getApellido());
                        }
                    }
                    return resultado;
                }
        );
        return dataSource;
    }

    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
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