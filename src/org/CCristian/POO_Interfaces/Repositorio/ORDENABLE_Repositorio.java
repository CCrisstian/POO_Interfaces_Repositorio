package org.CCristian.POO_Interfaces.Repositorio;

import java.util.List;

public interface ORDENABLE_Repositorio<T>{

    List<T> listar(String campo, Direccion dir);
    /*Se pasa el 'nombre' o 'campo' por el cual se quiere ordenar*/

}
