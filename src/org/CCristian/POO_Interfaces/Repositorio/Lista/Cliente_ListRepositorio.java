package org.CCristian.POO_Interfaces.Repositorio.Lista;

import org.CCristian.POO_Interfaces.Modelo.Cliente;
import org.CCristian.POO_Interfaces.Repositorio.ABASTRACTA_ListRepositorio;
import org.CCristian.POO_Interfaces.Repositorio.Direccion;

import java.util.ArrayList;
import java.util.List;

public class Cliente_ListRepositorio extends ABASTRACTA_ListRepositorio<Cliente> {

/*---------------------MÉTODOS--------------------------*/
    @Override
    public void Editar(Cliente cliente) {
        Cliente c = this.BuscarPorId(cliente.getId());
        c.setNombre(cliente.getNombre());
        c.setApellido(cliente.getApellido());
    }

    @Override
    public List<Cliente> listar(String campo, Direccion dir){
        List<Cliente> ListaOrdenada = new ArrayList<>(this.dataSource);
        ListaOrdenada.sort((a, b) -> {
            int resultado = 0;
            if (dir == Direccion.ASC) {
                resultado = ordenar(campo, a, b);
            } else if (dir == Direccion.DESC) {
            resultado = ordenar(campo, b, a);
            }
            return resultado;
        });

        return ListaOrdenada ;}

    public static int ordenar (String campo, Cliente a, Cliente b){
        int resultado = 0;
        switch (campo) {
            case "id" -> resultado = a.getId().compareTo(b.getId());
            case "nombre" -> resultado = a.getNombre().compareTo(b.getNombre());
            case "apellido" -> resultado = a.getApellido().compareTo(b.getApellido());
        }
        return resultado;
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