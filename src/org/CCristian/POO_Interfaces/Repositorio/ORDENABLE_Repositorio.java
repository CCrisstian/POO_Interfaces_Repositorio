package org.CCristian.POO_Interfaces.Repositorio;

import org.CCristian.POO_Interfaces.Modelo.Cliente;

import java.util.List;

public interface ORDENABLE_Repositorio {

    List<Cliente> listar(String campo, Direccion dir);
    /*Se pasa el 'nombre' o 'campo' por el cual se quiere ordenar*/

}
