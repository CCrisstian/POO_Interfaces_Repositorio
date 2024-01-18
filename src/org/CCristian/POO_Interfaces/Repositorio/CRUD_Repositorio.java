package org.CCristian.POO_Interfaces.Repositorio;

import org.CCristian.POO_Interfaces.Repositorio.EXCEPCIONES.AccesoDatoEXCEPTION;
import org.CCristian.POO_Interfaces.Repositorio.EXCEPCIONES.Escritura_AccesoDatoEXCEPTION;
import org.CCristian.POO_Interfaces.Repositorio.EXCEPCIONES.Lectura_AccesoDatoEXCEPTION;

import java.util.List;

public interface CRUD_Repositorio<T>{
    List<T> listar();     /*para LISTAR un tipo genérico t*/

    T BuscarPorId (Integer id) throws AccesoDatoEXCEPTION;   /*para LEER el detalle u OBTENER por Id*/

    void Crear(T t) throws AccesoDatoEXCEPTION;    /*CREAR un tipo genérico t*/

    void Editar(T t) throws AccesoDatoEXCEPTION;   /*EDITAR un tipo genérico t*/

    void Eliminar(Integer id) throws AccesoDatoEXCEPTION;    /*ELIMINAR por Id*/
}
