package org.CCristian.POO_Interfaces.Repositorio;

import org.CCristian.POO_Interfaces.Modelo.Cliente;

import java.util.List;

public interface CRUD_Repositorio  {
    List<Cliente> listar();     /*para LISTAR*/

    Cliente BuscarPorId (Integer id);   /*para LEER el detalle u OBTENER por Id*/

    void Crear(Cliente cliente);    /*CREAR un Cliente*/

    void Editar(Cliente cliente);   /*EDITAR un Cliente*/

    void Eliminar(Integer id);  /*ELIMINAR por Id*/
}
