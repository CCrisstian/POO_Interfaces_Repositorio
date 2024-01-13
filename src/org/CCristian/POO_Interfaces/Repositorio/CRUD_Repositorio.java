package org.CCristian.POO_Interfaces.Repositorio;

import java.util.List;

public interface CRUD_Repositorio<T>{
    List<T> listar();     /*para LISTAR un tipo genérico t*/

    T BuscarPorId (Integer id);   /*para LEER el detalle u OBTENER por Id*/

    void Crear(T t);    /*CREAR un tipo genérico t*/

    void Editar(T t);   /*EDITAR un tipo genérico t*/

    void Eliminar(Integer id);  /*ELIMINAR por Id*/
}
