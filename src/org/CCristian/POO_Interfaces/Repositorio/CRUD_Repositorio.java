package org.CCristian.POO_Interfaces.Repositorio;

import java.util.List;

public interface CRUD_Repositorio<T>{
    List<T> listar();     /*para LISTAR*/

    T BuscarPorId (Integer id);   /*para LEER el detalle u OBTENER por Id*/

    void Crear(T cliente);    /*CREAR un Cliente*/

    void Editar(T cliente);   /*EDITAR un Cliente*/

    void Eliminar(Integer id);  /*ELIMINAR por Id*/
}
